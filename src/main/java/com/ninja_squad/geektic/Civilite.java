package com.ninja_squad.geektic;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by k.meissonnier on 22/06/2015.
 */
@Table(name="CIVILITE")
public class Civilite {

    @Id
    @Column(name = "ID")
    public Long id;

    @Column(name = "LABEL")
    public String label;

}
