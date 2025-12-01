package res.project.ecommerceApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import res.project.ecommerceApp.entity.Catagory;
import res.project.ecommerceApp.repository.CatagoryRepository;

@Service
public class CatagoryService {
	@Autowired
	private CatagoryRepository catarepo;
	
	public List<Catagory> getAllCatagory() {
		return catarepo.findAll();
	}
	
}
