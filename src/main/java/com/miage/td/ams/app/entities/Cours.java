package com.miage.td.ams.app.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Document(collection = "cours")
public class Cours {
    @Id
    @Size(max = 15)
    public String idCours;

    @Field
    @NotNull
    @Size (max=50)
    public String nom;

    @Field
    @NotNull
    public int niveau;

    @Field
    @NotNull
    @Size (max=10)
    public String dateCours;

    @Field
    public String lieu;

    @Field
    public int duree;

    @Field
    @NotNull
    @Size (max=16)
    public String idProf;

    @Field
    public List<String> lstMembre = new ArrayList<>();
}
