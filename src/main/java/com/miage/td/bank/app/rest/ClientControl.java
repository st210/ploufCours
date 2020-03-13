package com.miage.td.bank.app.rest;

import com.miage.td.bank.app.entities.Client;
import com.miage.td.bank.app.repository.ClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientControl {

    @Autowired
    private ClientRepo clientRepo;

    @PostMapping("/")
    Client postClient(Client client){
        return this.clientRepo.save(client);
    }

    @GetMapping("/{id}")
    Client getClient(@PathVariable("id") Client c){
        return c;
    }
}
