package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.FoodMasterBean;
import com.example.demo.bean.LimitBean;
import com.example.demo.dao.FoodMasterDao;
import com.example.demo.dao.LimitDao;
import com.example.demo.dto.BaseDto;

@RestController
public class ApiController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
	public List<String> test() {
    	List<String> res = Arrays.asList("aaa", "bbb", "ccc");
    	return res;
    }

    @RequestMapping(value = "/food-main", method = RequestMethod.GET)
	public BaseDto<FoodMasterBean> findFoodByMainId(@RequestParam(name = "mainId")Integer mainId) {
    	FoodMasterDao foodMasterDao = new FoodMasterDao();
    	BaseDto<FoodMasterBean> foodMasterDto = foodMasterDao.findAllByMainId(mainId);
    	return foodMasterDto;
    }
    
    @RequestMapping(value = "/lower-limit", method = RequestMethod.GET)
	public BaseDto<LimitBean> lowerLimit(@RequestParam(name = "gender")Integer gender, @RequestParam(name = "age")Integer age) {
    	LimitDao limitDao = new LimitDao();
    	BaseDto<LimitBean> limitDto = limitDao.select(1, gender, age);
    	return limitDto;
    }

    @RequestMapping(value = "/food", method = RequestMethod.GET)
	public FoodMasterBean findFoodByFoodId(@RequestParam(name = "foodId")Integer FoodId) {
    	FoodMasterDao foodMasterDao = new FoodMasterDao();
    	FoodMasterBean foodMaster = foodMasterDao.findByFoodId(FoodId);
    	return foodMaster;
    }
}
