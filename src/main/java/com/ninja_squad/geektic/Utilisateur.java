package com.ninja_squad.geektic;
import javax.persistence.*;
import java.util.Date;
import java.util.List;

/**
 * Created by k.meissonnier on 22/06/2015.
 */
@Entity
@Table(name="Utilisateur")
public class Utilisateur {

    @Id
    @Column(name = "ID")
    public int id;

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

    @ManyToMany (fetch=FetchType.EAGER)
    @JoinTable(name="CentreInteret_Utilisateur", joinColumns={@JoinColumn(name="FK_IdUtilisateur", referencedColumnName="ID")},
            inverseJoinColumns={@JoinColumn(name="FK_IdCentreInteret", referencedColumnName="ID")})
    public List<CentreInteret> listeCentreInteret;

}



