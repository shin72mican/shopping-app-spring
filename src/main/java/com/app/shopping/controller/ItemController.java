package com.app.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.shopping.entity.Items;
import com.app.shopping.mapper.ItemsMapper;

@RestController
public class ItemController {
	@Autowired
	ItemsMapper ptemsMapper;
	
	@GetMapping("/items")
	public List<Items> items() {
		List<Items> items = ptemsMapper.findAll();
		System.out.println(items);
		return items;
	}
}
