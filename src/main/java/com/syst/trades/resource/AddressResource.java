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

import com.syst.trades.model.Address;
import com.syst.trades.repository.AddressRepository;

@RestController
@RequestMapping("/address")
public class AddressResource {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@GetMapping
	public List<Address> toList() {
		return addressRepository.findAll();		
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void toSave(@RequestBody Address address, HttpServletResponse response) {
		Address addressSaved = addressRepository.save(address);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{id}")
				.buildAndExpand(addressSaved.getId()).toUri();
		
		response.setHeader("Location", uri.toASCIIString());
	}

}
