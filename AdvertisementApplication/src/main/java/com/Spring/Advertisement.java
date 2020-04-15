package com.Spring;

public class Advertisement {

	private String postId;
	private String status;
	private String title;
	private String name;
	private String Category;
	private String description;
	
	public Advertisement() {}

	public Advertisement(String title, String name, String category, String description) {
		super();
		this.title = title;
		this.name = name;
		Category = category;
		this.description = description;
	}

	public Advertisement(String postId, String status, String title, String name, String category, String description) {
		super();
		this.postId = postId;
		this.status = status;
		this.title = title;
		this.name = name;
		Category = category;
		this.description = description;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Advertisement [postId=" + postId + ", status=" + status + ", title=" + title + ", name=" + name
				+ ", Category=" + Category + ", description=" + description + "]";
	}
	
	
}
