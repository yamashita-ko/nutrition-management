package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Arrays;
import java.util.List;

import com.example.demo.bean.LimitBean;
import com.example.demo.dto.BaseDto;

public class LimitDao extends BaseDao{
	
	public static final List<Integer> ages = Arrays.asList(1, 2, 5, 7, 9, 11, 14, 17, 29, 49, 64, 74, 120);
	
	public LimitBean select(Integer gender, Integer age) {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<LimitBean> result = new BaseDto<>();
		
		for(int i = 0; i < ages.size(); i++) {
			if(age <= ages.get(i)) {
				age = ages.get(i);
				break;
			}
			// 120歳以上を入力
			if(i == ages.size() - 1) {
				age = ages.get(i);
			}
		}
		
		String table = "nutrition_limit";
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
		return result.get(0);
	}
}
