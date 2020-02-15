package com.syst.trades.resource;

import java.net.URI;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.syst.trades.model.Address;
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
	
	@GetMapping("/{id}")
	public ResponseEntity<Client> clientById(@PathVariable Long id) {
		Client client = clientRepository.findOne(id);
		return client != null ? ResponseEntity.ok(client) : ResponseEntity.notFound().build();

	}

	@PostMapping
	/*
	 * O @Valid é para validar os campos de acordo com suas propriedades
	 * especificados na camada model atributos @NotNull por exemplo, daí no retorno
	 * de um post sem um atributo obrigatório, o sistema trata, não deixando o erro
	 * chegar ao banco de dados e travando o sistema (retornando erro 500 para o
	 * client (erro server side) e sim uma mensagem de erro (400) bad request, erro
	 * no lado do client)
	 */
	public ResponseEntity<Client> toSave(@Valid @RequestBody Client client) {

		Date date = new Date(System.currentTimeMillis());
		client.setCreationDate(date);
		Client clientSaved = clientRepository.save(client);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(clientSaved.getId())
				.toUri();

		return ResponseEntity.created(uri).body(clientSaved);
	}

}
