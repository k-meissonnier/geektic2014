package com.ninja_squad.geektic;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by k.meissonnier on 22/06/2015.
 */
@Table(name="Utilisateur")
public class Utilisateur {

    @Id
    @Column(name = "ID")
    public Long id;

    @Column(name = "NOM")
    public String nom;

    @Column(name = "PRENOM")
    public String prenom;

    @Column(name = "EMAIL")
    public String email;

    @ManyToOne
    @JoinColumn(name = "FK_IDCIVILITE")
    public Civilite civilite;

    @Column(name = "DATEINSCRIPTION")
    public Date dateInscription;


    public List<CentreInteret> listeCentreInteret;


}



