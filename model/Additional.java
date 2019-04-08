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
@Table(name = "additional")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Additional.findAll", query = "SELECT a FROM Additional a")
    , @NamedQuery(name = "Additional.findByCode", query = "SELECT a FROM Additional a WHERE a.code = :code")
    , @NamedQuery(name = "Additional.findByDescription", query = "SELECT a FROM Additional a WHERE a.description = :description")
    , @NamedQuery(name = "Additional.findByPrice", query = "SELECT a FROM Additional a WHERE a.price = :price")
    , @NamedQuery(name = "Additional.findByActive", query = "SELECT a FROM Additional a WHERE a.active = :active")})
public class Additional implements Serializable {

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
    @Column(name = "active")
    private String active;
    @OneToMany(mappedBy = "codeAdditional")
    private Collection<Requestadditionalitem> requestadditionalitemCollection;
    @OneToMany(mappedBy = "codeAdditional")
    private Collection<Additionalitem> additionalitemCollection;
    @JoinColumn(name = "code_category", referencedColumnName = "code")
    @ManyToOne
    private Category codeCategory;

    public Additional() {
    }

    public Additional(Integer code) {
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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    @XmlTransient
    public Collection<Requestadditionalitem> getRequestadditionalitemCollection() {
        return requestadditionalitemCollection;
    }

    public void setRequestadditionalitemCollection(Collection<Requestadditionalitem> requestadditionalitemCollection) {
        this.requestadditionalitemCollection = requestadditionalitemCollection;
    }

    @XmlTransient
    public Collection<Additionalitem> getAdditionalitemCollection() {
        return additionalitemCollection;
    }

    public void setAdditionalitemCollection(Collection<Additionalitem> additionalitemCollection) {
        this.additionalitemCollection = additionalitemCollection;
    }

    public Category getCodeCategory() {
        return codeCategory;
    }

    public void setCodeCategory(Category codeCategory) {
        this.codeCategory = codeCategory;
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
        if (!(object instanceof Additional)) {
            return false;
        }
        Additional other = (Additional) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Additional[ code=" + code + " ]";
    }

}
