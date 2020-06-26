package com.miage.td.ams.app.repository;

import com.miage.td.ams.app.entities.Cours;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CoursRepo extends MongoRepository<Cours,String> {

    List<Cours> findAllByLogin(String login);

}
