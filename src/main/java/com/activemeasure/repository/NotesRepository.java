package com.activemeasure.repository;

import com.activemeasure.domain.Note;
import org.springframework.data.repository.CrudRepository;

public interface NotesRepository extends CrudRepository<Note, Long> {
    Iterable<Note> findByEmail(String email);
}
