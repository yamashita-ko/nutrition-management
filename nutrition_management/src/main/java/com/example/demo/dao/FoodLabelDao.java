package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.demo.bean.FoodLabelBean;
import com.example.demo.dto.BaseDto;

public class FoodLabelDao extends BaseDao{
	public BaseDto<FoodLabelBean> findAll() {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<FoodLabelBean> result = new BaseDto();
		String sql = "SELECT * FROM food_label";
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodLabelBean bean = new FoodLabelBean();
				bean.setId(rs.getInt("id"));
				bean.setName(rs.getString("name"));
				bean.setNameJP(rs.getString("name_jp"));
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
