package com.miage.td.ams.app.service;

import com.miage.td.ams.app.entities.Membre;
import org.springframework.stereotype.Service;

@Service
public class MetierCours {

    private Membre membre;

    /**
     * Ajout d'un cours à un membre
     *
     * @param membre membre de l'association à qui associer un cours
     * @return booleen de confirmation du bon ajout du cours à un membre
     */
    public boolean ajouterCours(Membre membre) {
        // todo : ajout d'un cours à un membre
        return true;
    }

}
