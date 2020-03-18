/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.ir.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author hzouani6
 */
@Entity
public class IREmploye implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    @ManyToOne
    private IR ir;

    private String referenceEemploye;
    @Column(precision = 16, scale = 4)
    private BigDecimal salaire;
    @Column(precision = 16, scale = 4)
    private BigDecimal prime;
    @ManyToOne
    private TauxIR tauxIR;
    @Column(precision = 16, scale = 4)
    private BigDecimal honnoraire;
    @ManyToOne
    private EtatIR etatIR;
    @Column(precision = 16, scale = 4)
    private BigDecimal penalite;
    @Column(precision = 16, scale = 4)
    private BigDecimal majoration;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantTotal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IR getIr() {
        return ir;
    }

    public void setIr(IR ir) {
        this.ir = ir;
    }

    public String getReferenceEemploye() {
        return referenceEemploye;
    }

    public void setReferenceEemploye(String referenceEemploye) {
        this.referenceEemploye = referenceEemploye;
    }

    public BigDecimal getSalaire() {
        return salaire;
    }

    public void setSalaire(BigDecimal salaire) {
        this.salaire = salaire;
    }

    public BigDecimal getPrime() {
        return prime;
    }

    public void setPrime(BigDecimal prime) {
        this.prime = prime;
    }

    public EtatIR getEtatIR() {
        return etatIR;
    }

    public void setEtatIR(EtatIR etatIR) {
        this.etatIR = etatIR;
    }

    public TauxIR getTauxIR() {
        return tauxIR;
    }

    public void setTauxIR(TauxIR tauxIR) {
        this.tauxIR = tauxIR;
    }

    public BigDecimal getHonnoraire() {
        return honnoraire;
    }

    public void setHonnoraire(BigDecimal honnoraire) {
        this.honnoraire = honnoraire;
    }

    public BigDecimal getPenalite() {
        return penalite;
    }

    public void setPenalite(BigDecimal penalite) {
        this.penalite = penalite;
    }

    public BigDecimal getMajoration() {
        return majoration;
    }

    public void setMajoration(BigDecimal majoration) {
        this.majoration = majoration;
    }

    public BigDecimal getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(BigDecimal montantTotal) {
        this.montantTotal = montantTotal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof IREmploye)) {
            return false;
        }
        IREmploye other = (IREmploye) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.zsmart.compta.transparency.bean.DeclarationIRPeriodiqueItem[ id=" + id + " ]";
    }

}
