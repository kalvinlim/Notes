package com.activemeasure.controller;

import com.activemeasure.domain.Note;
import com.activemeasure.domain.User;
import com.activemeasure.service.NotesService;
import com.activemeasure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController("/api")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @Autowired
    private UserService userService;

    @PostMapping("/notes/getall")
    public @ResponseBody Iterable<Note> getUserNotes(@RequestParam String email, @RequestParam String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        return notesService.getAllUserNotes(user);
    }

    @PostMapping("notes/delete")
    public void deleteUserNote(@RequestParam String email, @RequestParam String password, Long id){
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        notesService.deleteNote(user, id);
    }

    @PostMapping("/notes/create")
    public void createNote(@RequestParam String email, @RequestParam String password, @RequestParam String title, @RequestParam String text) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        Note note = new Note();
        note.setTitle(title);
        note.setNote(text);
        note.setCreateTime(LocalDate.now());
        note.setEmail(email);

        notesService.createNote(user, note);
    }

}