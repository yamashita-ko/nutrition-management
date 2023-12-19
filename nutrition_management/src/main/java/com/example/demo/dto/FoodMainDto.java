package com.example.demo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.bean.FoodMainBean;

public class FoodMainDto implements Serializable {
	private ArrayList<FoodMainBean> list;
	
	public FoodMainDto() {
		list = new ArrayList<FoodMainBean>();
	}
	public void add (FoodMainBean bean) {
		list.add(bean);
	}
	public FoodMainBean get(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
	public List<FoodMainBean> getList(){
		return list;
	}
}
