package in.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.Repository.ProductRepository;
import in.ashokit.entity.Product;

@Service
public class ProductService  implements ProductServiceMethods{
	
	/**
	 * 
	 */
	@Autowired
	private ProductRepository productRepo;

	@Override
	public Product saveProduct(Product p) {
		return productRepo.save(p);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}

	@Override
	public boolean updateProduct(Product p) {
		Optional<Product> findById = productRepo.findById(p.getProductId());
		if(findById.isPresent())
		{
			Product product = findById.get();
			product.setProductName(p.getProductName());
			product.setProductPrice(p.getProductPrice());
			product.setProdcutCompany(p.getProdcutCompany());
			product.setConatct(p.getConatct());
			product.setProductSeller(p.getProductSeller());
			productRepo.save(product);
			return true;
			
		}
		return false;
	}

	@Override
	public void deleteProduct(Long id) {
		
		productRepo.deleteById(id);
	}

	
	
	

}
