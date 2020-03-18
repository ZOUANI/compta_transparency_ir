package com.zsmart.ir.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.ir.bean.IR;
import com.zsmart.ir.bean.EtatIR; 
public interface IRService {

public IR save(IR ir); 
public IR  saveWithIrEmployes (IR ir);public List<IR>  findAll();
public IR findById(Long id);
public IR  findByReference(String  reference);
public int delete(IR ir);
public void  deleteById(Long id);
public void  deleteByReference(String  reference);
public void clone(IR ir,IR irClone);
public IR clone(IR ir);
public List<IR> clone(List<IR>irs);
 public List<IR>  findByCriteria(String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,int nombreEmployeeDeclareeMin,int nombreEmployeeDeclareeMax,BigDecimal totalSalaireMin,BigDecimal totalSalaireMax,BigDecimal totalPrimeMin,BigDecimal totalPrimeMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseIrMin,BigDecimal montantBaseIrMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Integer anneMin,Integer anneMax,Integer moisMin,Integer moisMax,BigDecimal honoraireMin,BigDecimal honoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax);

}
