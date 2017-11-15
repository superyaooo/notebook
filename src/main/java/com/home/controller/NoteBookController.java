package com.home.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.home.model.Note;

@RestController
@RequestMapping("api/")
public class NoteBookController {
	
	@RequestMapping(value = "notes", method = RequestMethod.GET)
	public List<Note> list() {
		return NotebookStub.list();
	}
	
	@RequestMapping(value = "notes", method = RequestMethod.POST)
	public Note create(@RequestBody Note note) {
		return NotebookStub.create(note);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.GET)
	public Note get(@PathVariable Long id) {
		return NotebookStub.get(id);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.PUT)
	public Note update(@PathVariable Long id, @RequestBody Note note) {
		return NotebookStub.update(id, note);
	}
	
	@RequestMapping(value = "notes/{id}", method = RequestMethod.DELETE)
	public Note delete(@PathVariable Long id) {
		return NotebookStub.delete(id);
	}
}
