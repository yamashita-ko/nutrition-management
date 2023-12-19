package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.demo.bean.LimitBean;
import com.example.demo.dto.BaseDto;

public class LimitDao extends BaseDao{
	public static final Integer LOWER_LIMIT = 1;
	public static final Integer UPPER_LIMIT = 2;
	public static final String LOWER_LIMIT_TABLE = "lower_limit";
	public static final String UPPER_LIMIT_TABLE = "upper_limit";
	
	public BaseDto<LimitBean> select(Integer limitType, Integer gender, Integer age) {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<LimitBean> result = new BaseDto<>();
		String table = LOWER_LIMIT_TABLE;
		if(limitType == UPPER_LIMIT) {
			table = UPPER_LIMIT_TABLE;
		}
		String sql = "SELECT * FROM " + table + " WHERE gender = " + gender + " AND age = " + age;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				LimitBean bean = new LimitBean();
				bean.setGender(rs.getInt("gender"));
				bean.setAge(rs.getInt("age"));
				bean.setKcal(rs.getDouble("kcal"));
				bean.setProtein(rs.getDouble("protein"));
				bean.setFat(rs.getDouble("fat"));
				bean.setSfa(rs.getDouble("sfa"));
				bean.setChocdf(rs.getDouble("chocdf"));
				bean.setFib(rs.getDouble("fib"));
				bean.setNa(rs.getDouble("na"));
				bean.setK(rs.getDouble("k"));
				bean.setCa(rs.getDouble("ca"));
				bean.setMg(rs.getDouble("mg"));
				bean.setP(rs.getDouble("p"));
				bean.setFe(rs.getDouble("fe"));
				bean.setCu(rs.getDouble("cu"));
				bean.setMn(rs.getDouble("mn"));
				bean.setVita(rs.getDouble("vita"));
				bean.setVitd(rs.getDouble("vitd"));
				bean.setVite(rs.getDouble("vite"));
				bean.setVitk(rs.getDouble("vitk"));
				bean.setVitb1(rs.getDouble("vitb1"));
				bean.setVitb2(rs.getDouble("vitb2"));
				bean.setNia(rs.getDouble("nia"));
				bean.setVitb6(rs.getDouble("vitb6"));
				bean.setVitb12(rs.getDouble("vitb12"));
				bean.setFol(rs.getDouble("fol"));
				bean.setPantac(rs.getDouble("pantac"));
				bean.setVitc(rs.getDouble("vitc"));
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
