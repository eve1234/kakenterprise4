/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author yvonneak
 */
@Entity
@Table(name = "container")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Container.findAll", query = "SELECT c FROM Container c"),
    @NamedQuery(name = "Container.findByContainerid", query = "SELECT c FROM Container c WHERE c.containerid = :containerid"),
    @NamedQuery(name = "Container.findByTotalBales", query = "SELECT c FROM Container c WHERE c.totalBales = :totalBales"),
    @NamedQuery(name = "Container.findByCost", query = "SELECT c FROM Container c WHERE c.cost = :cost")})
public class Container implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "containerid")
    private Integer containerid;
    @Basic(optional = false)
    @NotNull
    @Column(name = "totalBales")
    private int totalBales;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cost")
    private double cost;
    @JoinColumn(name = "suppliersid", referencedColumnName = "suppliersid")
    @ManyToOne(optional = false)
    private Suppliers suppliersid;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "containerid")
    private List<Bales> balesList;

    public Container() {
    }

    public Container(Integer containerid) {
        this.containerid = containerid;
    }

    public Container(Integer containerid, int totalBales, double cost) {
        this.containerid = containerid;
        this.totalBales = totalBales;
        this.cost = cost;
    }

    public Integer getContainerid() {
        return containerid;
    }

    public void setContainerid(Integer containerid) {
        this.containerid = containerid;
    }

    public int getTotalBales() {
        return totalBales;
    }

    public void setTotalBales(int totalBales) {
        this.totalBales = totalBales;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Suppliers getSuppliersid() {
        return suppliersid;
    }

    public void setSuppliersid(Suppliers suppliersid) {
        this.suppliersid = suppliersid;
    }

    @XmlTransient
    public List<Bales> getBalesList() {
        return balesList;
    }

    public void setBalesList(List<Bales> balesList) {
        this.balesList = balesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (containerid != null ? containerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Container)) {
            return false;
        }
        Container other = (Container) object;
        if ((this.containerid == null && other.containerid != null) || (this.containerid != null && !this.containerid.equals(other.containerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kakenterprise4.entities.Container[ containerid=" + containerid + " ]";
    }
    
}
