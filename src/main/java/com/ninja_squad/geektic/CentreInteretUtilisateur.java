package com.ninja_squad.geektic;

import javax.persistence.*;

/**
 * Created by k.meissonnier on 24/06/2015.
 */
    @Entity
    @Table(name="CentreInteret_Utilisateur")
public class CentreInteretUtilisateur {
        @Id
        @Column(name = "ID")
        public int id;

        @ManyToOne
        @JoinColumn(name = "FK_IdUtilisateur")
        public Utilisateur utilisateur;

        @ManyToOne
        @JoinColumn(name = "FK_IdCentreInteret")
        public CentreInteret centreInteret;

    }

