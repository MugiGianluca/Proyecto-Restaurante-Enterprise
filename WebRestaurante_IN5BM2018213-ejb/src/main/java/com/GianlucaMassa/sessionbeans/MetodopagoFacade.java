/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GianlucaMassa.sessionbeans;

import com.GianlucaMassa.entities.Metodopago;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author programacion
 */
@Stateless
public class MetodopagoFacade extends AbstractFacade<Metodopago> implements MetodopagoFacadeLocal {

    @PersistenceContext(unitName = "WebRestaurante_IN5BM_2018213PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MetodopagoFacade() {
        super(Metodopago.class);
    }
    
}
