/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zsmart.ir.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

/**
 *
 * @author hzouani6
 */
@Entity
public class IR implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Integer nombreEmployeeDeclaree;
    @Column(precision = 16, scale = 4)
    private BigDecimal totalSalaire;
    @Column(precision = 16, scale = 4)
    private BigDecimal totalPrime;
    @OneToMany(mappedBy = "ir")
    private List<IREmploye> irEmployes;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantTotal;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantBaseIr;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantRetard;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantMajoration;
    @Column(precision = 16, scale = 4)
    private BigDecimal montantPenalite;

    private Integer nomberMoisRetard;

   
    private Integer anne;
    private Integer mois;// numero de mois ou de trim
    private BigDecimal honoraire;
    @Column(precision = 16, scale = 4)
    private BigDecimal penalite;
    @Column(precision = 16, scale = 4)
    private BigDecimal majoration;

    @ManyToOne
    private EtatIR etatIR;

     private String description;
    private String reference;
    private String referenceSociete;
    private String referenceComptableValidateur;
    private String referenceComptableCreateur;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateValidation;

    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSoumission;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateAffectationComptable;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateFinalisation;
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dateSaisie;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EtatIR getEtatIR() {
        return etatIR;
    }

    public void setEtatIR(EtatIR etatIR) {
        this.etatIR = etatIR;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getMontantBaseIr() {
        return montantBaseIr;
    }

    public void setMontantBaseIr(BigDecimal montantBaseIr) {
        this.montantBaseIr = montantBaseIr;
    }

    public BigDecimal getMontantRetard() {
        return montantRetard;
    }

    public void setMontantRetard(BigDecimal montantRetard) {
        this.montantRetard = montantRetard;
    }

    public BigDecimal getMontantMajoration() {
        return montantMajoration;
    }

    public void setMontantMajoration(BigDecimal montantMajoration) {
        this.montantMajoration = montantMajoration;
    }

    public BigDecimal getMontantPenalite() {
        return montantPenalite;
    }

    public void setMontantPenalite(BigDecimal montantPenalite) {
        this.montantPenalite = montantPenalite;
    }

    public Integer getNomberMoisRetard() {
        return nomberMoisRetard;
    }

    public void setNomberMoisRetard(Integer nomberMoisRetard) {
        this.nomberMoisRetard = nomberMoisRetard;
    }

    public Integer getNombreEmployeeDeclaree() {
        return nombreEmployeeDeclaree;
    }

    public void setNombreEmployeeDeclaree(Integer nombreEmployeeDeclaree) {
        this.nombreEmployeeDeclaree = nombreEmployeeDeclaree;
    }

    public BigDecimal getTotalSalaire() {
        return totalSalaire;
    }

    public void setTotalSalaire(BigDecimal totalSalaire) {
        this.totalSalaire = totalSalaire;
    }

    public BigDecimal getTotalPrime() {
        return totalPrime;
    }

    public void setTotalPrime(BigDecimal totalPrime) {
        this.totalPrime = totalPrime;
    }

    public void setDateSoumission(Date dateSoumission) {
        this.dateSoumission = dateSoumission;
    }

    public void setDateAffectationComptable(Date dateAffectationComptable) {
        this.dateAffectationComptable = dateAffectationComptable;
    }

    public void setDateFinalisation(Date dateFinalisation) {
        this.dateFinalisation = dateFinalisation;
    }

    public List<IREmploye> getIrEmployes() {
        return irEmployes;
    }

    public void setIrEmployes(List<IREmploye> irEmployes) {
        this.irEmployes = irEmployes;
    }

    public String getReferenceSociete() {
        return referenceSociete;
    }

    public void setReferenceSociete(String referenceSociete) {
        this.referenceSociete = referenceSociete;
    }

    public Integer getAnne() {
        return anne;
    }

    public void setAnne(Integer anne) {
        this.anne = anne;
    }

    public Integer getMois() {
        return mois;
    }

    public void setMois(Integer mois) {
        this.mois = mois;
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

    public BigDecimal getHonoraire() {
        return honoraire;
    }

    public void setHonoraire(BigDecimal honoraire) {
        this.honoraire = honoraire;
    }

    public String getReferenceComptableValidateur() {
        return referenceComptableValidateur;
    }

    public void setReferenceComptableValidateur(String referenceComptableValidateur) {
        this.referenceComptableValidateur = referenceComptableValidateur;
    }

    public String getReferenceComptableCreateur() {
        return referenceComptableCreateur;
    }

    public void setReferenceComptableCreateur(String referenceComptableCreateur) {
        this.referenceComptableCreateur = referenceComptableCreateur;
    }

    public Date getDateValidation() {
        return dateValidation;
    }

    public void setDateValidation(Date dateValidation) {
        this.dateValidation = dateValidation;
    }

    public Date getDateSaisie() {
        return dateSaisie;
    }

    public void setDateSaisie(Date dateSaisie) {
        this.dateSaisie = dateSaisie;
    }

    public Date getDateSoumission() {
        return dateSoumission;
    }

    public Date getDateAffectationComptable() {
        return dateAffectationComptable;
    }

    public Date getDateFinalisation() {
        return dateFinalisation;
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
        if (!(object instanceof IR)) {
            return false;
        }
        IR other = (IR) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
