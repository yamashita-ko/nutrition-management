package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.FoodTypeDto;

public class FoodTypeDao extends BaseDao{
	public List<FoodTypeDto> select() {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodTypeDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_type";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodTypeDto dto = new FoodTypeDto();
				dto.setFoodTypeId(rs.getLong("food_type_id"));
				dto.setName(rs.getString("name"));
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
}
