package com.ninja_squad.geektic.service;

/**
 * A fake hello message just to test that everything is fine
 * @author JB Nizet
 */
public class HelloMessage {
    public String getMessage() {
        /*EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("geektic");
        EntityManager entity = entityManagerFactory.createEntityManager();
        DaoCentreInteret dao = new DaoCentreInteret(entity);
        CentreInteret centreInteret = dao.getById(2);*/
        return "Hello, Geek! : ";
    }
}
