/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Programador
 */
@Entity
@Table(name = "guestcheck")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Guestcheck.findAll", query = "SELECT g FROM Guestcheck g")
    , @NamedQuery(name = "Guestcheck.findByCode", query = "SELECT g FROM Guestcheck g WHERE g.code = :code")
    , @NamedQuery(name = "Guestcheck.findByBarcode", query = "SELECT g FROM Guestcheck g WHERE g.barcode = :barcode")
    , @NamedQuery(name = "Guestcheck.findByActive", query = "SELECT g FROM Guestcheck g WHERE g.active = :active")})
public class Guestcheck implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Column(name = "barcode")
    private String barcode;
    @Column(name = "active")
    private String active;
    @OneToMany(mappedBy = "codeGuestcheck")
    private Collection<Request> requestCollection;

    public Guestcheck() {
    }

    public Guestcheck(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @XmlTransient
    public Collection<Request> getRequestCollection() {
        return requestCollection;
    }

    public void setRequestCollection(Collection<Request> requestCollection) {
        this.requestCollection = requestCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Guestcheck)) {
            return false;
        }
        Guestcheck other = (Guestcheck) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Guestcheck[ code=" + code + " ]";
    }
    
}
