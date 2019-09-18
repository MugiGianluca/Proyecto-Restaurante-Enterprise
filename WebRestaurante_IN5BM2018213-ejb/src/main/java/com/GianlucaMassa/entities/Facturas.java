/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GianlucaMassa.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "facturas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facturas.findAll", query = "SELECT f FROM Facturas f")
    , @NamedQuery(name = "Facturas.findByIdFacturas", query = "SELECT f FROM Facturas f WHERE f.idFacturas = :idFacturas")
    , @NamedQuery(name = "Facturas.findByFecha", query = "SELECT f FROM Facturas f WHERE f.fecha = :fecha")
    , @NamedQuery(name = "Facturas.findByTotalpago", query = "SELECT f FROM Facturas f WHERE f.totalpago = :totalpago")
    , @NamedQuery(name = "Facturas.findByVentatotal", query = "SELECT f FROM Facturas f WHERE f.ventatotal = :ventatotal")})
public class Facturas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idFacturas")
    private Integer idFacturas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalpago")
    private double totalpago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ventatotal")
    private int ventatotal;
    @JoinColumn(name = "idcliente", referencedColumnName = "idclientes")
    @ManyToOne(optional = false)
    private Clientes idcliente;
    @JoinColumn(name = "idmesa", referencedColumnName = "idmesas")
    @ManyToOne(optional = false)
    private Mesas idmesa;
    @JoinColumn(name = "idmeseros", referencedColumnName = "idmeseros")
    @ManyToOne(optional = false)
    private Meseros idmeseros;
    @JoinColumn(name = "idmetodopago", referencedColumnName = "idmetodopago")
    @ManyToOne(optional = false)
    private Metodopago idmetodopago;

    public Facturas() {
    }

    public Facturas(Integer idFacturas) {
        this.idFacturas = idFacturas;
    }

    public Facturas(Integer idFacturas, Date fecha, double totalpago, int ventatotal) {
        this.idFacturas = idFacturas;
        this.fecha = fecha;
        this.totalpago = totalpago;
        this.ventatotal = ventatotal;
    }

    public Integer getIdFacturas() {
        return idFacturas;
    }

    public void setIdFacturas(Integer idFacturas) {
        this.idFacturas = idFacturas;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotalpago() {
        return totalpago;
    }

    public void setTotalpago(double totalpago) {
        this.totalpago = totalpago;
    }

    public int getVentatotal() {
        return ventatotal;
    }

    public void setVentatotal(int ventatotal) {
        this.ventatotal = ventatotal;
    }

    public Clientes getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(Clientes idcliente) {
        this.idcliente = idcliente;
    }

    public Mesas getIdmesa() {
        return idmesa;
    }

    public void setIdmesa(Mesas idmesa) {
        this.idmesa = idmesa;
    }

    public Meseros getIdmeseros() {
        return idmeseros;
    }

    public void setIdmeseros(Meseros idmeseros) {
        this.idmeseros = idmeseros;
    }

    public Metodopago getIdmetodopago() {
        return idmetodopago;
    }

    public void setIdmetodopago(Metodopago idmetodopago) {
        this.idmetodopago = idmetodopago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFacturas != null ? idFacturas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facturas)) {
            return false;
        }
        Facturas other = (Facturas) object;
        if ((this.idFacturas == null && other.idFacturas != null) || (this.idFacturas != null && !this.idFacturas.equals(other.idFacturas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.GianlucaMassa.entities.Facturas[ idFacturas=" + idFacturas + " ]";
    }
    
}
