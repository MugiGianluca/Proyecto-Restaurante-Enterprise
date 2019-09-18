package com.GianlucaMassa.entities;

import com.GianlucaMassa.entities.Areas;
import com.GianlucaMassa.entities.Facturas;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:31:49")
@StaticMetamodel(Mesas.class)
public class Mesas_ { 

    public static volatile SingularAttribute<Mesas, Integer> idmesas;
    public static volatile SingularAttribute<Mesas, Areas> idarea;
    public static volatile ListAttribute<Mesas, Facturas> facturasList;

}