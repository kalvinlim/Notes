package com.activemeasure.controller;

import com.activemeasure.domain.Note;
import com.activemeasure.domain.User;
import com.activemeasure.service.NotesService;
import com.activemeasure.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController("/api")
public class NotesController {

    @Autowired
    private NotesService notesService;

    @Autowired
    private UserService userService;

    @PostMapping("/notes")
    public @ResponseBody Iterable<Note> getUserNotes(@RequestParam String email, @RequestParam String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);

        return notesService.getAllUserNotes(user);
    }

}