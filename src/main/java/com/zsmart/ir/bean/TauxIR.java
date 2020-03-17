package com.zsmart.ir.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

@Entity
public class TauxIR implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(precision = 16, scale = 4)
    private BigDecimal salairMin;
    @Column(precision = 16, scale = 4)
    private BigDecimal salairMax;
    @Column(precision = 16, scale = 4)
    private BigDecimal montant;
    @Column(precision = 16, scale = 4)
    private BigDecimal majoration;
    @Column(precision = 16, scale = 4)
    private BigDecimal penalite;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private LocalDateTime dateApplicationDebut;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private LocalDateTime dateApplicationFin;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getSalairMin() {
        return salairMin;
    }

    public void setSalairMin(BigDecimal salairMin) {
        this.salairMin = salairMin;
    }

    public BigDecimal getSalairMax() {
        return salairMax;
    }

    public void setSalairMax(BigDecimal salairMax) {
        this.salairMax = salairMax;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public BigDecimal getMajoration() {
        return majoration;
    }

    public void setMajoration(BigDecimal majoration) {
        this.majoration = majoration;
    }

    public BigDecimal getPenalite() {
        return penalite;
    }

    public void setPenalite(BigDecimal penalite) {
        this.penalite = penalite;
    }

    public LocalDateTime getDateApplicationDebut() {
        return dateApplicationDebut;
    }

    public void setDateApplicationDebut(LocalDateTime dateApplicationDebut) {
        this.dateApplicationDebut = dateApplicationDebut;
    }

    public LocalDateTime getDateApplicationFin() {
        return dateApplicationFin;
    }

    public void setDateApplicationFin(LocalDateTime dateApplicationFin) {
        this.dateApplicationFin = dateApplicationFin;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        TauxIR other = (TauxIR) obj;
        if (id == null) {
            if (other.id != null) {
                return false;
            }
        } else if (!id.equals(other.id)) {
            return false;
        }
        return true;
    }

}
