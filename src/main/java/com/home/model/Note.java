package com.home.model;

import java.time.LocalDate;

public class Note {
	private String title;
	private String content;
	private LocalDate publishDate;
	
	Note(String title, String content, LocalDate publishDate) {
		this.title = title;
		this.content = content;
		this.publishDate = publishDate;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public LocalDate getPublishDate() {
		return this.publishDate;
	}
}
