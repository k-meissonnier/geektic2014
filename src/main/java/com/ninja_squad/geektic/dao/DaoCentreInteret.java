package com.ninja_squad.geektic.dao;

import geektic.CentreInteret;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.EntityManager;

/**
 * Created by k.meissonnier on 22/06/2015.
 */
@Repository
public class DaoCentreInteret {

    private EntityManager entityManager;

    public DaoCentreInteret(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }


    public CentreInteret getById (int id)
    {
        String requete = "SELECT c FROM CentreInteret C WHERE c.id = :id" ;
        Query query = entityManager.createQuery(requete);
        query.setParameter("id", id);
        return (CentreInteret) query.getSingleResult();
    }

}