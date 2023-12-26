package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.demo.bean.FoodMainBean;
import com.example.demo.dto.BaseDto;

public class FoodMainDao extends BaseDao{
	public BaseDto<FoodMainBean> select() {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<FoodMainBean> result = new BaseDto<>();
		String sql = "SELECT * FROM food_main";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMainBean bean = new FoodMainBean();
				bean.setFoodTypeId(rs.getLong("food_type_id"));
				bean.setFoodMainId(rs.getLong("food_main_id"));
				bean.setName(rs.getString("name"));
				bean.setImage(rs.getString("image"));
				result.add(bean);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return result;
	}

	public BaseDto<FoodMainBean> selectByFoodTypeId(int foodTypeId) {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<FoodMainBean> result = new BaseDto<>();
		String sql = "SELECT * FROM food_main where food_type_id = " + foodTypeId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMainBean bean = new FoodMainBean();
				bean.setFoodTypeId(rs.getLong("food_type_id"));
				bean.setFoodMainId(rs.getLong("food_main_id"));
				bean.setName(rs.getString("name"));
				bean.setImage(rs.getString("image"));
				result.add(bean);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return result;
	}

	public FoodMainBean selectByFoodMainId(int foodMainId) {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<FoodMainBean> result = new BaseDto<>();
		String sql = "SELECT * FROM food_main where food_main_id = " + foodMainId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMainBean bean = new FoodMainBean();
				bean.setFoodTypeId(rs.getLong("food_type_id"));
				bean.setFoodMainId(rs.getLong("food_main_id"));
				bean.setName(rs.getString("name"));
				bean.setImage(rs.getString("image"));
				result.add(bean);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		disconnect();
		return result.get(0);
	}
}
