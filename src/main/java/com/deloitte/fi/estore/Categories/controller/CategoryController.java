package com.deloitte.fi.estore.Categories.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.fi.estore.Categories.model.Category;
import com.deloitte.fi.estore.Categories.service.CategoryService;

@RestController
@RequestMapping("/Category")
@CrossOrigin("*")
public class CategoryController {
	@Autowired
    CategoryService categoryService;
	
	@RequestMapping(method=RequestMethod.POST, value="/add")
    public Category create(@RequestBody Category category) {
        return categoryService.create(category);
    }
	
	@RequestMapping(method=RequestMethod.GET, value="/getAllCategories")
    public Iterable<Category> category() {
        return categoryService.findAll();
    }
	
	@RequestMapping(method=RequestMethod.GET, value="/{id}")
    public Optional<Category> show(@PathVariable String id) {
        return categoryService.findOne(id);
    }

	@RequestMapping(method=RequestMethod.PUT, value="/{id}")
    public Optional<Category> update(@PathVariable String id, @RequestBody Category category) {
        return categoryService.update(id,category);
    }
	
	@RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    public String delete(@PathVariable String id) {
        categoryService.delete(id);
        return "Category deleted";
    }
}
