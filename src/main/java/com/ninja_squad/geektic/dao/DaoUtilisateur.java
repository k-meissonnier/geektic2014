package com.ninja_squad.geektic.dao;

import com.ninja_squad.geektic.Utilisateur;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 * Created by k.meissonnier on 22/06/2015.
 */
@Repository
public class DaoUtilisateur {

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
        String requete = "SELECT c FROM Utilisateur c WHERE c.id = :id" ;
        Query query = entityManager.createQuery(requete);
        query.setParameter("id", id);
        return (Utilisateur) query.getSingleResult();
    }

    public Utilisateur getByEmail (String email)
    {
        String requete = "SELECT c FROM Utilisateur c WHERE c.email = :email" ;
        Query query = entityManager.createQuery(requete);
        query.setParameter("email", "kevin.meissonnier@email.com");
        return (Utilisateur) query.getSingleResult();
    }


}
