package ecommerce.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ecommerce.model.Product;
import ecommerce.repository.ProductRepository;
import ecommerce.service.IProductService;
@Service
public class ProductService implements IProductService{
	
	
	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}


	@Override
	public void addProduct(Product product) {
		productRepository.save(product);
		
	}


	@Override
	public void removeProductById(Long id) {
		productRepository.deleteById(id);
		
	}

	@Override
	public Optional<Product> getProductById(Long id) {
		
		return productRepository.findById(id);
	}


	@Override
	public List<Product> getAllProductByCategoryId(int id) {
		
		return productRepository.findAllByCategory_Id(id);
	}

}
