package com.syst.trades.resource;

import java.net.URI;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.syst.trades.model.Product;
import com.syst.trades.repository.ProductRepository;

@RestController
@RequestMapping("/product")
public class ProductResource {
	
	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping
	public List<Product> toList() {
		return productRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void toSave(@RequestBody Product product, HttpServletResponse response) {
		Product productSaved = productRepository.save(product);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(productSaved.getId()).toUri();
		
		response.setHeader("Location", uri.toASCIIString());
	}
	
}
