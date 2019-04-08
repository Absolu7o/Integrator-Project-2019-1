/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Programador
 */
@Entity
@Table(name = "item")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Item.findAll", query = "SELECT i FROM Item i")
    , @NamedQuery(name = "Item.findByCode", query = "SELECT i FROM Item i WHERE i.code = :code")
    , @NamedQuery(name = "Item.findByDescription", query = "SELECT i FROM Item i WHERE i.description = :description")
    , @NamedQuery(name = "Item.findByPrice", query = "SELECT i FROM Item i WHERE i.price = :price")
    , @NamedQuery(name = "Item.findByPreparation", query = "SELECT i FROM Item i WHERE i.preparation = :preparation")
    , @NamedQuery(name = "Item.findByAdditional", query = "SELECT i FROM Item i WHERE i.additional = :additional")
    , @NamedQuery(name = "Item.findByActive", query = "SELECT i FROM Item i WHERE i.active = :active")})
public class Item implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Column(name = "description")
    private String description;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "preparation")
    private String preparation;
    @Column(name = "additional")
    private String additional;
    @Column(name = "active")
    private String active;
    @JoinColumn(name = "code_category", referencedColumnName = "code")
    @ManyToOne
    private Category codeCategory;
    @OneToMany(mappedBy = "codeItem")
    private Collection<Requestitem> requestitemCollection;
    @OneToMany(mappedBy = "codeItem")
    private Collection<Additionalitem> additionalitemCollection;
    @OneToMany(mappedBy = "codeItem")
    private Collection<Comboitem> comboitemCollection;
    @OneToMany(mappedBy = "codeComboitem")
    private Collection<Comboitem> comboitemCollection1;

    public Item() {
    }

    public Item(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Category getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(Category codeCategory) {
        this.codeCategory = codeCategory;
    }

    @XmlTransient
    public Collection<Requestitem> getRequestitemCollection() {
        return requestitemCollection;
    }

    public void setRequestitemCollection(Collection<Requestitem> requestitemCollection) {
        this.requestitemCollection = requestitemCollection;
    }

    @XmlTransient
    public Collection<Additionalitem> getAdditionalitemCollection() {
        return additionalitemCollection;
    }

    public void setAdditionalitemCollection(Collection<Additionalitem> additionalitemCollection) {
        this.additionalitemCollection = additionalitemCollection;
    }

    @XmlTransient
    public Collection<Comboitem> getComboitemCollection() {
        return comboitemCollection;
    }

    public void setComboitemCollection(Collection<Comboitem> comboitemCollection) {
        this.comboitemCollection = comboitemCollection;
    }

    @XmlTransient
    public Collection<Comboitem> getComboitemCollection1() {
        return comboitemCollection1;
    }

    public void setComboitemCollection1(Collection<Comboitem> comboitemCollection1) {
        this.comboitemCollection1 = comboitemCollection1;
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
        if (!(object instanceof Item)) {
            return false;
        }
        Item other = (Item) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Item[ code=" + code + " ]";
    }
    
}
