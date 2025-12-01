package res.project.ecommerceApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import res.project.ecommerceApp.entity.Product;
import res.project.ecommerceApp.service.ProductService;

@RestController
@RequestMapping("api/product")
@CrossOrigin(origins = "http://localhost:5173")
public class ProductController {
	
	@Autowired
	private ProductService proser;
	
	@GetMapping
	public List<Product> getAllProduct(){
		return proser.getAllProduct();
	}
	
	@GetMapping("catagory/{id}")
	public List<Product> getproductByCatagory(@PathVariable Long id){
		return proser.getProductsByCatagory(id);
	}
}
