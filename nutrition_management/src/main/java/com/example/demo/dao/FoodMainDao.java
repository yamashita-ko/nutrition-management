package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.FoodMainDto;

public class FoodMainDao extends BaseDao{
	public List<FoodMainDto> select() {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodMainDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_main";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMainDto dto = new FoodMainDto();
				dto.setFoodTypeId(rs.getLong("food_type_id"));
				dto.setFoodMainId(rs.getLong("food_main_id"));
				dto.setName(rs.getString("name"));
				dto.setImage(rs.getString("image"));
				result.add(dto);
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

	public List<FoodMainDto> selectByFoodTypeId(int foodTypeId) {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodMainDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_main where food_type_id = " + foodTypeId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMainDto dto = new FoodMainDto();
				dto.setFoodTypeId(rs.getLong("food_type_id"));
				dto.setFoodMainId(rs.getLong("food_main_id"));
				dto.setName(rs.getString("name"));
				dto.setImage(rs.getString("image"));
				result.add(dto);
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

	public FoodMainDto selectByFoodMainId(int foodMainId) {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodMainDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_main where food_main_id = " + foodMainId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMainDto dto = new FoodMainDto();
				dto.setFoodTypeId(rs.getLong("food_type_id"));
				dto.setFoodMainId(rs.getLong("food_main_id"));
				dto.setName(rs.getString("name"));
				dto.setImage(rs.getString("image"));
				result.add(dto);
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
