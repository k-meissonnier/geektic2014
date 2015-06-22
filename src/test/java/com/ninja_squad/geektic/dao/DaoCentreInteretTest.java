package com.ninja_squad.geektic.dao;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.operation.Operation;
import geektic.CentreInteret;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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
        int id = 1;
        CentreInteret centreInteret = dao.getById(id);
        assertEquals(centreInteret.label, "C#");
    }
}