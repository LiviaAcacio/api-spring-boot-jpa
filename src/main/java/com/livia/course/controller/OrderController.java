package com.livia.course.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.livia.course.entities.Order;
import com.livia.course.entities.User;
import com.livia.course.services.OrderService;
import com.livia.course.services.UserService;

//@RestController define esta classe como um controller da entidade user
//@RequestMapping define o caminho da requisição que acessa o controller

@RestController
@RequestMapping(value = "/orers")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	//@GetMapping definie que o endpoint é do tipo get
	//ResponseEntitie   é muito utilizado em arquiteturas voltadas a serviço (SOA), 
	//especificamente na construção de APIs REST, como elemento de resposta (response, daí os nome) para a chamada de determinado serviço.
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){ 
		//@PathVariable permite que eu indque ao spring que o id passado como argumento
		// venha na url da requisição
		Order findId = orderService.findById(id);
		return ResponseEntity.ok().body(findId);
	}
	
}
