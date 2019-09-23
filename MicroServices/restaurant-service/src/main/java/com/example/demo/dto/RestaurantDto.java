package com.example.demo.dto;

import java.util.HashSet;
import java.util.Set;
import com.example.demo.entity.Food;

public class RestaurantDto {
	private String name;
	private int contact;
	private int rating;
	private String resId;
	private Set<Food> foods = new HashSet<>();
	
	public RestaurantDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RestaurantDto(String name, int contact, int rating, String resId, Set<Food> foods) {
		super();
		this.name = name;
		this.contact = contact;
		this.rating = rating;
		this.resId = resId;
		this.foods = foods;
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

	

	public String getResId() {
		return resId;
	}

	public void setResId(String resId) {
		this.resId = resId;
	}

	public Set<Food> getFoods() {
		return foods;
	}

	public void setFoods(Set<Food> foods) {
		this.foods = foods;
	}

	
	
}
