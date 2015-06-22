package com.ninja_squad.geektic.dao;

import com.ninja_squad.geektic.CentreInteret;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import javax.persistence.EntityManager;
import java.util.List;

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

    public DaoCentreInteret()
    {

    }


    public CentreInteret getById (int id)
    {
        String requete = "SELECT c FROM CentreInteret c WHERE c.id = :id" ;
        Query query = entityManager.createQuery(requete);
        query.setParameter("id", id);
        return (CentreInteret) query.getSingleResult();
    }

    public List<CentreInteret> getListCentreInteret()
    {
        String requete = "SELECT c FROM CentreInteret c" ;
        Query query = entityManager.createQuery(requete);
        return query.getResultList();
    }

}