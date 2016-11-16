/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

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
 * @author david
 */
@Entity
@Table(name = "Tretmani")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tretmani.findAll", query = "SELECT t FROM Tretmani t"),
    @NamedQuery(name = "Tretmani.findByTretmaniid", query = "SELECT t FROM Tretmani t WHERE t.tretmaniid = :tretmaniid"),
    @NamedQuery(name = "Tretmani.findByLlojitretmanit", query = "SELECT t FROM Tretmani t WHERE t.llojitretmanit = :llojitretmanit"),
    @NamedQuery(name = "Tretmani.findByKohezgjatja", query = "SELECT t FROM Tretmani t WHERE t.kohezgjatja = :kohezgjatja")})
public class Tretmani implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "Tretmani_id")
    private Integer tretmaniid;
    @Basic(optional = false)
    @Column(name = "Lloji_tretmanit")
    private String llojitretmanit;
    @Column(name = "Kohezgjatja")
    private String kohezgjatja;
    @JoinColumn(name = "KontrollaID", referencedColumnName = "Kontrolla_id")
    @ManyToOne(optional = false)
    private Kontrolla kontrollaID;

    public Tretmani() {
    }

    public Tretmani(Integer tretmaniid) {
        this.tretmaniid = tretmaniid;
    }

    public Tretmani(Integer tretmaniid, String llojitretmanit) {
        this.tretmaniid = tretmaniid;
        this.llojitretmanit = llojitretmanit;
    }

    public Integer getTretmaniid() {
        return tretmaniid;
    }

    public void setTretmaniid(Integer tretmaniid) {
        this.tretmaniid = tretmaniid;
    }

    public String getLlojitretmanit() {
        return llojitretmanit;
    }

    public void setLlojitretmanit(String llojitretmanit) {
        this.llojitretmanit = llojitretmanit;
    }

    public String getKohezgjatja() {
        return kohezgjatja;
    }

    public void setKohezgjatja(String kohezgjatja) {
        this.kohezgjatja = kohezgjatja;
    }

    public Kontrolla getKontrollaID() {
        return kontrollaID;
    }

    public void setKontrollaID(Kontrolla kontrollaID) {
        this.kontrollaID = kontrollaID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (tretmaniid != null ? tretmaniid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tretmani)) {
            return false;
        }
        Tretmani other = (Tretmani) object;
        if ((this.tretmaniid == null && other.tretmaniid != null) || (this.tretmaniid != null && !this.tretmaniid.equals(other.tretmaniid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Tretmani[ tretmaniid=" + tretmaniid + " ]";
    }
    
}
