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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Programador
 */
@Entity
@Table(name = "additionalitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Additionalitem.findAll", query = "SELECT a FROM Additionalitem a")
    , @NamedQuery(name = "Additionalitem.findByCode", query = "SELECT a FROM Additionalitem a WHERE a.code = :code")})
public class Additionalitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @JoinColumn(name = "code_additional", referencedColumnName = "code")
    @ManyToOne
    private Additional codeAdditional;
    @JoinColumn(name = "code_item", referencedColumnName = "code")
    @ManyToOne
    private Item codeItem;

    public Additionalitem() {
    }

    public Additionalitem(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Additional getCodeAdditional() {
        return codeAdditional;
    }

    public void setCodeAdditional(Additional codeAdditional) {
        this.codeAdditional = codeAdditional;
    }

    public Item getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(Item codeItem) {
        this.codeItem = codeItem;
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
        if (!(object instanceof Additionalitem)) {
            return false;
        }
        Additionalitem other = (Additionalitem) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Additionalitem[ code=" + code + " ]";
    }
    
}
