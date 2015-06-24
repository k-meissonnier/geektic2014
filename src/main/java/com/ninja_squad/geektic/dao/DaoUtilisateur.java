package com.ninja_squad.geektic.dao;

import com.ninja_squad.geektic.CentreInteret;
import com.ninja_squad.geektic.Civilite;
import com.ninja_squad.geektic.Utilisateur;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by k.meissonnier on 22/06/2015.
 */
@Repository
public class DaoUtilisateur {
    @PersistenceContext
    private EntityManager entityManager;

    public DaoUtilisateur(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    public DaoUtilisateur()
    {

    }

    public Utilisateur getById (int id)
    {
        String requete = "SELECT u FROM Utilisateur u WHERE u.id = :id" ;
        Query query = entityManager.createQuery(requete);
        query.setParameter("id", id);
        return (Utilisateur) query.getSingleResult();
    }

    public Utilisateur getByEmail (String email)
    {
        String requete = "SELECT u FROM Utilisateur u WHERE u.email = :email" ;
        Query query = entityManager.createQuery(requete);
        query.setParameter("email", email);
        return (Utilisateur) query.getSingleResult();
    }

    public List<Utilisateur> rechercheListeUtilisateur (CritereRechercheUtilisateur critere)
    {
        int idCivilite = critere.idCivilite;
        int idCentreInteret = critere.idCentreInteret;
        String requete = "SELECT u FROM CentreInteretUtilisateur ciu "
                + "INNER JOIN ciu.utilisateur u "
                + "INNER JOIN ciu.centreInteret ci "
                + "INNER JOIN u.civilite c "
                + "WHERE ci.id = :idCentreInteret AND c.id = :idCivilite";

        Query query = entityManager.createQuery(requete);
        query.setParameter("idCentreInteret", idCentreInteret);
        query.setParameter("idCivilite", idCivilite);
        return query.getResultList();
    }


}
