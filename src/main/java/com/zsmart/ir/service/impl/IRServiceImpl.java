
package com.zsmart.ir.service.impl ;
import com.zsmart.ir.service.facade.IRService ; 
import com.zsmart.ir.dao.IRDao ;
import com.zsmart.ir.service.util.SearchUtil;
import com.zsmart.ir.bean.IR;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.ir.bean.EtatIR; 
import com.zsmart.ir.service.facade.EtatIRService ; 
import com.zsmart.ir.service.facade.IREmployeService ; 
import com.zsmart.ir.bean.IREmploye ; 

 @Service  

 public class IRServiceImpl implements IRService  {


 @Autowired 

 private IRDao irDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private IREmployeService iremployeService; 

 @Autowired 

 private EtatIRService etatirService; 

 @Override 
public IR  save (IR ir){

if(ir== null){ 
 return null; 
}else {
 irDao.save(ir);
return ir;
}
}

 @Override 
public IR  saveWithIrEmployes (IR ir){

if(ir== null){ 
        return null; 
}else {
   if(ir.getIrEmployes().isEmpty()){
            return null;
        }else{
            for (IREmploye iremploye : ir.getIrEmployes()) {
iremploye.setIr(ir);
 iremployeService.save(  iremploye);          
            }
            }
irDao.save(ir);
return ir;
}
}

 @Override 
public List< IR>  findAll(){
 return irDao.findAll();
}

 @Override 
public IR findById(Long id){
 return irDao.getOne(id);
}

 @Override 
public IR  findByReference(String  reference){
 return irDao.findByReference(reference);
}

 @Override 
public int delete(IR ir){
if(ir== null){ 
  return -1; 
}else {
 irDao.delete(ir);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       irDao.deleteById(id);
}

 @Override 
public void  deleteByReference(String  reference){
  irDao.deleteByReference(reference);
}
public void clone(IR ir,IR irClone){
if(ir!= null && irClone != null){
irClone.setId(ir.getId());
irClone.setNombreEmployeeDeclaree(ir.getNombreEmployeeDeclaree());
irClone.setTotalSalaire(ir.getTotalSalaire());
irClone.setTotalPrime(ir.getTotalPrime());
irClone.setMontantTotal(ir.getMontantTotal());
irClone.setMontantBaseIr(ir.getMontantBaseIr());
irClone.setMontantRetard(ir.getMontantRetard());
irClone.setMontantMajoration(ir.getMontantMajoration());
irClone.setMontantPenalite(ir.getMontantPenalite());
irClone.setNomberMoisRetard(ir.getNomberMoisRetard());
irClone.setAnne(ir.getAnne());
irClone.setMois(ir.getMois());
irClone.setHonoraire(ir.getHonoraire());
irClone.setPenalite(ir.getPenalite());
irClone.setMajoration(ir.getMajoration());
irClone.setDescription(ir.getDescription());
irClone.setReference(ir.getReference());
irClone.setReferenceSociete(ir.getReferenceSociete());
irClone.setReferenceComptableValidateur(ir.getReferenceComptableValidateur());
irClone.setReferenceComptableCreateur(ir.getReferenceComptableCreateur());
irClone.setDateValidation(ir.getDateValidation());
irClone.setDateSoumission(ir.getDateSoumission());
irClone.setDateAffectationComptable(ir.getDateAffectationComptable());
irClone.setDateFinalisation(ir.getDateFinalisation());
irClone.setDateSaisie(ir.getDateSaisie());
irClone.setEtatIR(etatirService.clone(ir.getEtatIR()));
irClone.setIrEmployes(iremployeService.clone(ir.getIrEmployes()));
}
}
public IR clone(IR ir){
if(ir== null){       return null ;
}else{IR irClone= new IR();
irClone.setId(ir.getId());
irClone.setNombreEmployeeDeclaree(ir.getNombreEmployeeDeclaree());
irClone.setTotalSalaire(ir.getTotalSalaire());
irClone.setTotalPrime(ir.getTotalPrime());
irClone.setMontantTotal(ir.getMontantTotal());
irClone.setMontantBaseIr(ir.getMontantBaseIr());
irClone.setMontantRetard(ir.getMontantRetard());
irClone.setMontantMajoration(ir.getMontantMajoration());
irClone.setMontantPenalite(ir.getMontantPenalite());
irClone.setNomberMoisRetard(ir.getNomberMoisRetard());
irClone.setAnne(ir.getAnne());
irClone.setMois(ir.getMois());
irClone.setHonoraire(ir.getHonoraire());
irClone.setPenalite(ir.getPenalite());
irClone.setMajoration(ir.getMajoration());
irClone.setDescription(ir.getDescription());
irClone.setReference(ir.getReference());
irClone.setReferenceSociete(ir.getReferenceSociete());
irClone.setReferenceComptableValidateur(ir.getReferenceComptableValidateur());
irClone.setReferenceComptableCreateur(ir.getReferenceComptableCreateur());
irClone.setDateValidation(ir.getDateValidation());
irClone.setDateSoumission(ir.getDateSoumission());
irClone.setDateAffectationComptable(ir.getDateAffectationComptable());
irClone.setDateFinalisation(ir.getDateFinalisation());
irClone.setDateSaisie(ir.getDateSaisie());
irClone.setEtatIR(etatirService.clone(ir.getEtatIR()));
irClone.setIrEmployes(iremployeService.clone(ir.getIrEmployes()));
return irClone;
}
}
public List<IR> clone(List<IR>irs){
if(irs== null){
       return null ;
}else{List<IR> irsClone = new ArrayList();
	 	 	 irs.forEach((ir)->{irsClone.add(clone(ir));
});return irsClone;
}
}
 @Override 
 public List< IR>  findByCriteria(String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,int nombreEmployeeDeclareeMin,int nombreEmployeeDeclareeMax,BigDecimal totalSalaireMin,BigDecimal totalSalaireMax,BigDecimal totalPrimeMin,BigDecimal totalPrimeMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseIrMin,BigDecimal montantBaseIrMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Integer anneMin,Integer anneMax,Integer moisMin,Integer moisMax,BigDecimal honoraireMin,BigDecimal honoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
 return entityManager.createQuery(constructQuery(description,reference,referenceSociete,referenceComptableValidateur,referenceComptableCreateur,idMin,idMax,nombreEmployeeDeclareeMin,nombreEmployeeDeclareeMax,totalSalaireMin,totalSalaireMax,totalPrimeMin,totalPrimeMax,montantTotalMin,montantTotalMax,montantBaseIrMin,montantBaseIrMax,montantRetardMin,montantRetardMax,montantMajorationMin,montantMajorationMax,montantPenaliteMin,montantPenaliteMax,nomberMoisRetardMin,nomberMoisRetardMax,anneMin,anneMax,moisMin,moisMax,honoraireMin,honoraireMax,penaliteMin,penaliteMax,majorationMin,majorationMax,dateValidationMin,dateValidationMax,dateSoumissionMin,dateSoumissionMax,dateAffectationComptableMin,dateAffectationComptableMax,dateFinalisationMin,dateFinalisationMax,dateSaisieMin,dateSaisieMax)).getResultList(); 
 }
private String constructQuery(String description,String reference,String referenceSociete,String referenceComptableValidateur,String referenceComptableCreateur,Long idMin,Long idMax,int nombreEmployeeDeclareeMin,int nombreEmployeeDeclareeMax,BigDecimal totalSalaireMin,BigDecimal totalSalaireMax,BigDecimal totalPrimeMin,BigDecimal totalPrimeMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax,BigDecimal montantBaseIrMin,BigDecimal montantBaseIrMax,BigDecimal montantRetardMin,BigDecimal montantRetardMax,BigDecimal montantMajorationMin,BigDecimal montantMajorationMax,BigDecimal montantPenaliteMin,BigDecimal montantPenaliteMax,Integer nomberMoisRetardMin,Integer nomberMoisRetardMax,Integer anneMin,Integer anneMax,Integer moisMin,Integer moisMax,BigDecimal honoraireMin,BigDecimal honoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,Date dateValidationMin,Date dateValidationMax,Date dateSoumissionMin,Date dateSoumissionMax,Date dateAffectationComptableMin,Date dateAffectationComptableMax,Date dateFinalisationMin,Date dateFinalisationMax,Date dateSaisieMin,Date dateSaisieMax){
String query = "SELECT i FROM IR i where 1=1 ";
query += SearchUtil.addConstraint( "i", "description","=",description);
query += SearchUtil.addConstraint( "i", "reference","=",reference);
query += SearchUtil.addConstraint( "i", "referenceSociete","=",referenceSociete);
query += SearchUtil.addConstraint( "i", "referenceComptableValidateur","=",referenceComptableValidateur);
query += SearchUtil.addConstraint( "i", "referenceComptableCreateur","=",referenceComptableCreateur);
query += SearchUtil.addConstraintMinMax("i", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("i", "nombreEmployeeDeclaree", nombreEmployeeDeclareeMin, nombreEmployeeDeclareeMax);
query += SearchUtil.addConstraintMinMax("i", "totalSalaire", totalSalaireMin, totalSalaireMax);
query += SearchUtil.addConstraintMinMax("i", "totalPrime", totalPrimeMin, totalPrimeMax);
query += SearchUtil.addConstraintMinMax("i", "montantTotal", montantTotalMin, montantTotalMax);
query += SearchUtil.addConstraintMinMax("i", "montantBaseIr", montantBaseIrMin, montantBaseIrMax);
query += SearchUtil.addConstraintMinMax("i", "montantRetard", montantRetardMin, montantRetardMax);
query += SearchUtil.addConstraintMinMax("i", "montantMajoration", montantMajorationMin, montantMajorationMax);
query += SearchUtil.addConstraintMinMax("i", "montantPenalite", montantPenaliteMin, montantPenaliteMax);
query += SearchUtil.addConstraintMinMax("i", "nomberMoisRetard", nomberMoisRetardMin, nomberMoisRetardMax);
query += SearchUtil.addConstraintMinMax("i", "anne", anneMin, anneMax);
query += SearchUtil.addConstraintMinMax("i", "mois", moisMin, moisMax);
query += SearchUtil.addConstraintMinMax("i", "honoraire", honoraireMin, honoraireMax);
query += SearchUtil.addConstraintMinMax("i", "penalite", penaliteMin, penaliteMax);
query += SearchUtil.addConstraintMinMax("i", "majoration", majorationMin, majorationMax);
query += SearchUtil.addConstraintMinMaxDate("i"," dateValidation", dateValidationMin, dateValidationMax);
query += SearchUtil.addConstraintMinMaxDate("i"," dateSoumission", dateSoumissionMin, dateSoumissionMax);
query += SearchUtil.addConstraintMinMaxDate("i"," dateAffectationComptable", dateAffectationComptableMin, dateAffectationComptableMax);
query += SearchUtil.addConstraintMinMaxDate("i"," dateFinalisation", dateFinalisationMin, dateFinalisationMax);
query += SearchUtil.addConstraintMinMaxDate("i"," dateSaisie", dateSaisieMin, dateSaisieMax);

  return query; 
}
}
