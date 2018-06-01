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

import com.syst.trades.model.Client;
import com.syst.trades.repository.ClientRepository;

@RestController
@RequestMapping("/client")
public class ClientResource {
	
	@Autowired
	private ClientRepository clientRepository;

	@GetMapping
	public List<Client> toList() {
		return clientRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void toSave(@RequestBody Client client, HttpServletResponse response) {
		Client clientSaved = clientRepository.save(client);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(clientSaved.getId()).toUri();
		
		response.setHeader("Location", uri.toASCIIString());
	}
	
}
