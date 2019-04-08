/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
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
@Table(name = "requestitem")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requestitem.findAll", query = "SELECT r FROM Requestitem r")
    , @NamedQuery(name = "Requestitem.findByCode", query = "SELECT r FROM Requestitem r WHERE r.code = :code")
    , @NamedQuery(name = "Requestitem.findByStatus", query = "SELECT r FROM Requestitem r WHERE r.status = :status")
    , @NamedQuery(name = "Requestitem.findByCountitem", query = "SELECT r FROM Requestitem r WHERE r.countitem = :countitem")
    , @NamedQuery(name = "Requestitem.findByNote", query = "SELECT r FROM Requestitem r WHERE r.note = :note")
    , @NamedQuery(name = "Requestitem.findByCheckRequeststart", query = "SELECT r FROM Requestitem r WHERE r.checkRequeststart = :checkRequeststart")
    , @NamedQuery(name = "Requestitem.findByDatetimeins", query = "SELECT r FROM Requestitem r WHERE r.datetimeins = :datetimeins")
    , @NamedQuery(name = "Requestitem.findByDatetimeupd", query = "SELECT r FROM Requestitem r WHERE r.datetimeupd = :datetimeupd")})
public class Requestitem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "code")
    private Integer code;
    @Column(name = "status")
    private String status;
    @Column(name = "countitem")
    private Integer countitem;
    @Column(name = "note")
    private String note;
    @Column(name = "check_requeststart")
    private Character checkRequeststart;
    @Column(name = "datetimeins")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeins;
    @Column(name = "datetimeupd")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetimeupd;
    @OneToMany(mappedBy = "codeRequestitem")
    private Collection<Requestadditionalitem> requestadditionalitemCollection;
    @JoinColumn(name = "code_item", referencedColumnName = "code")
    @ManyToOne
    private Item codeItem;
    @JoinColumn(name = "code_request", referencedColumnName = "code")
    @ManyToOne
    private Request codeRequest;

    public Requestitem() {
    }

    public Requestitem(Integer code) {
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

    public Integer getCountitem() {
        return countitem;
    }

    public void setCountitem(Integer countitem) {
        this.countitem = countitem;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Character getCheckRequeststart() {
        return checkRequeststart;
    }

    public void setCheckRequeststart(Character checkRequeststart) {
        this.checkRequeststart = checkRequeststart;
    }

    public Date getDatetimeins() {
        return datetimeins;
    }

    public void setDatetimeins(Date datetimeins) {
        this.datetimeins = datetimeins;
    }

    public Date getDatetimeupd() {
        return datetimeupd;
    }

    public void setDatetimeupd(Date datetimeupd) {
        this.datetimeupd = datetimeupd;
    }

    @XmlTransient
    public Collection<Requestadditionalitem> getRequestadditionalitemCollection() {
        return requestadditionalitemCollection;
    }

    public void setRequestadditionalitemCollection(Collection<Requestadditionalitem> requestadditionalitemCollection) {
        this.requestadditionalitemCollection = requestadditionalitemCollection;
    }

    public Item getCodeItem() {
        return codeItem;
    }

    public void setCodeItem(Item codeItem) {
        this.codeItem = codeItem;
    }

    public Request getCodeRequest() {
        return codeRequest;
    }

    public void setCodeRequest(Request codeRequest) {
        this.codeRequest = codeRequest;
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
        if (!(object instanceof Requestitem)) {
            return false;
        }
        Requestitem other = (Requestitem) object;
        return !((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code)));
    }

    @Override
    public String toString() {
        return "model.Requestitem[ code=" + code + " ]";
    }
    
}
