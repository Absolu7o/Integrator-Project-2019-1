/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Programador
 */
@Entity
@Table(name = "enableinsert")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enableinsert.findAll", query = "SELECT e FROM Enableinsert e")
    , @NamedQuery(name = "Enableinsert.findByCode", query = "SELECT e FROM Enableinsert e WHERE e.code = :code")
    , @NamedQuery(name = "Enableinsert.findByTablelist", query = "SELECT e FROM Enableinsert e WHERE e.tablelist = :tablelist")
    , @NamedQuery(name = "Enableinsert.findByGuestcheck", query = "SELECT e FROM Enableinsert e WHERE e.guestcheck = :guestcheck")})
public class Enableinsert implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Column(name = "tablelist")
    private String tablelist;
    @Column(name = "guestcheck")
    private String guestcheck;

    public Enableinsert() {
    }

    public Enableinsert(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getTablelist() {
        return tablelist;
    }

    public void setTablelist(String tablelist) {
        this.tablelist = tablelist;
    }

    public String getGuestcheck() {
        return guestcheck;
    }

    public void setGuestcheck(String guestcheck) {
        this.guestcheck = guestcheck;
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
        if (!(object instanceof Enableinsert)) {
            return false;
        }
        Enableinsert other = (Enableinsert) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Enableinsert[ code=" + code + " ]";
    }
    
}
