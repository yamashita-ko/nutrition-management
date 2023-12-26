package com.example.demo.dto;

import java.io.Serializable;

import com.example.demo.bean.FoodMasterBean;
import com.example.demo.bean.FoodMasterViewBean;

public class FoodMasterDto implements Serializable {
	private FoodMasterViewBean foodMasterViewBean;
	
	public static FoodMasterViewBean convert(FoodMasterBean bean) {
		FoodMasterViewBean res = new FoodMasterViewBean();
		res.setId(bean.getFoodId());
		res.setAmount(Long.valueOf(100));
		res.setKcal(bean.getKcal().doubleValue());
		res.setProtein(bean.getProtein());
		res.setFat(bean.getFat());
		res.setChocdf(bean.getChocdf());
		res.setFib(bean.getFib());
		res.setNa(bean.getNa());
		res.setK(bean.getK().doubleValue());
		res.setCa(bean.getCa().doubleValue());
		res.setMg(bean.getMg().doubleValue());
		res.setP(bean.getP().doubleValue());
		res.setFe(bean.getFe());
		res.setZn(bean.getZn());
		res.setCu(bean.getCu());
		res.setMn(bean.getMn());
		res.setVita(bean.getVitaRae());	// レチノール活性量のみが対象
		res.setVitd(bean.getVitd());
		res.setVite(bean.getTocpha());	// α-トコフェロールのみが対象
		res.setVitk(bean.getVitk());
		res.setVitb1(bean.getThia());
		res.setVitb2(bean.getRibf());
		res.setNia(bean.getNe());		// ナイアシン当量のみが対象
		res.setVitb6(bean.getVitb6a());
		res.setVitb12(bean.getVitb12());
		res.setFol(bean.getFol());
		res.setPantac(bean.getPantac());
		res.setVitc(bean.getVitc());
		return res;
	}
}
