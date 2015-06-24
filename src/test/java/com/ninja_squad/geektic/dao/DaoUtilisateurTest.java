package com.ninja_squad.geektic.dao;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.CentreInteret;
import com.ninja_squad.geektic.Civilite;
import com.ninja_squad.geektic.Utilisateur;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class DaoUtilisateurTest extends BaseDaoTest {

    @Autowired
    private DaoUtilisateur dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf();
        dao = new DaoUtilisateur(em);
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }

    @Test
    public void testGetById() throws Exception {
        Utilisateur utilisateur = dao.getById(1);
        assertEquals(utilisateur.nom, "Cubeddu");
    }

    @Test
    public void testGetByEmail()  {
        Utilisateur utilisateur = dao.getByEmail("kevin.meissonnier@email.com");
        assertEquals(utilisateur.nom, "Meissonnier");
    }

    @Test
    public void testRechercheListeUtilisateur(){
        CritereRechercheUtilisateur critereRechercheUtilisateur = new CritereRechercheUtilisateur();
        critereRechercheUtilisateur.idCentreInteret = 1;
        critereRechercheUtilisateur.idCivilite = 1;
        List<Utilisateur> listeUtilisateur = dao.rechercheListeUtilisateur(critereRechercheUtilisateur);
        assertTrue(listeUtilisateur.size() > 0);

        for (Utilisateur u : listeUtilisateur)
        {
            assertTrue(u.civilite.id == 1);
        }

    }
}