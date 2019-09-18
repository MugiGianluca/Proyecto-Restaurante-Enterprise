package com.GianlucaMassa.entities;

import com.GianlucaMassa.entities.Clientes;
import com.GianlucaMassa.entities.Mesas;
import com.GianlucaMassa.entities.Meseros;
import com.GianlucaMassa.entities.Metodopago;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20170811-rNA", date="2019-09-17T11:31:49")
@StaticMetamodel(Facturas.class)
public class Facturas_ { 

    public static volatile SingularAttribute<Facturas, Mesas> idmesa;
    public static volatile SingularAttribute<Facturas, Date> fecha;
    public static volatile SingularAttribute<Facturas, Integer> ventatotal;
    public static volatile SingularAttribute<Facturas, Integer> idFacturas;
    public static volatile SingularAttribute<Facturas, Meseros> idmeseros;
    public static volatile SingularAttribute<Facturas, Metodopago> idmetodopago;
    public static volatile SingularAttribute<Facturas, Clientes> idcliente;
    public static volatile SingularAttribute<Facturas, Double> totalpago;

}