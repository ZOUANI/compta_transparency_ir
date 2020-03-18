
package com.zsmart.ir.service.impl ;
import com.zsmart.ir.service.facade.EtatIRService ; 
import com.zsmart.ir.dao.EtatIRDao ;
import com.zsmart.ir.service.util.SearchUtil;
import com.zsmart.ir.bean.EtatIR;
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.ArrayList; 
import java.math.BigDecimal; 
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Date; 
import org.springframework.stereotype.Service; 
import java.util.List; 

 @Service  

 public class EtatIRServiceImpl implements EtatIRService  {


 @Autowired 

 private EtatIRDao etatirDao;

 @Autowired 

 private EntityManager entityManager; 

 @Override 
public EtatIR  save (EtatIR etatir){

if(etatir== null){ 
 return null; 
}else {
 etatirDao.save(etatir);
return etatir;
}
}

 @Override 
public List< EtatIR>  findAll(){
 return etatirDao.findAll();
}

 @Override 
public EtatIR findById(Long id){
 return etatirDao.getOne(id);
}

 @Override 
public int delete(EtatIR etatir){
if(etatir== null){ 
  return -1; 
}else {
 etatirDao.delete(etatir);
return 1 ;
}
}

 @Override 
public void deleteById(Long id){
       etatirDao.deleteById(id);
}
public void clone(EtatIR etatir,EtatIR etatirClone){
if(etatir!= null && etatirClone != null){
etatirClone.setId(etatir.getId());
etatirClone.setLibelle(etatir.getLibelle());
etatirClone.setCode(etatir.getCode());
}
}
public EtatIR clone(EtatIR etatir){
if(etatir== null){       return null ;
}else{EtatIR etatirClone= new EtatIR();
etatirClone.setId(etatir.getId());
etatirClone.setLibelle(etatir.getLibelle());
etatirClone.setCode(etatir.getCode());
return etatirClone;
}
}
public List<EtatIR> clone(List<EtatIR>etatirs){
if(etatirs== null){
       return null ;
}else{List<EtatIR> etatirsClone = new ArrayList();
	 	 	 etatirs.forEach((etatir)->{etatirsClone.add(clone(etatir));
});return etatirsClone;
}
}
 @Override 
 public List< EtatIR>  findByCriteria(String libelle,String code,Long idMin,Long idMax){
 return entityManager.createQuery(constructQuery(libelle,code,idMin,idMax)).getResultList(); 
 }
private String constructQuery(String libelle,String code,Long idMin,Long idMax){
String query = "SELECT e FROM EtatIR e where 1=1 ";
query += SearchUtil.addConstraint( "e", "libelle","=",libelle);
query += SearchUtil.addConstraint( "e", "code","=",code);
query += SearchUtil.addConstraintMinMax("e", "id", idMin, idMax);

  return query; 
}
}
