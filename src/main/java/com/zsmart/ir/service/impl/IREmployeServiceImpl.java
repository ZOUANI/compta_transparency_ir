
package com.zsmart.ir.service.impl ;
import com.zsmart.ir.service.facade.IREmployeService ; 
import com.zsmart.ir.dao.IREmployeDao ;
import com.zsmart.ir.service.util.SearchUtil;
import com.zsmart.ir.bean.IREmploye;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 
import com.zsmart.ir.bean.IR; 
import com.zsmart.ir.service.facade.IRService ; 
import com.zsmart.ir.bean.TauxIR; 
import com.zsmart.ir.service.facade.TauxIRService ; 
import com.zsmart.ir.bean.EtatIR; 
import com.zsmart.ir.service.facade.EtatIRService ; 

 @Service  

 public class IREmployeServiceImpl implements IREmployeService  {


 @Autowired 

 private IREmployeDao iremployeDao;

 @Autowired 

 private EntityManager entityManager; 

 @Autowired 

 private IRService irService; 

 @Autowired 

 private TauxIRService tauxirService; 

 @Autowired 

 private EtatIRService etatirService; 

 @Override 
public IREmploye  save (IREmploye iremploye){

if(iremploye== null){ 
 return null; 
}else {
 iremployeDao.save(iremploye);
return iremploye;
}
}

 @Override 
public List< IREmploye>  findAll(){
 return iremployeDao.findAll();
}

 @Override 
public IREmploye findById(Long id){
 return iremployeDao.getOne(id);
}

 @Override 
public int delete(IREmploye iremploye){
if(iremploye== null){ 
  return -1; 
}else {
 iremployeDao.delete(iremploye);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       iremployeDao.deleteById(id);
}
public void clone(IREmploye iremploye,IREmploye iremployeClone){
if(iremploye!= null && iremployeClone != null){
iremployeClone.setId(iremploye.getId());
iremployeClone.setReferenceEemploye(iremploye.getReferenceEemploye());
iremployeClone.setSalaire(iremploye.getSalaire());
iremployeClone.setPrime(iremploye.getPrime());
iremployeClone.setHonnoraire(iremploye.getHonnoraire());
iremployeClone.setPenalite(iremploye.getPenalite());
iremployeClone.setMajoration(iremploye.getMajoration());
iremployeClone.setMontantTotal(iremploye.getMontantTotal());
iremployeClone.setIr(irService.clone(iremploye.getIr()));
iremployeClone.setTauxIR(tauxirService.clone(iremploye.getTauxIR()));
iremployeClone.setEtatIR(etatirService.clone(iremploye.getEtatIR()));
}
}
public IREmploye clone(IREmploye iremploye){
if(iremploye== null){       return null ;
}else{IREmploye iremployeClone= new IREmploye();
iremployeClone.setId(iremploye.getId());
iremployeClone.setReferenceEemploye(iremploye.getReferenceEemploye());
iremployeClone.setSalaire(iremploye.getSalaire());
iremployeClone.setPrime(iremploye.getPrime());
iremployeClone.setHonnoraire(iremploye.getHonnoraire());
iremployeClone.setPenalite(iremploye.getPenalite());
iremployeClone.setMajoration(iremploye.getMajoration());
iremployeClone.setMontantTotal(iremploye.getMontantTotal());
iremployeClone.setIr(irService.clone(iremploye.getIr()));
iremployeClone.setTauxIR(tauxirService.clone(iremploye.getTauxIR()));
iremployeClone.setEtatIR(etatirService.clone(iremploye.getEtatIR()));
return iremployeClone;
}
}
public List<IREmploye> clone(List<IREmploye>iremployes){
if(iremployes== null){
       return null ;
}else{List<IREmploye> iremployesClone = new ArrayList();
	 	 	 iremployes.forEach((iremploye)->{iremployesClone.add(clone(iremploye));
});return iremployesClone;
}
}
 @Override 
 public List< IREmploye>  findByCriteria(String referenceEemploye,Long idMin,Long idMax,BigDecimal salaireMin,BigDecimal salaireMax,BigDecimal primeMin,BigDecimal primeMax,BigDecimal honnoraireMin,BigDecimal honnoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax){
 return entityManager.createQuery(constructQuery(referenceEemploye,idMin,idMax,salaireMin,salaireMax,primeMin,primeMax,honnoraireMin,honnoraireMax,penaliteMin,penaliteMax,majorationMin,majorationMax,montantTotalMin,montantTotalMax)).getResultList(); 
 }
private String constructQuery(String referenceEemploye,Long idMin,Long idMax,BigDecimal salaireMin,BigDecimal salaireMax,BigDecimal primeMin,BigDecimal primeMax,BigDecimal honnoraireMin,BigDecimal honnoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax){
String query = "SELECT i FROM IREmploye i where 1=1 ";
query += SearchUtil.addConstraint( "i", "referenceEemploye","=",referenceEemploye);
query += SearchUtil.addConstraintMinMax("i", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("i", "salaire", salaireMin, salaireMax);
query += SearchUtil.addConstraintMinMax("i", "prime", primeMin, primeMax);
query += SearchUtil.addConstraintMinMax("i", "honnoraire", honnoraireMin, honnoraireMax);
query += SearchUtil.addConstraintMinMax("i", "penalite", penaliteMin, penaliteMax);
query += SearchUtil.addConstraintMinMax("i", "majoration", majorationMin, majorationMax);
query += SearchUtil.addConstraintMinMax("i", "montantTotal", montantTotalMin, montantTotalMax);

  return query; 
}
}
