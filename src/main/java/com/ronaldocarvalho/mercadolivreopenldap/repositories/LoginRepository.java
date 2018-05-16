package com.ronaldocarvalho.mercadolivreopenldap.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ronaldocarvalho.mercadolivreopenldap.domain.Login;


@Repository
public interface LoginRepository extends JpaRepository<Login, Integer> {

}
