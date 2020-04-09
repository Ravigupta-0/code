package com.spring.SpringRest.Advertise;

public class Adverstise {
	private String title;
	private String Status;
	private String message;
	private String postId;
	private String category;
	private String description;
	public Adverstise(String title, String status, String message, String postId, String category, String description) {
		super();
		this.title = title;
		Status = status;
		this.message = message;
		this.postId = postId;
		this.category = category;
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Adverstise [title=" + title + ", Status=" + Status + ", message=" + message + ", postId=" + postId
				+ ", category=" + category + ", description=" + description + "]";
	}
	
}
