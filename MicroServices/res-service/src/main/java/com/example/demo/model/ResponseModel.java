package com.example.demo.model;

public class ResponseModel {
	private String name;
	private int contact;
	private int rating;
	private String resId;
	private String location;
	private String co_ordinates;

	public ResponseModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public ResponseModel(String name, int contact, int rating, String resId,String location,String co_ordinates) {
		super();
		this.name = name;
		this.contact = contact;
		this.rating = rating;
		this.resId = resId;
		this.location=location;
		this.co_ordinates=co_ordinates;

	}

	public String getCo_ordinates() {
		return co_ordinates;
	}

	public void setCo_ordinates(String co_ordinates) {
		this.co_ordinates = co_ordinates;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

}
