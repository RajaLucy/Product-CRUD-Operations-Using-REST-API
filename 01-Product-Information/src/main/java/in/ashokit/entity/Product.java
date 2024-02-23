package in.ashokit.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long productId;
	@Column(name = "Name")
	private String productName;
	@Column(name = "company")
	private String prodcutCompany;
	@Column(name = "price")
	private Long productPrice;
	@Column(name = "Seller")
	private String productSeller;
	@Column(name = "Contact")
	private Long conatct;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProdcutCompany() {
		return prodcutCompany;
	}
	public void setProdcutCompany(String prodcutCompany) {
		this.prodcutCompany = prodcutCompany;
	}
	public Long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Long productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductSeller() {
		return productSeller;
	}
	public void setProductSeller(String productSeller) {
		this.productSeller = productSeller;
	}
	public Long getConatct() {
		return conatct;
	}
	public void setConatct(Long conatct) {
		this.conatct = conatct;
	}
	
	
	
	
	
	
	
	

}
