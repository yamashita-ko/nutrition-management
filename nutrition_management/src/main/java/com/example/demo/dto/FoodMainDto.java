package com.example.demo.dto;

import java.io.Serializable;

public class FoodMainDto implements Serializable {
	private Long foodTypeId;
    private Long foodMainId;
    private String name;
    private String image;

	public Long getFoodTypeId() {
		return foodTypeId;
	}
	public void setFoodTypeId(Long foodTypeId) {
		this.foodTypeId = foodTypeId;
	}
	public Long getFoodMainId() {
		return foodMainId;
	}
	public void setFoodMainId(Long foodMainId) {
		this.foodMainId = foodMainId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
}
