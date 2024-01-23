package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.FoodLabelDto;

public class FoodLabelDao extends BaseDao{
	public List<FoodLabelDto> findAll() {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodLabelDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_label";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodLabelDto dto = new FoodLabelDto();
				dto.setId(rs.getInt("id"));
				dto.setName(rs.getString("name"));
				dto.setNameJP(rs.getString("name_jp"));
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
