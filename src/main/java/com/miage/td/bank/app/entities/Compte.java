package com.miage.td.bank.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "comptes")
public class Compte {
    @Id
    @Size (max=15)
    public long id;

    @Field
    public double solde;

    @Field
    public long idclient;

}
