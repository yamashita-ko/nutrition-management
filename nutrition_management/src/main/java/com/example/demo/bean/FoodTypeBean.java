package com.example.demo.bean;

import java.io.Serializable;

public class FoodTypeBean implements Serializable {
	private Long foodTypeId;
	private String name;
	
	public Long getFoodTypeId() {
		return foodTypeId;
	}
	public void setFoodTypeId(Long foodTypeId) {
		this.foodTypeId = foodTypeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
