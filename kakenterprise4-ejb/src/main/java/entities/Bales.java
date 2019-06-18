/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yvonneak
 */
@Entity
@Table(name = "bales")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bales.findAll", query = "SELECT b FROM Bales b"),
    @NamedQuery(name = "Bales.findByBalesid", query = "SELECT b FROM Bales b WHERE b.balesid = :balesid"),
    @NamedQuery(name = "Bales.findByPicture", query = "SELECT b FROM Bales b WHERE b.picture = :picture"),
    @NamedQuery(name = "Bales.findByPrice", query = "SELECT b FROM Bales b WHERE b.price = :price")})
public class Bales implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "balesid")
    private Integer balesid;
    @Size(max = 70)
    @Column(name = "picture")
    private String picture;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @JoinColumn(name = "containerid", referencedColumnName = "containerid")
    @ManyToOne(optional = false)
    private Container containerid;

    public Bales() {
    }

    public Bales(Integer balesid) {
        this.balesid = balesid;
    }

    public Integer getBalesid() {
        return balesid;
    }

    public void setBalesid(Integer balesid) {
        this.balesid = balesid;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Container getContainerid() {
        return containerid;
    }

    public void setContainerid(Container containerid) {
        this.containerid = containerid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (balesid != null ? balesid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bales)) {
            return false;
        }
        Bales other = (Bales) object;
        if ((this.balesid == null && other.balesid != null) || (this.balesid != null && !this.balesid.equals(other.balesid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.kakenterprise4.entities.Bales[ balesid=" + balesid + " ]";
    }
    
}
