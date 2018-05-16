package com.ronaldocarvalho.mercadolivreopenldap.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ronaldocarvalho.mercadolivreopenldap.domain.Login;
import com.ronaldocarvalho.mercadolivreopenldap.repositories.LoginRepository;

@Service
public class ArquivoService {

	@Autowired
	private LoginRepository loginRepository;

	public void lerArquivo() {
		String arquivoCSV = "C:/Logins.csv";
		BufferedReader br = null;
		String linha = "";
		String csvDivisor = "";

		try {
			br = new BufferedReader(new FileReader(arquivoCSV));
			while ((linha = br.readLine()) != null) {
				String[] login = linha.split(csvDivisor);
				Login usuarios = new Login(null, login[0], login[1], login[2]);
				loginRepository.saveAll(Arrays.asList(usuarios));
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
