package com.deloitte.fi.estore.Categories.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.deloitte.fi.estore.Categories.model.Category;

public interface CategoryRepository extends CrudRepository<Category,String> {
	
	@Query("{ '_id': ?0 }")
	Category findOne(String id);
	
}
