package com.miage.td.bank.app.repository;

import com.miage.td.bank.app.entities.Compte;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompteRepo extends MongoRepository<Compte,Long> {

    List<Compte> findAllByIdclient(Long idclient);

}
