package in.ashokit.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
