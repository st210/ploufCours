package com.miage.td.ams.app.service.temps;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Utilisateur {

    public String login;

    public String mdp;

    public String nom;

    public String prenom;

    public String mail;

    public int niveau;

    public int numlicence;

    public String adresseid;

    public String certificatid;

    public String roleid;

    public boolean cotisation;
}
