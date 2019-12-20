package com.school;

public class Course {
	private String name;
	private String book;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Course(String name, String book, String id) {
		super();
		this.name = name;
		this.book = book;
		this.id = id;
	}
	public Course() {
		super();
		// TODO 自动生成的构造函数存根
	}
	
	

}
