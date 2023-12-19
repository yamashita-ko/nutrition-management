package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.demo.bean.FoodTypeBean;
import com.example.demo.dto.BaseDto;

public class FoodTypeDao extends BaseDao{
	public BaseDto<FoodTypeBean> select() {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<FoodTypeBean> result = new BaseDto();
		String sql = "SELECT * FROM food_type";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodTypeBean bean = new FoodTypeBean();
				bean.setFoodTypeId(rs.getLong("food_type_id"));
				bean.setName(rs.getString("name"));
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
}
