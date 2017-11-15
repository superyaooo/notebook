package com.home.model;

public class Note {
	private Long id;
	private String title;
	private String content;
	private String publishDate;
	
	public Note(Long id, String title, String content, String publishDate) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.publishDate = publishDate;
	}
	
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getContent() {
		return this.content;
	}
	
	public String getPublishDate() {
		return this.publishDate;
	}
}
