package com.zsmart.ir.ws.rest.vo;

import java.util.ArrayList;
import java.util.List;


public class IRVo{

private String id ;
private String nombreEmployeeDeclaree;
private String nombreEmployeeDeclareeMin ;
private String nombreEmployeeDeclareeMax ;
private String totalSalaire;
private String totalSalaireMin ;
private String totalSalaireMax ;
private String totalPrime;
private String totalPrimeMin ;
private String totalPrimeMax ;
private String montantTotal;
private String montantTotalMin ;
private String montantTotalMax ;
private String montantBaseIr;
private String montantBaseIrMin ;
private String montantBaseIrMax ;
private String montantRetard;
private String montantRetardMin ;
private String montantRetardMax ;
private String montantMajoration;
private String montantMajorationMin ;
private String montantMajorationMax ;
private String montantPenalite;
private String montantPenaliteMin ;
private String montantPenaliteMax ;
private String nomberMoisRetard;
private String nomberMoisRetardMin ;
private String nomberMoisRetardMax ;
private String anne;
private String anneMin ;
private String anneMax ;
private String mois;
private String moisMin ;
private String moisMax ;
private String honoraire;
private String honoraireMin ;
private String honoraireMax ;
private String penalite;
private String penaliteMin ;
private String penaliteMax ;
private String majoration;
private String majorationMin ;
private String majorationMax ;
private String description ;
private String reference ;
private String referenceSociete ;
private String referenceComptableValidateur ;
private String referenceComptableCreateur ;
private String dateValidation;
private String dateValidationMin ;
private String dateValidationMax ;
private String dateSoumission;
private String dateSoumissionMin ;
private String dateSoumissionMax ;
private String dateAffectationComptable;
private String dateAffectationComptableMin ;
private String dateAffectationComptableMax ;
private String dateFinalisation;
private String dateFinalisationMin ;
private String dateFinalisationMax ;
private String dateSaisie;
private String dateSaisieMin ;
private String dateSaisieMax ;
private EtatIRVo etatIRVo ;
private List<IREmployeVo>iREmployesVo;



public String  getId(){
    return id;
}

public void setId(String  id){
     this.id = id;
}

public String  getNombreEmployeeDeclaree(){
    return nombreEmployeeDeclaree;
}

public void setNombreEmployeeDeclaree(String  nombreEmployeeDeclaree){
     this.nombreEmployeeDeclaree = nombreEmployeeDeclaree;
}

public String  getNombreEmployeeDeclareeMin(){
    return nombreEmployeeDeclareeMin;
}

public void setNombreEmployeeDeclareeMin(String  nombreEmployeeDeclareeMin){
     this.nombreEmployeeDeclareeMin = nombreEmployeeDeclareeMin;
}

public String  getNombreEmployeeDeclareeMax(){
    return nombreEmployeeDeclareeMax;
}

public void setNombreEmployeeDeclareeMax(String  nombreEmployeeDeclareeMax){
     this.nombreEmployeeDeclareeMax = nombreEmployeeDeclareeMax;
}

public String  getTotalSalaire(){
    return totalSalaire;
}

public void setTotalSalaire(String  totalSalaire){
     this.totalSalaire = totalSalaire;
}

public String  getTotalSalaireMin(){
    return totalSalaireMin;
}

public void setTotalSalaireMin(String  totalSalaireMin){
     this.totalSalaireMin = totalSalaireMin;
}

public String  getTotalSalaireMax(){
    return totalSalaireMax;
}

public void setTotalSalaireMax(String  totalSalaireMax){
     this.totalSalaireMax = totalSalaireMax;
}

public String  getTotalPrime(){
    return totalPrime;
}

public void setTotalPrime(String  totalPrime){
     this.totalPrime = totalPrime;
}

public String  getTotalPrimeMin(){
    return totalPrimeMin;
}

public void setTotalPrimeMin(String  totalPrimeMin){
     this.totalPrimeMin = totalPrimeMin;
}

public String  getTotalPrimeMax(){
    return totalPrimeMax;
}

public void setTotalPrimeMax(String  totalPrimeMax){
     this.totalPrimeMax = totalPrimeMax;
}

public String  getMontantTotal(){
    return montantTotal;
}

public void setMontantTotal(String  montantTotal){
     this.montantTotal = montantTotal;
}

public String  getMontantTotalMin(){
    return montantTotalMin;
}

public void setMontantTotalMin(String  montantTotalMin){
     this.montantTotalMin = montantTotalMin;
}

public String  getMontantTotalMax(){
    return montantTotalMax;
}

public void setMontantTotalMax(String  montantTotalMax){
     this.montantTotalMax = montantTotalMax;
}

public String  getMontantBaseIr(){
    return montantBaseIr;
}

public void setMontantBaseIr(String  montantBaseIr){
     this.montantBaseIr = montantBaseIr;
}

public String  getMontantBaseIrMin(){
    return montantBaseIrMin;
}

public void setMontantBaseIrMin(String  montantBaseIrMin){
     this.montantBaseIrMin = montantBaseIrMin;
}

public String  getMontantBaseIrMax(){
    return montantBaseIrMax;
}

public void setMontantBaseIrMax(String  montantBaseIrMax){
     this.montantBaseIrMax = montantBaseIrMax;
}

public String  getMontantRetard(){
    return montantRetard;
}

public void setMontantRetard(String  montantRetard){
     this.montantRetard = montantRetard;
}

public String  getMontantRetardMin(){
    return montantRetardMin;
}

public void setMontantRetardMin(String  montantRetardMin){
     this.montantRetardMin = montantRetardMin;
}

public String  getMontantRetardMax(){
    return montantRetardMax;
}

public void setMontantRetardMax(String  montantRetardMax){
     this.montantRetardMax = montantRetardMax;
}

public String  getMontantMajoration(){
    return montantMajoration;
}

public void setMontantMajoration(String  montantMajoration){
     this.montantMajoration = montantMajoration;
}

public String  getMontantMajorationMin(){
    return montantMajorationMin;
}

public void setMontantMajorationMin(String  montantMajorationMin){
     this.montantMajorationMin = montantMajorationMin;
}

public String  getMontantMajorationMax(){
    return montantMajorationMax;
}

public void setMontantMajorationMax(String  montantMajorationMax){
     this.montantMajorationMax = montantMajorationMax;
}

public String  getMontantPenalite(){
    return montantPenalite;
}

public void setMontantPenalite(String  montantPenalite){
     this.montantPenalite = montantPenalite;
}

public String  getMontantPenaliteMin(){
    return montantPenaliteMin;
}

public void setMontantPenaliteMin(String  montantPenaliteMin){
     this.montantPenaliteMin = montantPenaliteMin;
}

public String  getMontantPenaliteMax(){
    return montantPenaliteMax;
}

public void setMontantPenaliteMax(String  montantPenaliteMax){
     this.montantPenaliteMax = montantPenaliteMax;
}

public String  getNomberMoisRetard(){
    return nomberMoisRetard;
}

public void setNomberMoisRetard(String  nomberMoisRetard){
     this.nomberMoisRetard = nomberMoisRetard;
}

public String  getNomberMoisRetardMin(){
    return nomberMoisRetardMin;
}

public void setNomberMoisRetardMin(String  nomberMoisRetardMin){
     this.nomberMoisRetardMin = nomberMoisRetardMin;
}

public String  getNomberMoisRetardMax(){
    return nomberMoisRetardMax;
}

public void setNomberMoisRetardMax(String  nomberMoisRetardMax){
     this.nomberMoisRetardMax = nomberMoisRetardMax;
}

public String  getAnne(){
    return anne;
}

public void setAnne(String  anne){
     this.anne = anne;
}

public String  getAnneMin(){
    return anneMin;
}

public void setAnneMin(String  anneMin){
     this.anneMin = anneMin;
}

public String  getAnneMax(){
    return anneMax;
}

public void setAnneMax(String  anneMax){
     this.anneMax = anneMax;
}

public String  getMois(){
    return mois;
}

public void setMois(String  mois){
     this.mois = mois;
}

public String  getMoisMin(){
    return moisMin;
}

public void setMoisMin(String  moisMin){
     this.moisMin = moisMin;
}

public String  getMoisMax(){
    return moisMax;
}

public void setMoisMax(String  moisMax){
     this.moisMax = moisMax;
}

public String  getHonoraire(){
    return honoraire;
}

public void setHonoraire(String  honoraire){
     this.honoraire = honoraire;
}

public String  getHonoraireMin(){
    return honoraireMin;
}

public void setHonoraireMin(String  honoraireMin){
     this.honoraireMin = honoraireMin;
}

public String  getHonoraireMax(){
    return honoraireMax;
}

public void setHonoraireMax(String  honoraireMax){
     this.honoraireMax = honoraireMax;
}

public String  getPenalite(){
    return penalite;
}

public void setPenalite(String  penalite){
     this.penalite = penalite;
}

public String  getPenaliteMin(){
    return penaliteMin;
}

public void setPenaliteMin(String  penaliteMin){
     this.penaliteMin = penaliteMin;
}

public String  getPenaliteMax(){
    return penaliteMax;
}

public void setPenaliteMax(String  penaliteMax){
     this.penaliteMax = penaliteMax;
}

public String  getMajoration(){
    return majoration;
}

public void setMajoration(String  majoration){
     this.majoration = majoration;
}

public String  getMajorationMin(){
    return majorationMin;
}

public void setMajorationMin(String  majorationMin){
     this.majorationMin = majorationMin;
}

public String  getMajorationMax(){
    return majorationMax;
}

public void setMajorationMax(String  majorationMax){
     this.majorationMax = majorationMax;
}

public String  getDescription(){
    return description;
}

public void setDescription(String  description){
     this.description = description;
}

public String  getReference(){
    return reference;
}

public void setReference(String  reference){
     this.reference = reference;
}

public String  getReferenceSociete(){
    return referenceSociete;
}

public void setReferenceSociete(String  referenceSociete){
     this.referenceSociete = referenceSociete;
}

public String  getReferenceComptableValidateur(){
    return referenceComptableValidateur;
}

public void setReferenceComptableValidateur(String  referenceComptableValidateur){
     this.referenceComptableValidateur = referenceComptableValidateur;
}

public String  getReferenceComptableCreateur(){
    return referenceComptableCreateur;
}

public void setReferenceComptableCreateur(String  referenceComptableCreateur){
     this.referenceComptableCreateur = referenceComptableCreateur;
}

public String  getDateValidation(){
    return dateValidation;
}

public void setDateValidation(String  dateValidation){
     this.dateValidation = dateValidation;
}

public String  getDateValidationMin(){
    return dateValidationMin;
}

public void setDateValidationMin(String  dateValidationMin){
     this.dateValidationMin = dateValidationMin;
}

public String  getDateValidationMax(){
    return dateValidationMax;
}

public void setDateValidationMax(String  dateValidationMax){
     this.dateValidationMax = dateValidationMax;
}

public String  getDateSoumission(){
    return dateSoumission;
}

public void setDateSoumission(String  dateSoumission){
     this.dateSoumission = dateSoumission;
}

public String  getDateSoumissionMin(){
    return dateSoumissionMin;
}

public void setDateSoumissionMin(String  dateSoumissionMin){
     this.dateSoumissionMin = dateSoumissionMin;
}

public String  getDateSoumissionMax(){
    return dateSoumissionMax;
}

public void setDateSoumissionMax(String  dateSoumissionMax){
     this.dateSoumissionMax = dateSoumissionMax;
}

public String  getDateAffectationComptable(){
    return dateAffectationComptable;
}

public void setDateAffectationComptable(String  dateAffectationComptable){
     this.dateAffectationComptable = dateAffectationComptable;
}

public String  getDateAffectationComptableMin(){
    return dateAffectationComptableMin;
}

public void setDateAffectationComptableMin(String  dateAffectationComptableMin){
     this.dateAffectationComptableMin = dateAffectationComptableMin;
}

public String  getDateAffectationComptableMax(){
    return dateAffectationComptableMax;
}

public void setDateAffectationComptableMax(String  dateAffectationComptableMax){
     this.dateAffectationComptableMax = dateAffectationComptableMax;
}

public String  getDateFinalisation(){
    return dateFinalisation;
}

public void setDateFinalisation(String  dateFinalisation){
     this.dateFinalisation = dateFinalisation;
}

public String  getDateFinalisationMin(){
    return dateFinalisationMin;
}

public void setDateFinalisationMin(String  dateFinalisationMin){
     this.dateFinalisationMin = dateFinalisationMin;
}

public String  getDateFinalisationMax(){
    return dateFinalisationMax;
}

public void setDateFinalisationMax(String  dateFinalisationMax){
     this.dateFinalisationMax = dateFinalisationMax;
}

public String  getDateSaisie(){
    return dateSaisie;
}

public void setDateSaisie(String  dateSaisie){
     this.dateSaisie = dateSaisie;
}

public String  getDateSaisieMin(){
    return dateSaisieMin;
}

public void setDateSaisieMin(String  dateSaisieMin){
     this.dateSaisieMin = dateSaisieMin;
}

public String  getDateSaisieMax(){
    return dateSaisieMax;
}

public void setDateSaisieMax(String  dateSaisieMax){
     this.dateSaisieMax = dateSaisieMax;
}

public EtatIRVo  getEtatIRVo (){
    return etatIRVo ;
}

public void setEtatIRVo (EtatIRVo  etatIRVo ){
     this.etatIRVo  = etatIRVo ;
}

public List<IREmployeVo> getIREmployesVo(){
    return iREmployesVo;
}

public void setIREmployesVo(List<IREmployeVo> iREmployesVo){
     this.iREmployesVo = iREmployesVo;
}




}