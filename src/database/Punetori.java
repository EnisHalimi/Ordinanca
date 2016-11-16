/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
 * @author david
 */
@Entity
@Table(name = "Punetori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Punetori.findAll", query = "SELECT p FROM Punetori p"),
    @NamedQuery(name = "Punetori.findByNrpersonal", query = "SELECT p FROM Punetori p WHERE p.nrpersonal = :nrpersonal"),
    @NamedQuery(name = "Punetori.findByEmri", query = "SELECT p FROM Punetori p WHERE p.emri = :emri"),
    @NamedQuery(name = "Punetori.findByMbiemri", query = "SELECT p FROM Punetori p WHERE p.mbiemri = :mbiemri"),
    @NamedQuery(name = "Punetori.findByPozite", query = "SELECT p FROM Punetori p WHERE p.pozite = :pozite"),
    @NamedQuery(name = "Punetori.findByGjinia", query = "SELECT p FROM Punetori p WHERE p.gjinia = :gjinia")})
public class Punetori implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Nr_personal")
    private Integer nrpersonal;
    @Basic(optional = false)
    @Column(name = "Emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "Mbiemri")
    private String mbiemri;
    @Basic(optional = false)
    @Column(name = "Pozite")
    private String pozite;
    @Basic(optional = false)
    @Column(name = "Gjinia")
    private Character gjinia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "punetoriid")
    private Collection<Kontrolla> kontrollaCollection;

    public Punetori() {
    }

    public Punetori(Integer nrpersonal) {
        this.nrpersonal = nrpersonal;
    }

    public Punetori(Integer nrpersonal, String emri, String mbiemri, String pozite, Character gjinia) {
       
        this.nrpersonal = nrpersonal;
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.pozite = pozite;
        this.gjinia = gjinia;
    }

   

    public int getNrpersonal() {
        return nrpersonal;
    }

    public void setNrpersonal(int nrpersonal) {
        this.nrpersonal = nrpersonal;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public String getPozite() {
        return pozite;
    }

    public void setPozite(String pozite) {
        this.pozite = pozite;
    }

    public Character getGjinia() {
        return gjinia;
    }

    public void setGjinia(Character gjinia) {
        this.gjinia = gjinia;
    }

    
    @XmlTransient
    public Collection<Kontrolla> getKontrollaCollection() {
        return kontrollaCollection;
    }

    public void setKontrollaCollection(Collection<Kontrolla> kontrollaCollection) {
        this.kontrollaCollection = kontrollaCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (nrpersonal != null ? nrpersonal.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Punetori)) {
            return false;
        }
        Punetori other = (Punetori) object;
        if ((this.nrpersonal == null && other.nrpersonal != null) || (this.nrpersonal != null && !this.nrpersonal.equals(other.nrpersonal))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
         return emri + " "+ mbiemri;
    }
    
}
