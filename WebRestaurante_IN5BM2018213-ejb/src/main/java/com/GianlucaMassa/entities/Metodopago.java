/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.GianlucaMassa.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author programacion
 */
@Entity
@Table(name = "metodopago")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Metodopago.findAll", query = "SELECT m FROM Metodopago m")
    , @NamedQuery(name = "Metodopago.findByIdmetodopago", query = "SELECT m FROM Metodopago m WHERE m.idmetodopago = :idmetodopago")
    , @NamedQuery(name = "Metodopago.findByDescripcion", query = "SELECT m FROM Metodopago m WHERE m.descripcion = :descripcion")})
public class Metodopago implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idmetodopago")
    private Integer idmetodopago;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idmetodopago")
    private List<Facturas> facturasList;

    public Metodopago() {
    }

    public Metodopago(Integer idmetodopago) {
        this.idmetodopago = idmetodopago;
    }

    public Metodopago(Integer idmetodopago, String descripcion) {
        this.idmetodopago = idmetodopago;
        this.descripcion = descripcion;
    }

    public Integer getIdmetodopago() {
        return idmetodopago;
    }

    public void setIdmetodopago(Integer idmetodopago) {
        this.idmetodopago = idmetodopago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Facturas> getFacturasList() {
        return facturasList;
    }

    public void setFacturasList(List<Facturas> facturasList) {
        this.facturasList = facturasList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmetodopago != null ? idmetodopago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Metodopago)) {
            return false;
        }
        Metodopago other = (Metodopago) object;
        if ((this.idmetodopago == null && other.idmetodopago != null) || (this.idmetodopago != null && !this.idmetodopago.equals(other.idmetodopago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.GianlucaMassa.entities.Metodopago[ idmetodopago=" + idmetodopago + " ]";
    }
    
}
