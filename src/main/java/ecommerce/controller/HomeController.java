package ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import ecommerce.serviceimpl.CategoryService;
import ecommerce.serviceimpl.ProductService;
@Controller
public class HomeController {
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping({"/","/home"})
	public String home(Model model) {
		return "index";
	}
	
	@GetMapping("/shop")
	public String shop(Model model) {
		model.addAttribute("products", productService.getAllProduct());
		model.addAttribute("categories", categoryService.getAllCategory());
		return "shop";
	}
	
	@GetMapping("/shop/category/{id}")
	public String shopByCategory(Model model,@PathVariable int id) {
		model.addAttribute("products", productService.getAllProductByCategoryId(id));
		model.addAttribute("categories", categoryService.getAllCategory());
		return "shop";
	}
	
	@GetMapping("/shop/viewproduct/{id}")
	public String viewproduct(Model model,@PathVariable long id) {
		model.addAttribute("product", productService.getProductById(id).get());
		model.addAttribute("categories", categoryService.getAllCategory());
		return "viewProduct";
	}
}
