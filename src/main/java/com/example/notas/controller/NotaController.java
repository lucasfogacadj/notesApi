package com.example.notas.controller;

import com.example.notas.model.Note;
import com.example.notas.repository.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class NotaController {

    @Autowired
    NoteRepository noteRepository;
//Recuperar todas as notas
    @GetMapping("/notes")
    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    @PostMapping("/notes")
    public Note createNote(@Valid @RequestBody Note note){
        return noteRepository.save(note);
    }

}
