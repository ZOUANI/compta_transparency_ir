
package com.zsmart.ir.service.impl ;
import com.zsmart.ir.service.facade.TauxIRService ; 
import com.zsmart.ir.dao.TauxIRDao ;
import com.zsmart.ir.service.util.SearchUtil;
import com.zsmart.ir.bean.TauxIR;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class TauxIRServiceImpl implements TauxIRService  {


 @Autowired 

 private TauxIRDao tauxirDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public TauxIR  save (TauxIR tauxir){

if(tauxir== null){ 
 return null; 
}else {
 tauxirDao.save(tauxir);
return tauxir;
}
}

 @Override 
public List< TauxIR>  findAll(){
 return tauxirDao.findAll();
}

 @Override 
public TauxIR findById(Long id){
 return tauxirDao.getOne(id);
}

 @Override 
public int delete(TauxIR tauxir){
if(tauxir== null){ 
  return -1; 
}else {
 tauxirDao.delete(tauxir);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       tauxirDao.deleteById(id);
}
public void clone(TauxIR tauxir,TauxIR tauxirClone){
if(tauxir!= null && tauxirClone != null){
tauxirClone.setId(tauxir.getId());
tauxirClone.setSalairMin(tauxir.getSalairMin());
tauxirClone.setSalairMax(tauxir.getSalairMax());
tauxirClone.setMontant(tauxir.getMontant());
tauxirClone.setMajoration(tauxir.getMajoration());
tauxirClone.setPenalite(tauxir.getPenalite());
tauxirClone.setDateApplicationDebut(tauxir.getDateApplicationDebut());
tauxirClone.setDateApplicationFin(tauxir.getDateApplicationFin());
}
}
public TauxIR clone(TauxIR tauxir){
if(tauxir== null){       return null ;
}else{TauxIR tauxirClone= new TauxIR();
tauxirClone.setId(tauxir.getId());
tauxirClone.setSalairMin(tauxir.getSalairMin());
tauxirClone.setSalairMax(tauxir.getSalairMax());
tauxirClone.setMontant(tauxir.getMontant());
tauxirClone.setMajoration(tauxir.getMajoration());
tauxirClone.setPenalite(tauxir.getPenalite());
tauxirClone.setDateApplicationDebut(tauxir.getDateApplicationDebut());
tauxirClone.setDateApplicationFin(tauxir.getDateApplicationFin());
return tauxirClone;
}
}
public List<TauxIR> clone(List<TauxIR>tauxirs){
if(tauxirs== null){
       return null ;
}else{List<TauxIR> tauxirsClone = new ArrayList();
	 	 	 tauxirs.forEach((tauxir)->{tauxirsClone.add(clone(tauxir));
});return tauxirsClone;
}
}
 @Override 
 public List< TauxIR>  findByCriteria(Long idMin,Long idMax,BigDecimal salairMinMin,BigDecimal salairMinMax,BigDecimal salairMaxMin,BigDecimal salairMaxMax,BigDecimal montantMin,BigDecimal montantMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal penaliteMin,BigDecimal penaliteMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax){
 return entityManager.createQuery(constructQuery(idMin,idMax,salairMinMin,salairMinMax,salairMaxMin,salairMaxMax,montantMin,montantMax,majorationMin,majorationMax,penaliteMin,penaliteMax,dateApplicationDebutMin,dateApplicationDebutMax,dateApplicationFinMin,dateApplicationFinMax)).getResultList(); 
 }
private String constructQuery(Long idMin,Long idMax,BigDecimal salairMinMin,BigDecimal salairMinMax,BigDecimal salairMaxMin,BigDecimal salairMaxMax,BigDecimal montantMin,BigDecimal montantMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal penaliteMin,BigDecimal penaliteMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax){
String query = "SELECT t FROM TauxIR t where 1=1 ";
query += SearchUtil.addConstraintMinMax("t", "id", idMin, idMax);
query += SearchUtil.addConstraintMinMax("t", "salairMin", salairMinMin, salairMinMax);
query += SearchUtil.addConstraintMinMax("t", "salairMax", salairMaxMin, salairMaxMax);
query += SearchUtil.addConstraintMinMax("t", "montant", montantMin, montantMax);
query += SearchUtil.addConstraintMinMax("t", "majoration", majorationMin, majorationMax);
query += SearchUtil.addConstraintMinMax("t", "penalite", penaliteMin, penaliteMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateApplicationDebut", dateApplicationDebutMin, dateApplicationDebutMax);
query += SearchUtil.addConstraintMinMaxDate("t"," dateApplicationFin", dateApplicationFinMin, dateApplicationFinMax);

  return query; 
}
}
