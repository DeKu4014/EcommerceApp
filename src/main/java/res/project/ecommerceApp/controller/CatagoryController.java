package res.project.ecommerceApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import res.project.ecommerceApp.entity.Catagory;
import res.project.ecommerceApp.service.CatagoryService;

@RestController
@RequestMapping("api/catagory")
@CrossOrigin(origins = "http://localhost:5173")
public class CatagoryController {
	
	@Autowired
	private CatagoryService catserv;
	
	@GetMapping
	public List<Catagory> getAllCatagory(){
		return catserv.getAllCatagory();
	}
}
