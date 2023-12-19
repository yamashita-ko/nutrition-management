package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class BaseDto<T> {
    private ArrayList<T> list;

	public BaseDto() {
		list = new ArrayList<T>();
	}
	public void add (T bean) {
		list.add(bean);
	}
	public T get(int i) {
		return list.get(i);
	}
	public int size() {
		return list.size();
	}
	public List<T> getList(){
		return list;
	}
}
