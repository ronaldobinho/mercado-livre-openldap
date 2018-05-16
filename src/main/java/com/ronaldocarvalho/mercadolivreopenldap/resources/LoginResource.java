package com.ronaldocarvalho.mercadolivreopenldap.resources;

import javassist.tools.rmi.ObjectNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ronaldocarvalho.mercadolivreopenldap.domain.Login;
import com.ronaldocarvalho.mercadolivreopenldap.service.LoginService;

@RestController
@RequestMapping(value="/logins")
public class LoginResource {
	
	@Autowired
	private LoginService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Login> find(@PathVariable Integer id) throws ObjectNotFoundException {
		Login obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	
}
