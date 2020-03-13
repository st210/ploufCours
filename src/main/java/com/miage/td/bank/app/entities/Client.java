package com.miage.td.bank.app.entities;

import org.hibernate.validator.constraints.Length;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Client {
    @Id
    @Column(length = 15)
    @Size (max=15)
    public String id;

    @NotNull
    public String nom;
    @NotNull
    public String prenom;


    @OneToMany
    public List<Compte> comptes;
}

