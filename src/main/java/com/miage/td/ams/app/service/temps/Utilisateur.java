package com.miage.td.ams.app.service.temps;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Utilisateur {

    public String login;

    public String nom;

    public String prenom;

    public String mail;

    public int niveau;

    public int num_licence;

    public String adresse_id;

    public String certificat_id;

    public String role_id;

    public boolean cotisation = false;
}
