package com.miage.td.bank.app.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.Size;

@Document
public class Compte {
    @Id
    @Size (max=15)
    public String id;


    public double solde;

    public Long idcclient;





}
