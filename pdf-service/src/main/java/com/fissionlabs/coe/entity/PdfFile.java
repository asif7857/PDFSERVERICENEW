package com.fissionlabs.coe.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "data_file")
@Entity
public class PdfFile {

	 @Id
	 @GeneratedValue(strategy =  GenerationType.IDENTITY)
	private long id;
	
	 @Column(name = "content")
	private String content;
	 
	 

	public PdfFile(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}

	public PdfFile() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	 
	
}
