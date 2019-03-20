package fr.nedjma.universite.note.repository;

import java.util.List;

import fr.nedjma.universite.note.domain.Note;
import fr.nedjma.universite.note.domain.NotePK;

public interface INoteRepository {

	Note save(Note note);

	List<Note> findAll();

	Note getOne(NotePK npk);

}
