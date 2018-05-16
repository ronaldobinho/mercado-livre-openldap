package com.ronaldocarvalho.mercadolivreopenldap.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Login implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    
	private String nome;
	private String sobrenome;
	private String email;
	
	public Login() {
		
	}

	public Login(Integer id, String nome, String sobrenome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Login [id=");
		builder.append(id);
		builder.append(", nome=");
		builder.append(nome);
		builder.append(", sobrenome=");
		builder.append(sobrenome);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	

	
}
