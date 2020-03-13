package com.miage.td.bank.app.service;

import com.miage.td.bank.app.entities.Compte;
import com.miage.td.bank.app.repository.CompteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MetierCompte {

    @Autowired
    private CompteRepo compterepo;

    public boolean debiter(Compte c, double somme){
        c.solde -= somme;
        return true;
    }

    public boolean crediter(Compte c, double somme){
        c.solde += somme;
        return true;
    }


}
