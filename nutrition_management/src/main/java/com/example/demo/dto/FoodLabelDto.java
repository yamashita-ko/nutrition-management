package com.example.demo.dto;

import java.io.Serializable;

public class FoodLabelDto implements Serializable {
	private Integer id;
	private String name;
	private String nameJP;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameJP() {
		return nameJP;
	}
	public void setNameJP(String nameJP) {
		this.nameJP = nameJP;
	}
}
