package kz.sameclone.restexample.examplenotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kz.sameclone.restexample.examplenotes.model.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}