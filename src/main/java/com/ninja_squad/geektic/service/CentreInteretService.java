package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.CentreInteret;
import com.ninja_squad.geektic.dao.DaoCentreInteret;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by k.meissonnier on 24/06/2015.
 */
@RestController
@Transactional
@RequestMapping("/api/recherche/centreInteret")

public class CentreInteretService {
    @Autowired
    private DaoCentreInteret daoCentreInteret;

    @RequestMapping(method = GET)
    public List<CentreInteret> getCentreInteret()
    {
        return daoCentreInteret.getListCentreInteret();
    }
}

