package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.FoodLabelBean;
import com.example.demo.bean.FoodMainBean;
import com.example.demo.bean.FoodMasterBean;
import com.example.demo.bean.FoodMasterViewBean;
import com.example.demo.bean.LimitBean;
import com.example.demo.dao.FoodLabelDao;
import com.example.demo.dao.FoodMainDao;
import com.example.demo.dao.FoodMasterDao;
import com.example.demo.dao.LimitDao;
import com.example.demo.dto.BaseDto;
import com.example.demo.dto.FoodMasterDto;

@RestController
public class ApiController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
	public List<String> test() {
    	List<String> res = Arrays.asList("aaa", "bbb", "ccc");
    	return res;
    }

    @RequestMapping(value = "/food", method = RequestMethod.GET)
	public BaseDto<FoodMasterBean> getFoodByMainId(@RequestParam(name = "mainId")Integer mainId) {
    	FoodMasterDao foodMasterDao = new FoodMasterDao();
    	BaseDto<FoodMasterBean> foodMaster = foodMasterDao.findAllByMainId(mainId);
    	return foodMaster;
    }

    @RequestMapping(value = "/food-view", method = RequestMethod.GET)
	public FoodMasterViewBean getFoodByFoodId(@RequestParam(name = "foodId")Integer foodId) {
    	FoodMasterDao foodMasterDao = new FoodMasterDao();
    	FoodMasterBean foodMaster = foodMasterDao.findByFoodId(foodId);
    	// 表示用に変換
    	FoodMasterViewBean foodMasterView = FoodMasterDto.convert(foodMaster);
    	return foodMasterView;
    }

    @RequestMapping(value = "/label", method = RequestMethod.GET)
	public BaseDto<FoodLabelBean> getLabel() {
    	FoodLabelDao foodLabelDao = new FoodLabelDao();
    	BaseDto<FoodLabelBean> foodLabel = foodLabelDao.findAll();
    	return foodLabel;
    }

    @RequestMapping(value = "/limit", method = RequestMethod.GET)
	public LimitBean getGraphData(@RequestParam(name = "gender")Integer gender, @RequestParam(name = "age")Integer age) {
    	LimitDao limitDao = new LimitDao();
    	LimitBean limit = limitDao.select(gender, age);
    	return limit;
    }

    @RequestMapping(value = "/food-main", method = RequestMethod.GET)
	public FoodMainBean getGraphData(@RequestParam(name = "foodMainId")Integer foodMainId) {
    	FoodMainDao foodMainDao = new FoodMainDao();
    	FoodMainBean foodMainBean = foodMainDao.selectByFoodMainId(foodMainId);
    	return foodMainBean;
    }
}
