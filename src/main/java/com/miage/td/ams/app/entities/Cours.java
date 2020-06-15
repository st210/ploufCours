package com.miage.td.ams.app.entities;

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
@Document(collection = "cours")
public class Cours {
    @Id
    @Size(max = 15)
    public long id;

    @Field
    public String intitule;

}
