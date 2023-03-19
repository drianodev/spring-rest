package com.primeirorest.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.primeirorest.dto.ClienteDTO;

@RestController
public class ClientesController {

	@PostMapping(path = "clientes/novo", consumes = "application/json")
	public void novoCliente(@RequestBody ClienteDTO clientedto) {
		System.out.println("Nome do cliente: " + clientedto.getNome() + " " + clientedto.getSobrenome());
		System.out.println("Idade do cliente: " + clientedto.getIdade());
	}
}
