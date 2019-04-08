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
@Table(name = "comboitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comboitem.findAll", query = "SELECT c FROM Comboitem c")
    , @NamedQuery(name = "Comboitem.findByCode", query = "SELECT c FROM Comboitem c WHERE c.code = :code")
    , @NamedQuery(name = "Comboitem.findByCountitem", query = "SELECT c FROM Comboitem c WHERE c.countitem = :countitem")})
public class Comboitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Column(name = "countitem")
    private Integer countitem;
    @JoinColumn(name = "code_item", referencedColumnName = "code")
    @ManyToOne
    private Item codeItem;
    @JoinColumn(name = "code_comboitem", referencedColumnName = "code")
    @ManyToOne
    private Item codeComboitem;

    public Comboitem() {
    }

    public Comboitem(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Integer getCountitem() {
        return countitem;
    }

    public void setCountitem(Integer countitem) {
        this.countitem = countitem;
    }

    public Item getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(Item codeItem) {
        this.codeItem = codeItem;
    }

    public Item getCodeComboitem() {
        return codeComboitem;
    }

    public void setCodeComboitem(Item codeComboitem) {
        this.codeComboitem = codeComboitem;
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
        if (!(object instanceof Comboitem)) {
            return false;
        }
        Comboitem other = (Comboitem) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Comboitem[ code=" + code + " ]";
    }
    
}
