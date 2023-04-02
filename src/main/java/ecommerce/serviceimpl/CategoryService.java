package ecommerce.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.model.Category;
import ecommerce.repository.CategoryRepository;
import ecommerce.service.ICategoryService;

@Service
public class CategoryService implements ICategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> getAllCategory() {

		return categoryRepository.findAll();
	}

	@Override
	public void addCategory(Category category) {
		categoryRepository.save(category);

	}

	@Override
	public void removeCategory(int id) {
		categoryRepository.deleteById(id);

	}

	@Override
	public Optional<Category> getCategoryById(int id) {

		return categoryRepository.findById(id);
	}

}
