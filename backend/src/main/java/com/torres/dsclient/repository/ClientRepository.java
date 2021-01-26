package com.torres.dsclient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.torres.dsclient.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
