package res.project.ecommerceApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import res.project.ecommerceApp.repository.ProductRepository;

import res.project.ecommerceApp.entity.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository prorepo;
	
	public List<Product> getAllProduct(){
		return prorepo.findAll();
	}
	public List<Product> getProductsByCatagory(Long cid){
		return prorepo.findByCatagoryId(cid);
	}
}
