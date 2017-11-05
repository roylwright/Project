package com.claim.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="post")
public class Post {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="email")
	private String email;
	@Column(name="message")
	private String message;
	@Column(name="picture")
	private String picture;
	@CreationTimestamp
	@Column(name="created_date")
	private Timestamp createdDate;
	
	@OneToOne
	@JoinColumn(name="email", insertable=false, updatable=false)
	private Person person;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public Timestamp getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

}
