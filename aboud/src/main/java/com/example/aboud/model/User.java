package com.example.aboud.model;


import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idUser;

    @Column
    String nom;

    @Column
    String prenom;

    @Column
    String email;

    @Column
    String password;

    @Column
    String adresse;

    @Column
    String telephone;





}


