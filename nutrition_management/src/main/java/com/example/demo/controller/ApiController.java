package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.FoodLabelDao;
import com.example.demo.dao.FoodMainDao;
import com.example.demo.dao.FoodMasterDao;
import com.example.demo.dao.LimitDao;
import com.example.demo.dto.FoodLabelDto;
import com.example.demo.dto.FoodMainDto;
import com.example.demo.dto.FoodMasterDto;
import com.example.demo.dto.FoodMasterViewDto;
import com.example.demo.dto.LimitDto;

@RestController
public class ApiController {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
	public List<String> test() {
    	List<String> res = Arrays.asList("aaa", "bbb", "ccc");
    	return res;
    }

    @RequestMapping(value = "/food", method = RequestMethod.GET)
	public List<FoodMasterDto> getFoodByMainId(@RequestParam(name = "mainId")Integer mainId) {
    	FoodMasterDao foodMasterDao = new FoodMasterDao();
    	List<FoodMasterDto> foodMaster = foodMasterDao.findAllByMainId(mainId);
    	return foodMaster;
    }

    @RequestMapping(value = "/food-view", method = RequestMethod.GET)
	public FoodMasterViewDto getFoodByFoodId(@RequestParam(name = "foodId")Integer foodId) {
    	FoodMasterDao foodMasterDao = new FoodMasterDao();
    	FoodMasterDto foodMaster = foodMasterDao.findByFoodId(foodId);
    	// 表示用に変換
    	FoodMasterViewDto foodMasterView = FoodMasterDao.convert(foodMaster);
    	return foodMasterView;
    }

    @RequestMapping(value = "/label", method = RequestMethod.GET)
	public List<FoodLabelDto> getLabel() {
    	FoodLabelDao foodLabelDao = new FoodLabelDao();
    	List<FoodLabelDto> foodLabel = foodLabelDao.findAll();
    	return foodLabel;
    }

    @RequestMapping(value = "/limit", method = RequestMethod.GET)
	public LimitDto getGraphData(@RequestParam(name = "gender")Integer gender, @RequestParam(name = "age")Integer age) {
    	LimitDao limitDao = new LimitDao();
    	LimitDto limit = limitDao.select(gender, age);
    	return limit;
    }

    @RequestMapping(value = "/food-main", method = RequestMethod.GET)
	public FoodMainDto getGraphData(@RequestParam(name = "foodMainId")Integer foodMainId) {
    	FoodMainDao foodMainDao = new FoodMainDao();
    	FoodMainDto foodMainDto = foodMainDao.selectByFoodMainId(foodMainId);
    	return foodMainDto;
    }
    
    @RequestMapping(value = "/ranking", method = RequestMethod.GET)
	public List<FoodMasterViewDto> getNutritionRanking(@RequestParam(name = "nutrition")String nutrition) {
    	final int RANKING_NUM = 50;
    	switch (nutrition) {
    	case "vita":
    		nutrition = "vita_rae";
    		break;
    	case "vite":
    		nutrition = "tocpha";
    		break;
    	case "vitb1":
    		nutrition = "thia";
    		break;
    	case "vitb2":
    		nutrition = "ribf";
    		break;
    	case "vitb6":
    		nutrition = "vitb6a";
    		break;
    	}
    	FoodMasterDao foodMasterDao = new FoodMasterDao();
    	List<FoodMasterDto> foodMaster = foodMasterDao.findRankingOrderByNutrition(nutrition, RANKING_NUM);
    	List<FoodMasterViewDto> foodMasterView = new ArrayList<>();
    	for(FoodMasterDto dto : foodMaster) {
    		foodMasterView.add(FoodMasterDao.convert(dto));
    	}
    	return foodMasterView;
    }
}
