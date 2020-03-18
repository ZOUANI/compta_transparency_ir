package com.zsmart.ir.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.ir.service.util.*;
import com.zsmart.ir.bean.IR; 
import com.zsmart.ir.ws.rest.vo.IRVo; 

 @Component 
public class IRConverter extends AbstractConverter<IR,IRVo>{ 

private boolean etatIR; 

 @Autowired
 private EtatIRConverter etatIRConverter ; 
private boolean irEmployes; 

 @Autowired
 private IREmployeConverter iREmployeConverter ; 

 @Override 
 public IR toItem(IRVo vo) {
 if (vo == null) {
    return null;
      } else {
IR item = new IR();

 if(etatIR&& vo.getEtatIRVo() != null) {
 item.setEtatIR(etatIRConverter.toItem(vo.getEtatIRVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getDescription())) {
 item.setDescription(vo.getDescription());
} 

 if (StringUtil.isNotEmpty(vo.getReference())) {
 item.setReference(vo.getReference());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceSociete())) {
 item.setReferenceSociete(vo.getReferenceSociete());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceComptableValidateur())) {
 item.setReferenceComptableValidateur(vo.getReferenceComptableValidateur());
} 

 if (StringUtil.isNotEmpty(vo.getReferenceComptableCreateur())) {
 item.setReferenceComptableCreateur(vo.getReferenceComptableCreateur());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getNombreEmployeeDeclaree() != null) {
 item.setNombreEmployeeDeclaree(NumberUtil.toInt(vo.getNombreEmployeeDeclaree()));
} 

 if (vo.getTotalSalaire() != null) {
 item.setTotalSalaire(NumberUtil.toBigDecimal(vo.getTotalSalaire()));
} 

 if (vo.getTotalPrime() != null) {
 item.setTotalPrime(NumberUtil.toBigDecimal(vo.getTotalPrime()));
} 

 if (vo.getMontantTotal() != null) {
 item.setMontantTotal(NumberUtil.toBigDecimal(vo.getMontantTotal()));
} 

 if (vo.getMontantBaseIr() != null) {
 item.setMontantBaseIr(NumberUtil.toBigDecimal(vo.getMontantBaseIr()));
} 

 if (vo.getMontantRetard() != null) {
 item.setMontantRetard(NumberUtil.toBigDecimal(vo.getMontantRetard()));
} 

 if (vo.getMontantMajoration() != null) {
 item.setMontantMajoration(NumberUtil.toBigDecimal(vo.getMontantMajoration()));
} 

 if (vo.getMontantPenalite() != null) {
 item.setMontantPenalite(NumberUtil.toBigDecimal(vo.getMontantPenalite()));
} 

 if (vo.getNomberMoisRetard() != null) {
 item.setNomberMoisRetard((vo.getNomberMoisRetard()));
} 

 if (vo.getAnne() != null) {
 item.setAnne((vo.getAnne()));
} 

 if (vo.getMois() != null) {
 item.setMois((vo.getMois()));
} 

 if (vo.getHonoraire() != null) {
 item.setHonoraire(NumberUtil.toBigDecimal(vo.getHonoraire()));
} 

 if (vo.getPenalite() != null) {
 item.setPenalite(NumberUtil.toBigDecimal(vo.getPenalite()));
} 

 if (vo.getMajoration() != null) {
 item.setMajoration(NumberUtil.toBigDecimal(vo.getMajoration()));
} 

 if (vo.getDateValidation() != null) {
 item.setDateValidation(DateUtil.parse(vo.getDateValidation()));
} 

 if (vo.getDateSoumission() != null) {
 item.setDateSoumission(DateUtil.parse(vo.getDateSoumission()));
} 

 if (vo.getDateAffectationComptable() != null) {
 item.setDateAffectationComptable(DateUtil.parse(vo.getDateAffectationComptable()));
} 

 if (vo.getDateFinalisation() != null) {
 item.setDateFinalisation(DateUtil.parse(vo.getDateFinalisation()));
} 

 if (vo.getDateSaisie() != null) {
 item.setDateSaisie(DateUtil.parse(vo.getDateSaisie()));
} 

 if (ListUtil.isNotEmpty(vo.getIREmployesVo()) && irEmployes) {
 item.setIrEmployes(iREmployeConverter.toItem(vo.getIREmployesVo())); 
} 

return item;
 }
 }

  @Override 
 public IRVo toVo(IR item) {
 if (item == null) {
    return null;
      } else {
IRVo vo = new IRVo();

 if(etatIR&& item.getEtatIR() != null) {
 vo.setEtatIRVo(etatIRConverter.toVo(item.getEtatIR()));
} 
 
 if (StringUtil.isNotEmpty(item.getDescription())) {
 vo.setDescription(item.getDescription());
} 

 if (StringUtil.isNotEmpty(item.getReference())) {
 vo.setReference(item.getReference());
} 

 if (StringUtil.isNotEmpty(item.getReferenceSociete())) {
 vo.setReferenceSociete(item.getReferenceSociete());
} 

 if (StringUtil.isNotEmpty(item.getReferenceComptableValidateur())) {
 vo.setReferenceComptableValidateur(item.getReferenceComptableValidateur());
} 

 if (StringUtil.isNotEmpty(item.getReferenceComptableCreateur())) {
 vo.setReferenceComptableCreateur(item.getReferenceComptableCreateur());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getNombreEmployeeDeclaree() != null) {
 vo.setNombreEmployeeDeclaree(NumberUtil.toString(item.getNombreEmployeeDeclaree()));
} 

 if (item.getTotalSalaire() != null) {
 vo.setTotalSalaire(NumberUtil.toString(item.getTotalSalaire()));
} 

 if (item.getTotalPrime() != null) {
 vo.setTotalPrime(NumberUtil.toString(item.getTotalPrime()));
} 

 if (item.getMontantTotal() != null) {
 vo.setMontantTotal(NumberUtil.toString(item.getMontantTotal()));
} 

 if (item.getMontantBaseIr() != null) {
 vo.setMontantBaseIr(NumberUtil.toString(item.getMontantBaseIr()));
} 

 if (item.getMontantRetard() != null) {
 vo.setMontantRetard(NumberUtil.toString(item.getMontantRetard()));
} 

 if (item.getMontantMajoration() != null) {
 vo.setMontantMajoration(NumberUtil.toString(item.getMontantMajoration()));
} 

 if (item.getMontantPenalite() != null) {
 vo.setMontantPenalite(NumberUtil.toString(item.getMontantPenalite()));
} 

 if (item.getNomberMoisRetard() != null) {
 vo.setNomberMoisRetard(NumberUtil.toString(item.getNomberMoisRetard()));
} 

 if (item.getAnne() != null) {
 vo.setAnne(NumberUtil.toString(item.getAnne()));
} 

 if (item.getMois() != null) {
 vo.setMois(NumberUtil.toString(item.getMois()));
} 

 if (item.getHonoraire() != null) {
 vo.setHonoraire(NumberUtil.toString(item.getHonoraire()));
} 

 if (item.getPenalite() != null) {
 vo.setPenalite(NumberUtil.toString(item.getPenalite()));
} 

 if (item.getMajoration() != null) {
 vo.setMajoration(NumberUtil.toString(item.getMajoration()));
} 

 if (item.getDateValidation() != null) {
 vo.setDateValidation(DateUtil.formateDate(item.getDateValidation()));
} 

 if (item.getDateSoumission() != null) {
 vo.setDateSoumission(DateUtil.formateDate(item.getDateSoumission()));
} 

 if (item.getDateAffectationComptable() != null) {
 vo.setDateAffectationComptable(DateUtil.formateDate(item.getDateAffectationComptable()));
} 

 if (item.getDateFinalisation() != null) {
 vo.setDateFinalisation(DateUtil.formateDate(item.getDateFinalisation()));
} 

 if (item.getDateSaisie() != null) {
 vo.setDateSaisie(DateUtil.formateDate(item.getDateSaisie()));
} 

 if(ListUtil.isNotEmpty(item.getIrEmployes()) && irEmployes) {
 vo.setIREmployesVo(iREmployeConverter.toVo(item.getIrEmployes()));
} 

return vo;
 }
 }
public void init() { 

etatIR = true; 

irEmployes = true; 
}
 } 
