package ecommerce.service;

import java.util.List;
import java.util.Optional;
import ecommerce.model.Product;

public interface IProductService {
	
	public void addProduct(Product product);
	public List<Product> getAllProduct();
	public void removeProductById(Long id);
	public Optional<Product> getProductById(Long id);
	public List<Product> getAllProductByCategoryId(int id);
	

}
