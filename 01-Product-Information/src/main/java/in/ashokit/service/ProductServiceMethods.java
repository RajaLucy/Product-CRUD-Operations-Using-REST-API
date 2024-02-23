package in.ashokit.service;

import java.util.List;

import in.ashokit.entity.Product;

public interface ProductServiceMethods {
	
	public Product saveProduct(Product p);
	
	public List<Product> getAllProducts();
	
	public boolean updateProduct(Product p);
	
	public void deleteProduct(Long id);

}
