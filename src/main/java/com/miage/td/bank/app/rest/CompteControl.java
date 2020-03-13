package com.miage.td.bank.app.rest;

import com.miage.td.bank.app.entities.Compte;
import com.miage.td.bank.app.repository.CompteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/comptes")
public class CompteControl {
    @Autowired
    private CompteRepo compteRepo;

    @PostMapping("/")
    Compte postCompte(Compte compte){
        return this.compteRepo.save(compte);
    }

    @GetMapping("/{id}")
    Compte getCompte(@PathVariable("id") Compte c){
        return c;
    }
}
