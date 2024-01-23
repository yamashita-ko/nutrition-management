package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.example.demo.dto.LimitDto;

public class LimitDao extends BaseDao{
	
	public static final List<Integer> ages = Arrays.asList(1, 2, 5, 7, 9, 11, 14, 17, 29, 49, 64, 74, 120);
	
	public LimitDto select(Integer gender, Integer age) {
		Statement stmt = null;
		ResultSet rs = null;
		List<LimitDto> result = new ArrayList<>();
		
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
				LimitDto dto = new LimitDto();
				dto.setGender(rs.getInt("gender"));
				dto.setAge(rs.getInt("age"));
				dto.setKcal(rs.getDouble("kcal"));
				dto.setProtein(rs.getDouble("protein"));
				dto.setFat(rs.getDouble("fat"));
				dto.setChocdf(rs.getDouble("chocdf"));
				dto.setFib(rs.getDouble("fib"));
				dto.setNa(rs.getDouble("na"));
				dto.setK(rs.getDouble("k"));
				dto.setCa(rs.getDouble("ca"));
				dto.setMg(rs.getDouble("mg"));
				dto.setP(rs.getDouble("p"));
				dto.setFe(rs.getDouble("fe"));
				dto.setZn(rs.getDouble("zn"));
				dto.setCu(rs.getDouble("cu"));
				dto.setMn(rs.getDouble("mn"));
				dto.setVita(rs.getDouble("vita"));
				dto.setVitd(rs.getDouble("vitd"));
				dto.setVite(rs.getDouble("vite"));
				dto.setVitk(rs.getDouble("vitk"));
				dto.setVitb1(rs.getDouble("vitb1"));
				dto.setVitb2(rs.getDouble("vitb2"));
				dto.setNia(rs.getDouble("nia"));
				dto.setVitb6(rs.getDouble("vitb6"));
				dto.setVitb12(rs.getDouble("vitb12"));
				dto.setFol(rs.getDouble("fol"));
				dto.setPantac(rs.getDouble("pantac"));
				dto.setVitc(rs.getDouble("vitc"));
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
