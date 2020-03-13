package com.miage.td.bank.app.repository;

import com.miage.td.bank.app.entities.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepo extends CrudRepository<Client,String> {
    Client getClientByNom(String nom);
}
