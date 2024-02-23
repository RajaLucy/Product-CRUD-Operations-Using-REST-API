package in.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.entity.Product;
import in.ashokit.service.ProductService;

@RestController
public class ProductController {
	
	
	@Autowired
	private ProductService productService;
	
	
	//save the prduct
	
	@PostMapping("/save")
	public ResponseEntity<String> insertProduct(@RequestBody Product p)
	{
		Product saveProduct = productService.saveProduct(p);
		if(saveProduct.getProductId()!=null)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body("Product Saved Successfully");
		}
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Your Product is not saved");
	}
	
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProdcts(){
		
		
		List<Product> allProducts = productService.getAllProducts();
		
		return ResponseEntity.ok(allProducts);
		
	}
	
	
	@PutMapping("/update")
	public ResponseEntity<String> updateProduct(@RequestBody Product p)
	{
		boolean updateProduct = productService.updateProduct(p);
		if(updateProduct)
		{
			return ResponseEntity.status(HttpStatus.ACCEPTED).body("Product Updated");
		}
		
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Not Found Product");

		
	}
	
	@DeleteMapping("/deleteproduct/{id}")
	public ResponseEntity<String> removeProduct(@PathVariable Long id){
		productService.deleteProduct(id);
	    return ResponseEntity.ok("Product Deleted Success");
	}
	
	
	

}
