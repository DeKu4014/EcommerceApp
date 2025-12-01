package res.project.ecommerceApp.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import res.project.ecommerceApp.entity.Catagory;
import res.project.ecommerceApp.entity.Product;
import res.project.ecommerceApp.repository.CatagoryRepository;
import res.project.ecommerceApp.repository.ProductRepository;

@Component
public class DataSeeder implements CommandLineRunner{

	
	@Autowired
	private CatagoryRepository catrepo;
	@Autowired
	private ProductRepository prorepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		catrepo.deleteAll();prorepo.deleteAll();
		
		Catagory electronics = new Catagory();
		electronics.setName("Electronics");
		
		Catagory clothing = new Catagory();
		clothing.setName("Clothing");
		
		Catagory home = new Catagory();
		home.setName("Home and Kitchen");
		
		catrepo.saveAll(Arrays.asList(electronics,clothing,home));
		
		
		Product phone = new Product();
		phone.setName("SmartPhone");
		phone.setDescription("Latest smartphone");
		phone.setImgurl("https://placehold.co/600x400");
		phone.setPrice(45000.0);
		phone.setCatagory(electronics);
		
		Product laptop = new Product();
		laptop.setName("Laptop");
		laptop.setDescription("High Performance laptop for students");
		laptop.setImgurl("https://placehold.co/600x400");
		laptop.setPrice(55000.00);
		laptop.setCatagory(electronics);
		
		Product jacket = new Product();
		jacket.setName("Jacket");
		jacket.setDescription("High quality jacket for winter");
		jacket.setImgurl("https://placehold.co/600x400");
		jacket.setPrice(550.00);
		jacket.setCatagory(clothing);
		
		Product jean = new Product();
		jean.setName("Jeans");
		jean.setDescription("Regular Fit jean for fashion");
		jean.setImgurl("https://placehold.co/600x400");
		jean.setPrice(550.00);
		jean.setCatagory(clothing);
		
		Product blender = new Product();
		blender.setName("Blender");
		blender.setDescription("Blender to blend smoothie and veggies");
		blender.setImgurl("https://placehold.co/600x400");
		blender.setPrice(5000.00);
		blender.setCatagory(home);
		
		Product woodshelf = new Product();
		woodshelf.setName("Wooden Shelf");
		woodshelf.setDescription("Sturdy wooden shelf for household");
		woodshelf.setImgurl("https://placehold.co/600x400");
		woodshelf.setPrice(9000.00);
		woodshelf.setCatagory(home);
		
		prorepo.saveAll(Arrays.asList(phone,laptop,jacket,jean,blender,woodshelf));
		
		
		
		
	}

}
