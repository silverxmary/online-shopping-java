package com.silverxmary.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.silverxmary.shoppingbackend.dao.CategoryDAO;
import com.silverxmary.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	//data dummy for testing
	private static List<Category> categories = new ArrayList<>();
	
	static {
		Category category = new Category();
		//adding first category
		category.setId(1);
		category.setName("television");
		category.setDescription("description for tv");
		category.setImageURL("CAT_1.png");
		categories.add(category);
		//2category
		category = new Category();
		category.setId(2);
		category.setName("mobile");
		category.setDescription("description for mobile");
		category.setImageURL("CAT_2.png");
		categories.add(category);
		//3category
		category = new Category();
		category.setId(3);
		category.setName("sss");
		category.setDescription("description for sss");
		category.setImageURL("CAT_3.png");
		categories.add(category);
		
	}
	
	
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

}
