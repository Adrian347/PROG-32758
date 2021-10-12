package ca.sheridancollege.davieadr.beans;

/* 
 * Product Class
 * Assignment 1
 * Name: Adrian Davies
 * Date: 09/27/2021
 */
public class Product {
	private String productCode;
	private String productDescription;
	private int productQuantity;
	private double productUnitPrice;
	
	// Default constructor
	public Product() {
		
	}
	
	// Return product code
	public String getProductCode() {
		return productCode;
	}
	
	// Set new product code
	public void setProductCode(String productCode) {
		this.productCode = productCode;
		}
	
	// Return product description
	public String getProductDescription() {
		return productDescription;
	}
	
	// Set new product description
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	
	// Return product quantity
	public int getProductQuantity() {
		return productQuantity;
	}
	
	// Set new product quantity
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	
	// Return product unit price
	public double getProductUnitPrice() {
		return productUnitPrice;
	}
	
	// Set new product unit price
	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	
	@Override
	public String toString() {
		return productCode + ": " + productDescription + "/n" + productQuantity
				+ "/n" + productUnitPrice;
	}
}
