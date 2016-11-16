/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author david
 */
@Entity
@Table(name = "Termini")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Termini.findAll", query = "SELECT t FROM Termini t"),
    @NamedQuery(name = "Termini.findByTerminiid", query = "SELECT t FROM Termini t WHERE t.terminiid = :terminiid"),
    @NamedQuery(name = "Termini.findByDataterminit", query = "SELECT t FROM Termini t WHERE t.dataterminit = :dataterminit"),
    @NamedQuery(name = "Termini.findByOraterminit", query = "SELECT t FROM Termini t WHERE t.oraterminit = :oraterminit")})
public class Termini implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    @Column(name = "Termini_id")
    private Integer terminiid;
    @Basic(optional = false)
    @Column(name = "Data_terminit")
    @Temporal(TemporalType.DATE)
    private Date dataterminit;
    @Basic(optional = false)
    @Column(name = "Ora_terminit")
    private String oraterminit;
    @JoinColumn(name = "PacientiID", referencedColumnName = "Nr_personal")
    @ManyToOne(optional = false)
    private Pacienti pacientiID;

    public Termini() {
    }

    public Termini(Integer terminiid) {
        this.terminiid = terminiid;
    }

    public Termini(Integer terminiid, Date dataterminit, String oraterminit) {
        this.terminiid = terminiid;
        this.dataterminit = dataterminit;
        this.oraterminit = oraterminit;
    }

    public Integer getTerminiid() {
        return terminiid;
    }

    public void setTerminiid(Integer terminiid) {
        this.terminiid = terminiid;
    }

    public Date getDataterminit() {
        return dataterminit;
    }

    public void setDataterminit(Date dataterminit) {
        this.dataterminit = dataterminit;
    }

    public String getOraterminit() {
        return oraterminit;
    }

    public void setOraterminit(String oraterminit) {
        this.oraterminit = oraterminit;
    }

    public Pacienti getPacientiID() {
        return pacientiID;
    }

    public void setPacientiID(Pacienti pacientiID) {
        this.pacientiID = pacientiID;
    }
       public String getDate() {
       String [] data = dataterminit.toString().split(" ");
       if(data[1].equals("Jan"))
           data[1]="Janar";
       if(data[1].equals("Feb"))
           data[1]="Shkurt";
       if(data[1].equals("Mar"))
           data[1]="Mars";
       if(data[1].equals("Apr"))
           data[1]="Prill";
       if(data[1].equals("May"))
           data[1]="Maj";
       if(data[1].equals("Jun"))
           data[1]="Qershor";
       if(data[1].equals("Jul"))
           data[1]="Korrik";
       if(data[1].equals("Aug"))
           data[1]="Gusht";
       if(data[1].equals("Sep"))
           data[1]="Shtator";
       if(data[1].equals("Oct"))
           data[1]="Tetor";
       if(data[1].equals("Nov"))
           data[1]="Nentor";
       if(data[1].equals("Dec"))
           data[1]="Dhjetor";
       String date = data[2] + " "+data[1]+" "+ data[5];
         
        return date;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (terminiid != null ? terminiid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Termini)) {
            return false;
        }
        Termini other = (Termini) object;
        if ((this.terminiid == null && other.terminiid != null) || (this.terminiid != null && !this.terminiid.equals(other.terminiid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "model.Termini[ terminiid=" + terminiid + " ]";
    }
    
}
