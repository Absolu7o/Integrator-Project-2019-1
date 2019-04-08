/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Programador
 */
@Entity
@Table(name = "request")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Request.findAll", query = "SELECT r FROM Request r")
    , @NamedQuery(name = "Request.findByCode", query = "SELECT r FROM Request r WHERE r.code = :code")
    , @NamedQuery(name = "Request.findByStatus", query = "SELECT r FROM Request r WHERE r.status = :status")
    , @NamedQuery(name = "Request.findByDatetimeins", query = "SELECT r FROM Request r WHERE r.datetimeins = :datetimeins")
    , @NamedQuery(name = "Request.findByDatetimeend", query = "SELECT r FROM Request r WHERE r.datetimeend = :datetimeend")
    , @NamedQuery(name = "Request.findByPaymoney", query = "SELECT r FROM Request r WHERE r.paymoney = :paymoney")
    , @NamedQuery(name = "Request.findByPaycard", query = "SELECT r FROM Request r WHERE r.paycard = :paycard")
    , @NamedQuery(name = "Request.findByCardtype", query = "SELECT r FROM Request r WHERE r.cardtype = :cardtype")})
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Column(name = "status")
    private String status;
    @Column(name = "datetimeins")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeins;
    @Column(name = "datetimeend")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeend;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "paymoney")
    private BigDecimal paymoney;
    @Column(name = "paycard")
    private BigDecimal paycard;
    @Column(name = "cardtype")
    private String cardtype;
    @JoinColumn(name = "code_guestcheck", referencedColumnName = "code")
    @ManyToOne
    private Guestcheck codeGuestcheck;
    @JoinColumn(name = "code_tablelist", referencedColumnName = "code")
    @ManyToOne
    private Tablelist codeTablelist;
    @OneToMany(mappedBy = "codeRequest")
    private Collection<Requestitem> requestitemCollection;

    public Request() {
    }

    public Request(Integer code) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDatetimeins() {
        return datetimeins;
    }

    public void setDatetimeins(Date datetimeins) {
        this.datetimeins = datetimeins;
    }

    public Date getDatetimeend() {
        return datetimeend;
    }

    public void setDatetimeend(Date datetimeend) {
        this.datetimeend = datetimeend;
    }

    public BigDecimal getPaymoney() {
        return paymoney;
    }

    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    public BigDecimal getPaycard() {
        return paycard;
    }

    public void setPaycard(BigDecimal paycard) {
        this.paycard = paycard;
    }

    public String getCardtype() {
        return cardtype;
    }

    public void setCardtype(String cardtype) {
        this.cardtype = cardtype;
    }

    public Guestcheck getCodeGuestcheck() {
        return codeGuestcheck;
    }

    public void setCodeGuestcheck(Guestcheck codeGuestcheck) {
        this.codeGuestcheck = codeGuestcheck;
    }

    public Tablelist getCodeTablelist() {
        return codeTablelist;
    }

    public void setCodeTablelist(Tablelist codeTablelist) {
        this.codeTablelist = codeTablelist;
    }

    @XmlTransient
    public Collection<Requestitem> getRequestitemCollection() {
        return requestitemCollection;
    }

    public void setRequestitemCollection(Collection<Requestitem> requestitemCollection) {
        this.requestitemCollection = requestitemCollection;
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
        if (!(object instanceof Request)) {
            return false;
        }
        Request other = (Request) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Request[ code=" + code + " ]";
    }
    
}
