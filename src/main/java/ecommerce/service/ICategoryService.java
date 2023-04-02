package ecommerce.service;

import java.util.List;
import java.util.Optional;

import ecommerce.model.Category;

public interface ICategoryService {
	List<Category> getAllCategory();

	void addCategory(Category category);

	void removeCategory(int id);

	Optional<Category> getCategoryById(int id);

}
