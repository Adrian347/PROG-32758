package ca.sheridancollege.davieadr.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ca.sheridancollege.davieadr.beans.Product;

/*
 * Controller Class
 * Assignment 1
 * Name: Adrian Davies
 * Date: 09/27/2021
 */

@Controller 
public class Assign1Controller {
	// Declare and create ArrayList of Product objects
	ArrayList<Product> products = new ArrayList<>();
	
	// Get mapping for "index" request
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	// Controller method to bind user input to object of class Product
	@GetMapping("/productInput")
	public String productInputForm(Model model) {
		model.addAttribute("product", new Product());
		return "productInput";
	}
	
	// Controller method to get Product object, add to ArrayList, then add
	// ArrayList to response
	@PostMapping("/productInput")
	public String productInputSubmit(@ModelAttribute Product product, 
			Model model) {
		// Add Product object to ArrayList
		products.add(product);
		
		// Add ArrayList to response
		model.addAttribute("products", products);
		return "productTable";
	}
}
