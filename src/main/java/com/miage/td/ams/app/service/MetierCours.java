package com.miage.td.ams.app.service;

import com.fasterxml.classmate.MemberResolver;
import com.miage.td.ams.app.entities.Cours;
import com.miage.td.ams.app.repository.CoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.server.ResponseStatusException;

import java.lang.reflect.Member;

@Service
public class MetierCours {

    private String membre;

    @Autowired
    private CoursRepo coursRepo;

    private static final String BASE_URL = "http://localhost:10000/clients";

    @Qualifier("http")
    private RestTemplate http;

    /**
     * Ajout d'un cours à un membre
     *
     * @param membre membre de l'association à qui associer un cours
     * @return booleen de confirmation du bon ajout du cours à un membre
     */
    public Cours ajouterCours(String idCours, String membre) {
        // todo : ajout d'un cours à un membre
        Cours cours = coursRepo.findById(idCours).get();
        if (membreValide(membre, cours.niveau)) //Envoyer requêtes de valdidation vers PloufMembres
        {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Le membre ne peut pas s'inscrire dû à des problèmes admistratifs");
        }
        if (cours.lstMembre.stream().filter(c->membre.equals(c)).count()==0){
            cours.lstMembre.add(membre);
        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Le membre est déjà présent au cours");
        }
        if (cours.lstMembre.stream().count() > 2) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Seul deux personnes peuvent participer");
        }

        return this.coursRepo.save(cours);
    }

    public boolean membreValide(String membre, int niveau) {

        return http.getForEntity(BASE_URL + "/" + membre + "/verif" + "?niveau=" + niveau, boolean.class).getBody();
    }

}
