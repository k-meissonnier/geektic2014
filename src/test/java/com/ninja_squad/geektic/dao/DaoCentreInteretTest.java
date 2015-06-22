package com.ninja_squad.geektic.dao;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import com.ninja_squad.geektic.CentreInteret;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class DaoCentreInteretTest extends BaseDaoTest{

    @Autowired
    private DaoCentreInteret dao;

    @Before
    public void populateDatabase() {
        Operation operation = Operations.sequenceOf();
        dao = new DaoCentreInteret(em);
        DbSetup dbSetup = new DbSetup(destination, operation);
        dbSetup.launch();
    }

    @Test
    public void testGetById(){
        CentreInteret centreInteret = dao.getById(1);
        assertEquals(centreInteret.label, "C#");
    }

    @Test
    public void testGetListCentreInteret(){
        List<CentreInteret> listeCentreInteret = dao.getListCentreInteret();
        assertTrue(listeCentreInteret.size() > 0);
    }
}