package com.ronaldocarvalho.mercadolivreopenldap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ronaldocarvalho.mercadolivreopenldap.service.ArquivoService;

@SpringBootApplication
public class MercadoLivreOpenldapApplication {

	public static void main(String[] args) {
		SpringApplication.run(MercadoLivreOpenldapApplication.class, args);
		
		
		ArquivoService arqiv = new  ArquivoService();
		
		arqiv.lerArquivo();
	}
}
