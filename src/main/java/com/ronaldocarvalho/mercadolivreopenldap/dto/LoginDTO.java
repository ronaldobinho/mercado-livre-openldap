package com.ronaldocarvalho.mercadolivreopenldap.dto;

import java.io.Serializable;

import com.ronaldocarvalho.mercadolivreopenldap.domain.Login;


public class LoginDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String sobrenome;
	private String email;
	
	public LoginDTO() {
		
	}

	/**
	 * @param nome
	 * @param sobrenome
	 * @param email
	 */
	public LoginDTO(Login login) {
		super();
		this.nome = login.getNome();
		this.sobrenome = login.getSobrenome();
		this.email = login.getEmail();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
}
