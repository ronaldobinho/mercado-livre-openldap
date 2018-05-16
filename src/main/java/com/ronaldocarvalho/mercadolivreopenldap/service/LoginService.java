package com.ronaldocarvalho.mercadolivreopenldap.service;

import java.util.Optional;

import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ronaldocarvalho.mercadolivreopenldap.domain.Login;
import com.ronaldocarvalho.mercadolivreopenldap.repositories.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;

	public Login find(Integer id) {
		Optional<Login> obj = loginRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: "
						+ Login.class.getName(), null));
	}

	@Transactional
	public Login insert(Login obj) {
		obj.setId(null);
		return loginRepository.save(obj);
	}

	

}
