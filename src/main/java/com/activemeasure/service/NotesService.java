package com.activemeasure.service;

import com.activemeasure.domain.Note;
import com.activemeasure.domain.User;
import com.activemeasure.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Optional;

@Service
public class NotesService {
    @Autowired
    private NotesRepository notesRepository;

    @Autowired
    private UserService userService;

    public void createNote(User user, Note note){
        if(userService.authenticate(user.getEmail(), user.getPassword())){
            notesRepository.save(note);
        }
    }

    public void updateNote(User user, Note note){
        if(userService.authenticate(user.getEmail(), user.getPassword())){
            Optional<Note> noteToUpdate = notesRepository.findById(note.getId());
            if(noteToUpdate.isPresent() && noteToUpdate.get().getEmail().equals(user.getEmail())){ // You must own the note id and it must be present to update
                note.setCreateTime(noteToUpdate.get().getCreateTime()); //maintain create time
                notesRepository.save(note);
            }
        }
    }

    public void deleteNote(User user, Long id){
        if(userService.authenticate(user.getEmail(), user.getPassword())){
            Optional<Note> noteToDelete = notesRepository.findById(id);
            if(noteToDelete.isPresent() && noteToDelete.get().getEmail().equals(user.getEmail())){ //You must own the note id and it must be present to delete
                notesRepository.deleteById(id);
            }
        }
    }

    public Iterable<Note> getAllUserNotes(User user){
        if(userService.authenticate(user.getEmail(), user.getPassword())){
            return notesRepository.findByEmail(user.getEmail());
        }
        return Collections.EMPTY_LIST;
    }
}
