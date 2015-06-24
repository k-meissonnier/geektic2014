package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.CentreInteret;
import com.ninja_squad.geektic.Utilisateur;
import com.ninja_squad.geektic.dao.CritereRechercheUtilisateur;
import com.ninja_squad.geektic.dao.DaoCentreInteret;
import com.ninja_squad.geektic.dao.DaoUtilisateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.rmi.CORBA.Util;
import javax.transaction.Transactional;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by k.meissonnier on 24/06/2015.
 */

@RestController
@Transactional
@RequestMapping("/api/resultat")
public class RechercheService {
    @Autowired
    private DaoUtilisateur daoUtilisateur;

    @RequestMapping(value ="{idCentreInteret}/{idCivilite}", method = GET)
    public List<Utilisateur> getCentreInteret(@PathVariable("idCentreInteret") int idCentreInteret, @PathVariable("idCivilite") int idCivilite)
    {
        CritereRechercheUtilisateur critereRechercheUtilisateur = new CritereRechercheUtilisateur();
        critereRechercheUtilisateur.idCentreInteret = idCentreInteret;
        critereRechercheUtilisateur.idCivilite = idCivilite;
        return daoUtilisateur.rechercheListeUtilisateur(critereRechercheUtilisateur);
    }
}
