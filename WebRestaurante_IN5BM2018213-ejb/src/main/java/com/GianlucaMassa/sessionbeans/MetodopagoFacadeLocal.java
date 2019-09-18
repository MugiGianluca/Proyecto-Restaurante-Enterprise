/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GianlucaMassa.sessionbeans;

import com.GianlucaMassa.entities.Metodopago;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author programacion
 */
@Local
public interface MetodopagoFacadeLocal {

    void create(Metodopago metodopago);

    void edit(Metodopago metodopago);

    void remove(Metodopago metodopago);

    Metodopago find(Object id);

    List<Metodopago> findAll();

    List<Metodopago> findRange(int[] range);

    int count();
    
}
