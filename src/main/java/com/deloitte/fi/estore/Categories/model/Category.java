package com.deloitte.fi.estore.Categories.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="categories")
public class Category {
	@Id
	private String id;
	private String title;
	
	/*public Category(String id, String title) {
		super();
		this.id = id;
		this.title = title;
	}*/
	public String getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Category [id=" + id + ", title=" + title + "]";
	}
}
