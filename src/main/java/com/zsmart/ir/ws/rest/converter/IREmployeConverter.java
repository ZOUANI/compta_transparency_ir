package com.zsmart.ir.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.ir.service.util.*;
import com.zsmart.ir.bean.IREmploye; 
import com.zsmart.ir.ws.rest.vo.IREmployeVo; 

 @Component 
public class IREmployeConverter extends AbstractConverter<IREmploye,IREmployeVo>{ 

private boolean ir; 

 @Autowired
 private IRConverter iRConverter ; 
private boolean tauxIR; 

 @Autowired
 private TauxIRConverter tauxIRConverter ; 
private boolean etatIR; 

 @Autowired
 private EtatIRConverter etatIRConverter ; 

 @Override 
 public IREmploye toItem(IREmployeVo vo) {
 if (vo == null) {
    return null;
      } else {
IREmploye item = new IREmploye();

 if(ir&& vo.getIrVo() != null) {
 item.setIr(iRConverter.toItem(vo.getIrVo()));
} 
 
 if(tauxIR&& vo.getTauxIRVo() != null) {
 item.setTauxIR(tauxIRConverter.toItem(vo.getTauxIRVo()));
} 
 
 if(etatIR&& vo.getEtatIRVo() != null) {
 item.setEtatIR(etatIRConverter.toItem(vo.getEtatIRVo()));
} 
 
 if (StringUtil.isNotEmpty(vo.getReferenceEemploye())) {
 item.setReferenceEemploye(vo.getReferenceEemploye());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getSalaire() != null) {
 item.setSalaire(NumberUtil.toBigDecimal(vo.getSalaire()));
} 

 if (vo.getPrime() != null) {
 item.setPrime(NumberUtil.toBigDecimal(vo.getPrime()));
} 

 if (vo.getHonnoraire() != null) {
 item.setHonnoraire(NumberUtil.toBigDecimal(vo.getHonnoraire()));
} 

 if (vo.getPenalite() != null) {
 item.setPenalite(NumberUtil.toBigDecimal(vo.getPenalite()));
} 

 if (vo.getMajoration() != null) {
 item.setMajoration(NumberUtil.toBigDecimal(vo.getMajoration()));
} 

 if (vo.getMontantTotal() != null) {
 item.setMontantTotal(NumberUtil.toBigDecimal(vo.getMontantTotal()));
} 

return item;
 }
 }

  @Override 
 public IREmployeVo toVo(IREmploye item) {
 if (item == null) {
    return null;
      } else {
IREmployeVo vo = new IREmployeVo();

 if(ir&& item.getIr() != null) {
 vo.setIrVo(iRConverter.toVo(item.getIr()));
} 
 
 if(tauxIR&& item.getTauxIR() != null) {
 vo.setTauxIRVo(tauxIRConverter.toVo(item.getTauxIR()));
} 
 
 if(etatIR&& item.getEtatIR() != null) {
 vo.setEtatIRVo(etatIRConverter.toVo(item.getEtatIR()));
} 
 
 if (StringUtil.isNotEmpty(item.getReferenceEemploye())) {
 vo.setReferenceEemploye(item.getReferenceEemploye());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getSalaire() != null) {
 vo.setSalaire(NumberUtil.toString(item.getSalaire()));
} 

 if (item.getPrime() != null) {
 vo.setPrime(NumberUtil.toString(item.getPrime()));
} 

 if (item.getHonnoraire() != null) {
 vo.setHonnoraire(NumberUtil.toString(item.getHonnoraire()));
} 

 if (item.getPenalite() != null) {
 vo.setPenalite(NumberUtil.toString(item.getPenalite()));
} 

 if (item.getMajoration() != null) {
 vo.setMajoration(NumberUtil.toString(item.getMajoration()));
} 

 if (item.getMontantTotal() != null) {
 vo.setMontantTotal(NumberUtil.toString(item.getMontantTotal()));
} 

return vo;
 }
 }
public void init() { 

ir = true; 

tauxIR = true; 

etatIR = true; 
}
 } 
