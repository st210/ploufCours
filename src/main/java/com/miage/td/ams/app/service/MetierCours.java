package com.miage.td.ams.app.service;

import com.miage.td.ams.app.entities.Cours;
import com.miage.td.ams.app.repository.CoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MetierCours {

    private String membre;

    @Autowired
    private CoursRepo coursRepo;

    /**
     * Ajout d'un membre à un cours
     *
     * @param membre membre de l'association à qui associer un cours
     * @return booleen de confirmation du bon ajout du cours à un membre
     */
    public Cours ajouterCours(String idCours, String membre) {
        // todo : ajout d'un cours à un membre
        Cours cours = coursRepo.findById(idCours).get();
        if (cours.lstMembre.stream().filter(c->membre.equals(c)).count()==0){
            cours.lstMembre.add(membre);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Le membre est déjà présent au cours");
        }

        return this.coursRepo.save(cours);
    }

}
