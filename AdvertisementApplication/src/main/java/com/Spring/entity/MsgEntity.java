package com.Spring.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="message_master")
public class MsgEntity
{
	
	public MsgEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public MsgEntity(long id, String postId, String message) {
		super();
		this.id = id;
		this.postId = postId;
		this.message = message;
	}
	public MsgEntity( String postId, String message) {
		super();
	 	this.postId = postId;
		this.message = message;
	}
	public MsgEntity(  String message) {
		super();
 		this.message = message;
	}
	


	@Id
	@GeneratedValue
	@Column(name="Id")
	private long id;
	
	private String postId;
	
	private String message;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPostId() {
		return postId;
	}

	public void setPostId(String postId) {
		this.postId = postId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [id=" + id + ", postId=" + postId + ", message=" + message + "]";
	}
	
	

}
