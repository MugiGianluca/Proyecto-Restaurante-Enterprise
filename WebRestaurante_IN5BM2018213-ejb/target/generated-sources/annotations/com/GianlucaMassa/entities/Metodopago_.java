package com.GianlucaMassa.entities;

import com.GianlucaMassa.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:31:49")
@StaticMetamodel(Metodopago.class)
public class Metodopago_ { 

    public static volatile SingularAttribute<Metodopago, String> descripcion;
    public static volatile SingularAttribute<Metodopago, Integer> idmetodopago;
    public static volatile ListAttribute<Metodopago, Facturas> facturasList;

}