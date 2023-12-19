package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;

import com.example.demo.bean.FoodMasterBean;
import com.example.demo.dto.BaseDto;

public class FoodMasterDao extends BaseDao{
	public BaseDto<FoodMasterBean> findByMainId(Integer foodMainId) {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<FoodMasterBean> result = new BaseDto();
		String sql = "SELECT * FROM food_master WHERE food_main_id = " + foodMainId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMasterBean bean = new FoodMasterBean();
				bean.setFoodTypeId(rs.getInt("food_type_id"));
				bean.setFoodId(rs.getInt("food_id"));
				bean.setFoodMainId(rs.getInt("food_main_id"));
				bean.setIndex(rs.getInt("index"));
				bean.setName(rs.getString("name"));
				bean.setRefuse(rs.getInt("refuse"));
				bean.setKj(rs.getInt("kj"));
				bean.setKcal(rs.getInt("kcal"));
				bean.setWater(rs.getDouble("water"));
				bean.setProtcaa(rs.getDouble("protcaa"));
				bean.setProtein(rs.getDouble("protein"));
				bean.setFatnlea(rs.getDouble("fatnlea"));
				bean.setChole(rs.getDouble("chole"));
				bean.setFat(rs.getDouble("fat"));
				bean.setChoavlm(rs.getDouble("choavlm"));
				bean.setChoavl(rs.getDouble("choavl"));
				bean.setChoavldf(rs.getDouble("choavldf"));
				bean.setOa(rs.getDouble("oa"));
				bean.setAsh(rs.getDouble("ash"));
				bean.setNa(rs.getDouble("na"));
				bean.setK(rs.getInt("k"));
				bean.setCa(rs.getInt("ca"));
				bean.setMg(rs.getInt("mg"));
				bean.setP(rs.getInt("p"));
				bean.setFe(rs.getDouble("fe"));
				bean.setZn(rs.getDouble("zn"));
				bean.setCu(rs.getDouble("cu"));
				bean.setMn(rs.getDouble("mn"));
				bean.setId(rs.getDouble("id"));
				bean.setSe(rs.getDouble("se"));
				bean.setCr(rs.getDouble("cr"));
				bean.setMo(rs.getDouble("mo"));
				bean.setRetol(rs.getDouble("retol"));
				bean.setCarta(rs.getDouble("carta"));
				bean.setCartb(rs.getDouble("cartb"));
				bean.setCrypxb(rs.getDouble("crypxb"));
				bean.setCartbeq(rs.getDouble("cartbeq"));
				bean.setVitaRae(rs.getDouble("vita_rae"));
				bean.setVitd(rs.getDouble("vitd"));
				bean.setTocpha(rs.getDouble("tocpha"));
				bean.setTocphb(rs.getDouble("tocphb"));
				bean.setTocphg(rs.getDouble("tocphg"));
				bean.setTocphd(rs.getDouble("tocphd"));
				bean.setVitk(rs.getDouble("vitk"));
				bean.setThia(rs.getDouble("thia"));
				bean.setRibf(rs.getDouble("ribf"));
				bean.setNia(rs.getDouble("nia"));
				bean.setNe(rs.getDouble("ne"));
				bean.setVitb6a(rs.getDouble("vitb6a"));
				bean.setVitb12(rs.getDouble("vitb12"));
				bean.setFol(rs.getDouble("fol"));
				bean.setPantac(rs.getDouble("pantac"));
				bean.setBiot(rs.getDouble("biot"));
				bean.setVitc(rs.getDouble("vitc"));
				bean.setAlc(rs.getDouble("alc"));
				bean.setNaclEq(rs.getDouble("nacl_eq"));
				bean.setNote(rs.getString("note"));
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
	public BaseDto<FoodMasterBean> findAllMainId(Integer foodMainId) {
		Statement stmt = null;
		ResultSet rs = null;
		BaseDto<FoodMasterBean> result = new BaseDto();
		String sql = "SELECT * FROM food_master WHERE food_main_id = " + foodMainId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMasterBean bean = new FoodMasterBean();
				bean.setFoodTypeId(rs.getInt("food_type_id"));
				bean.setFoodId(rs.getInt("food_id"));
				bean.setFoodMainId(rs.getInt("food_main_id"));
				bean.setIndex(rs.getInt("index"));
				bean.setName(rs.getString("name"));
				bean.setRefuse(rs.getInt("refuse"));
				bean.setKj(rs.getInt("kj"));
				bean.setKcal(rs.getInt("kcal"));
				bean.setWater(rs.getDouble("water"));
				bean.setProtcaa(rs.getDouble("protcaa"));
				bean.setProtein(rs.getDouble("protein"));
				bean.setFatnlea(rs.getDouble("fatnlea"));
				bean.setChole(rs.getDouble("chole"));
				bean.setFat(rs.getDouble("fat"));
				bean.setChoavlm(rs.getDouble("choavlm"));
				bean.setChoavl(rs.getDouble("choavl"));
				bean.setChoavldf(rs.getDouble("choavldf"));
				bean.setOa(rs.getDouble("oa"));
				bean.setAsh(rs.getDouble("ash"));
				bean.setNa(rs.getDouble("na"));
				bean.setK(rs.getInt("k"));
				bean.setCa(rs.getInt("ca"));
				bean.setMg(rs.getInt("mg"));
				bean.setP(rs.getInt("p"));
				bean.setFe(rs.getDouble("fe"));
				bean.setZn(rs.getDouble("zn"));
				bean.setCu(rs.getDouble("cu"));
				bean.setMn(rs.getDouble("mn"));
				bean.setId(rs.getDouble("id"));
				bean.setSe(rs.getDouble("se"));
				bean.setCr(rs.getDouble("cr"));
				bean.setMo(rs.getDouble("mo"));
				bean.setRetol(rs.getDouble("retol"));
				bean.setCarta(rs.getDouble("carta"));
				bean.setCartb(rs.getDouble("cartb"));
				bean.setCrypxb(rs.getDouble("crypxb"));
				bean.setCartbeq(rs.getDouble("cartbeq"));
				bean.setVitaRae(rs.getDouble("vita_rae"));
				bean.setVitd(rs.getDouble("vitd"));
				bean.setTocpha(rs.getDouble("tocpha"));
				bean.setTocphb(rs.getDouble("tocphb"));
				bean.setTocphg(rs.getDouble("tocphg"));
				bean.setTocphd(rs.getDouble("tocphd"));
				bean.setVitk(rs.getDouble("vitk"));
				bean.setThia(rs.getDouble("thia"));
				bean.setRibf(rs.getDouble("ribf"));
				bean.setNia(rs.getDouble("nia"));
				bean.setNe(rs.getDouble("ne"));
				bean.setVitb6a(rs.getDouble("vitb6a"));
				bean.setVitb12(rs.getDouble("vitb12"));
				bean.setFol(rs.getDouble("fol"));
				bean.setPantac(rs.getDouble("pantac"));
				bean.setBiot(rs.getDouble("biot"));
				bean.setVitc(rs.getDouble("vitc"));
				bean.setAlc(rs.getDouble("alc"));
				bean.setNaclEq(rs.getDouble("nacl_eq"));
				bean.setNote(rs.getString("note"));
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
