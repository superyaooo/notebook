package com.home.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.joda.time.LocalDate;

import com.home.model.Note;

public class NotebookStub {
	private static Map<Long, Note> notes = new HashMap<>();
	private static Long idIndex = 3L;
	
	static {
		Note a = new Note(1L, "Note 1", "This is my first note.", new LocalDate(2017, 11, 13).toString());
		notes.put(1L, a);
		Note b = new Note(2L, "2nd Note", "This is my second note.", new LocalDate(2017, 11, 03).toString());
		notes.put(2L, b);
	}
	
	public static List<Note> list() {
		return new ArrayList<Note>(notes.values());
	}
	
	public static Note create(Note note) {
		idIndex += idIndex;
		note.setId(idIndex);
		notes.put(idIndex, note);
		return note;
	}
	
	public static Note get(Long id) {
		return notes.get(id);
	}
	
	public static Note update(Long id, Note note) {
		notes.put(id, note);
		return note;
	}
	
	public static Note delete(Long id) {
		return notes.remove(id);
	}
}
