package com.silverxmary.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.silverxmary.shoppingbackend.dao.CategoryDAO;
import com.silverxmary.shoppingbackend.dto.Category;


@Controller
public class PageController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
//home
	@RequestMapping(value = {"/", "/home", "/index"})
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title", "Home");
		//passing list of category of backend
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickHome", "true");
		return mv;
	}
	
	@RequestMapping(value = {"/about"})
	public ModelAndView about(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "About Us");
		mv.addObject("userClickAbout", "true");
		return mv;
	}
	
	@RequestMapping(value = {"contact"})
	public ModelAndView contact(){
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Contact Us");
		mv.addObject("userClickContact", "true");
		return mv;
	}
	//test?greeting=algun texto
	@RequestMapping(value = {"/test"})
	public ModelAndView test(@RequestParam(value="greeting", required=false)String greeting){
		if(greeting==null){
			greeting="HEllo THere";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
	
	//test/algun texto
	@RequestMapping(value = {"/test2/{greeting}"})
	public ModelAndView test2(@PathVariable(value="greeting", required=false)String greeting){
		if(greeting==null){
			greeting="HEllo test2";
		}
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("greeting", greeting);
		return mv;
	}
}

