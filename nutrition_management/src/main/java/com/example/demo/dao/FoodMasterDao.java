package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.FoodMasterDto;
import com.example.demo.dto.FoodMasterViewDto;

public class FoodMasterDao extends BaseDao{
	public FoodMasterDto findByFoodId(Integer foodId) {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodMasterDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_master WHERE food_id = " + foodId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMasterDto dto = new FoodMasterDto();
				dto.setFoodTypeId(rs.getInt("food_type_id"));
				dto.setFoodId(rs.getInt("food_id"));
				dto.setFoodMainId(rs.getInt("food_main_id"));
				dto.setIndex(rs.getInt("index"));
				dto.setName(rs.getString("name"));
				dto.setRefuse(rs.getInt("refuse"));
				dto.setKj(rs.getInt("kj"));
				dto.setKcal(rs.getInt("kcal"));
				dto.setWater(rs.getDouble("water"));
				dto.setProtcaa(rs.getDouble("protcaa"));
				dto.setProtein(rs.getDouble("protein"));
				dto.setFatnlea(rs.getDouble("fatnlea"));
				dto.setChole(rs.getDouble("chole"));
				dto.setFat(rs.getDouble("fat"));
				dto.setChoavlm(rs.getDouble("choavlm"));
				dto.setChoavl(rs.getDouble("choavl"));
				dto.setChoavldf(rs.getDouble("choavldf"));
				dto.setFib(rs.getDouble("fib"));
				dto.setPolyl(rs.getDouble("polyl"));
				dto.setChocdf(rs.getDouble("chocdf"));
				dto.setOa(rs.getDouble("oa"));
				dto.setAsh(rs.getDouble("ash"));
				dto.setNa(rs.getDouble("na"));
				dto.setK(rs.getInt("k"));
				dto.setCa(rs.getInt("ca"));
				dto.setMg(rs.getInt("mg"));
				dto.setP(rs.getInt("p"));
				dto.setFe(rs.getDouble("fe"));
				dto.setZn(rs.getDouble("zn"));
				dto.setCu(rs.getDouble("cu"));
				dto.setMn(rs.getDouble("mn"));
				dto.setId(rs.getDouble("id"));
				dto.setSe(rs.getDouble("se"));
				dto.setCr(rs.getDouble("cr"));
				dto.setMo(rs.getDouble("mo"));
				dto.setRetol(rs.getDouble("retol"));
				dto.setCarta(rs.getDouble("carta"));
				dto.setCartb(rs.getDouble("cartb"));
				dto.setCrypxb(rs.getDouble("crypxb"));
				dto.setCartbeq(rs.getDouble("cartbeq"));
				dto.setVitaRae(rs.getDouble("vita_rae"));
				dto.setVitd(rs.getDouble("vitd"));
				dto.setTocpha(rs.getDouble("tocpha"));
				dto.setTocphb(rs.getDouble("tocphb"));
				dto.setTocphg(rs.getDouble("tocphg"));
				dto.setTocphd(rs.getDouble("tocphd"));
				dto.setVitk(rs.getDouble("vitk"));
				dto.setThia(rs.getDouble("thia"));
				dto.setRibf(rs.getDouble("ribf"));
				dto.setNia(rs.getDouble("nia"));
				dto.setNe(rs.getDouble("ne"));
				dto.setVitb6a(rs.getDouble("vitb6a"));
				dto.setVitb12(rs.getDouble("vitb12"));
				dto.setFol(rs.getDouble("fol"));
				dto.setPantac(rs.getDouble("pantac"));
				dto.setBiot(rs.getDouble("biot"));
				dto.setVitc(rs.getDouble("vitc"));
				dto.setAlc(rs.getDouble("alc"));
				dto.setNaclEq(rs.getDouble("nacl_eq"));
				dto.setNote(rs.getString("note"));
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
	public List<FoodMasterDto> findAllByMainId(Integer foodMainId) {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodMasterDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_master WHERE food_main_id = " + foodMainId;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMasterDto dto = new FoodMasterDto();
				dto.setFoodTypeId(rs.getInt("food_type_id"));
				dto.setFoodId(rs.getInt("food_id"));
				dto.setFoodMainId(rs.getInt("food_main_id"));
				dto.setIndex(rs.getInt("index"));
				dto.setName(rs.getString("name"));
				dto.setRefuse(rs.getInt("refuse"));
				dto.setKj(rs.getInt("kj"));
				dto.setKcal(rs.getInt("kcal"));
				dto.setWater(rs.getDouble("water"));
				dto.setProtcaa(rs.getDouble("protcaa"));
				dto.setProtein(rs.getDouble("protein"));
				dto.setFatnlea(rs.getDouble("fatnlea"));
				dto.setChole(rs.getDouble("chole"));
				dto.setFat(rs.getDouble("fat"));
				dto.setChoavlm(rs.getDouble("choavlm"));
				dto.setChoavl(rs.getDouble("choavl"));
				dto.setChoavldf(rs.getDouble("choavldf"));
				dto.setFib(rs.getDouble("fib"));
				dto.setPolyl(rs.getDouble("polyl"));
				dto.setChocdf(rs.getDouble("chocdf"));
				dto.setOa(rs.getDouble("oa"));
				dto.setAsh(rs.getDouble("ash"));
				dto.setNa(rs.getDouble("na"));
				dto.setK(rs.getInt("k"));
				dto.setCa(rs.getInt("ca"));
				dto.setMg(rs.getInt("mg"));
				dto.setP(rs.getInt("p"));
				dto.setFe(rs.getDouble("fe"));
				dto.setZn(rs.getDouble("zn"));
				dto.setCu(rs.getDouble("cu"));
				dto.setMn(rs.getDouble("mn"));
				dto.setId(rs.getDouble("id"));
				dto.setSe(rs.getDouble("se"));
				dto.setCr(rs.getDouble("cr"));
				dto.setMo(rs.getDouble("mo"));
				dto.setRetol(rs.getDouble("retol"));
				dto.setCarta(rs.getDouble("carta"));
				dto.setCartb(rs.getDouble("cartb"));
				dto.setCrypxb(rs.getDouble("crypxb"));
				dto.setCartbeq(rs.getDouble("cartbeq"));
				dto.setVitaRae(rs.getDouble("vita_rae"));
				dto.setVitd(rs.getDouble("vitd"));
				dto.setTocpha(rs.getDouble("tocpha"));
				dto.setTocphb(rs.getDouble("tocphb"));
				dto.setTocphg(rs.getDouble("tocphg"));
				dto.setTocphd(rs.getDouble("tocphd"));
				dto.setVitk(rs.getDouble("vitk"));
				dto.setThia(rs.getDouble("thia"));
				dto.setRibf(rs.getDouble("ribf"));
				dto.setNia(rs.getDouble("nia"));
				dto.setNe(rs.getDouble("ne"));
				dto.setVitb6a(rs.getDouble("vitb6a"));
				dto.setVitb12(rs.getDouble("vitb12"));
				dto.setFol(rs.getDouble("fol"));
				dto.setPantac(rs.getDouble("pantac"));
				dto.setBiot(rs.getDouble("biot"));
				dto.setVitc(rs.getDouble("vitc"));
				dto.setAlc(rs.getDouble("alc"));
				dto.setNaclEq(rs.getDouble("nacl_eq"));
				dto.setNote(rs.getString("note"));
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
	public List<FoodMasterDto> findRankingOrderByNutrition(String nutrition, int rankingNum) {
		Statement stmt = null;
		ResultSet rs = null;
		List<FoodMasterDto> result = new ArrayList<>();
		String sql = "SELECT * FROM food_master ORDER BY " + nutrition + " DESC LIMIT " + rankingNum;
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				FoodMasterDto dto = new FoodMasterDto();
				dto.setFoodTypeId(rs.getInt("food_type_id"));
				dto.setFoodId(rs.getInt("food_id"));
				dto.setFoodMainId(rs.getInt("food_main_id"));
				dto.setIndex(rs.getInt("index"));
				dto.setName(rs.getString("name"));
				dto.setRefuse(rs.getInt("refuse"));
				dto.setKj(rs.getInt("kj"));
				dto.setKcal(rs.getInt("kcal"));
				dto.setWater(rs.getDouble("water"));
				dto.setProtcaa(rs.getDouble("protcaa"));
				dto.setProtein(rs.getDouble("protein"));
				dto.setFatnlea(rs.getDouble("fatnlea"));
				dto.setChole(rs.getDouble("chole"));
				dto.setFat(rs.getDouble("fat"));
				dto.setChoavlm(rs.getDouble("choavlm"));
				dto.setChoavl(rs.getDouble("choavl"));
				dto.setChoavldf(rs.getDouble("choavldf"));
				dto.setFib(rs.getDouble("fib"));
				dto.setPolyl(rs.getDouble("polyl"));
				dto.setChocdf(rs.getDouble("chocdf"));
				dto.setOa(rs.getDouble("oa"));
				dto.setAsh(rs.getDouble("ash"));
				dto.setNa(rs.getDouble("na"));
				dto.setK(rs.getInt("k"));
				dto.setCa(rs.getInt("ca"));
				dto.setMg(rs.getInt("mg"));
				dto.setP(rs.getInt("p"));
				dto.setFe(rs.getDouble("fe"));
				dto.setZn(rs.getDouble("zn"));
				dto.setCu(rs.getDouble("cu"));
				dto.setMn(rs.getDouble("mn"));
				dto.setId(rs.getDouble("id"));
				dto.setSe(rs.getDouble("se"));
				dto.setCr(rs.getDouble("cr"));
				dto.setMo(rs.getDouble("mo"));
				dto.setRetol(rs.getDouble("retol"));
				dto.setCarta(rs.getDouble("carta"));
				dto.setCartb(rs.getDouble("cartb"));
				dto.setCrypxb(rs.getDouble("crypxb"));
				dto.setCartbeq(rs.getDouble("cartbeq"));
				dto.setVitaRae(rs.getDouble("vita_rae"));
				dto.setVitd(rs.getDouble("vitd"));
				dto.setTocpha(rs.getDouble("tocpha"));
				dto.setTocphb(rs.getDouble("tocphb"));
				dto.setTocphg(rs.getDouble("tocphg"));
				dto.setTocphd(rs.getDouble("tocphd"));
				dto.setVitk(rs.getDouble("vitk"));
				dto.setThia(rs.getDouble("thia"));
				dto.setRibf(rs.getDouble("ribf"));
				dto.setNia(rs.getDouble("nia"));
				dto.setNe(rs.getDouble("ne"));
				dto.setVitb6a(rs.getDouble("vitb6a"));
				dto.setVitb12(rs.getDouble("vitb12"));
				dto.setFol(rs.getDouble("fol"));
				dto.setPantac(rs.getDouble("pantac"));
				dto.setBiot(rs.getDouble("biot"));
				dto.setVitc(rs.getDouble("vitc"));
				dto.setAlc(rs.getDouble("alc"));
				dto.setNaclEq(rs.getDouble("nacl_eq"));
				dto.setNote(rs.getString("note"));
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
	
	public static FoodMasterViewDto convert(FoodMasterDto dto) {
		FoodMasterViewDto res = new FoodMasterViewDto();
		res.setId(dto.getFoodId());
		res.setName(dto.getName());
		res.setAmount(Long.valueOf(100));
		res.setKcal(dto.getKcal().doubleValue());
		res.setProtein(dto.getProtein());
		res.setFat(dto.getFat());
		res.setChocdf(dto.getChocdf());
		res.setFib(dto.getFib());
		res.setNa(dto.getNa());
		res.setK(dto.getK().doubleValue());
		res.setCa(dto.getCa().doubleValue());
		res.setMg(dto.getMg().doubleValue());
		res.setP(dto.getP().doubleValue());
		res.setFe(dto.getFe());
		res.setZn(dto.getZn());
		res.setCu(dto.getCu());
		res.setMn(dto.getMn());
		res.setVita(dto.getVitaRae());	// レチノール活性量のみが対象
		res.setVitd(dto.getVitd());
		res.setVite(dto.getTocpha());	// α-トコフェロールのみが対象
		res.setVitk(dto.getVitk());
		res.setVitb1(dto.getThia());
		res.setVitb2(dto.getRibf());
		res.setNia(dto.getNe());		// ナイアシン当量のみが対象
		res.setVitb6(dto.getVitb6a());
		res.setVitb12(dto.getVitb12());
		res.setFol(dto.getFol());
		res.setPantac(dto.getPantac());
		res.setVitc(dto.getVitc());
		return res;
	}
}
