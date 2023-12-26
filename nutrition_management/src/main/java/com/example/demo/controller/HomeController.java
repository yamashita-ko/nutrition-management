package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.bean.FoodLabelBean;
import com.example.demo.bean.FoodMainBean;
import com.example.demo.bean.FoodTypeBean;
import com.example.demo.dao.FoodLabelDao;
import com.example.demo.dao.FoodMainDao;
import com.example.demo.dao.FoodTypeDao;
import com.example.demo.dto.BaseDto;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Model model) {
    	FoodMainDao foodMainDao = new FoodMainDao();
    	FoodTypeDao foodTypeDao = new FoodTypeDao();
    	FoodLabelDao foodLabelDao = new FoodLabelDao();
    	BaseDto<FoodMainBean> foodMainDto = foodMainDao.select();
    	List<BaseDto<FoodMainBean>> foodMainDtoList = new ArrayList<>();
    	BaseDto<FoodTypeBean> foodTypeDto = foodTypeDao.select();
    	BaseDto<FoodLabelBean> foodLabelDto = foodLabelDao.findAll();
    	
    	// typeの部分の重複を削除して抽出
    	List<Long> distinctType = foodTypeDto.getList()
    				.stream()
    				.map(obj -> obj.getFoodTypeId())
    				.distinct()
    				.collect(Collectors.toList());
    	
    	// type毎にDB検索
    	for(Long type : distinctType) {
    		foodMainDtoList.add(foodMainDao.selectByFoodTypeId(type.intValue()));
    	}
        model.addAttribute("mainList", foodMainDto.getList());
        model.addAttribute("foodMainDtoList", foodMainDtoList);
        model.addAttribute("typeList", foodTypeDto.getList());
        model.addAttribute("foodLabelList", foodLabelDto.getList());
		return "home";
	}
	
}