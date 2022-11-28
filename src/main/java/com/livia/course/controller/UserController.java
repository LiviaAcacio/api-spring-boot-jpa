package com.livia.course.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livia.course.entities.User;

//@RestController define esta classe como um controller da entidade user
//@RequestMapping define o caminho da requisição que acessa o controller

@RestController
@RequestMapping(value = "/users")
public class UserController {

	//@GetMapping definie que o endpoint é do tipo get
	//ResponseEntitie   é muito utilizado em arquiteturas voltadas a serviço (SOA), 
	//especificamente na construção de APIs REST, como elemento de resposta (response, daí os nome) para a chamada de determinado serviço.
	
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L,"Maria", "maria@email.com","85988888888","1234");
		return ResponseEntity.ok().body(u);
	}
	
}
