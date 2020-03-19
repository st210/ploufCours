package com.miage.td.bank.app.rest;

import com.miage.td.bank.app.entities.Compte;
import com.miage.td.bank.app.repository.CompteRepo;
import com.sun.media.jfxmedia.logging.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController("/")
public class CompteControl {
    //Logger logger = LoggerFactory.getLogger(CompteControl.class);


    @Autowired
    private CompteRepo compteRepo;



    @GetMapping("{id}")
    public Compte getCompte(@PathVariable("id") Compte c){
        return c;
    }

    @GetMapping("")
    public Iterable<Compte> getCompte(@RequestParam("client") String id){
        long idl= Long.parseLong(id);
        return compteRepo.findAllByIdclient(idl);
    }

    @PostMapping("")
    public Compte postCompte(@RequestBody Compte compte){
        return this.compteRepo.save(compte);
    }
}
