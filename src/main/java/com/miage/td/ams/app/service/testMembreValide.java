package com.miage.td.ams.app.service;

import com.miage.td.ams.app.service.temps.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class testMembreValide {


    private static final String BASE_URL = "http://localhost:10000/clients";

    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate http;

    public Utilisateur membreValide(String membre, int niveau) {

        return http.getForEntity(BASE_URL + "/" + membre + "/verif" + "?niveau=" + niveau, Utilisateur.class).getBody();
    }
}
