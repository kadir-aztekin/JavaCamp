package kodlamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.ProductService;
import kodlamaio.northwind.entities.concretes.Product;

@RestController //SEN BİR CONTROLLERSIN (APİ)
@RequestMapping("/api/products") //DOMAİN SONUNA GELECEK YERİ BELLİ ETTIK
public class ProductsController {
	
	private ProductService productService;
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall") //GET MI YOKSA POST MI ISLEMLERI OLDUGUNU BELLİ ETTİK 
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
