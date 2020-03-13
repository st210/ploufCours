package com.miage.td.bank.app.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

@Entity
public class Compte {
    @Id
    @Column(length = 15)
    @Size (max=15)
    public String id;


    public double solde;

    @ManyToOne
    public Client c;





}
