package com.miage.td.bank.app.repository;

import com.miage.td.bank.app.entities.Compte;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepo extends CrudRepository<Compte,String> {

}
