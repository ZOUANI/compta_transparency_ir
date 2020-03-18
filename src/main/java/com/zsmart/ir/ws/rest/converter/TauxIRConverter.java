package com.zsmart.ir.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.ir.service.util.*;
import com.zsmart.ir.bean.TauxIR; 
import com.zsmart.ir.ws.rest.vo.TauxIRVo; 

 @Component 
public class TauxIRConverter extends AbstractConverter<TauxIR,TauxIRVo>{ 


 @Override 
 public TauxIR toItem(TauxIRVo vo) {
 if (vo == null) {
    return null;
      } else {
TauxIR item = new TauxIR();

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

 if (vo.getSalairMin() != null) {
 item.setSalairMin(NumberUtil.toBigDecimal(vo.getSalairMin()));
} 

 if (vo.getSalairMax() != null) {
 item.setSalairMax(NumberUtil.toBigDecimal(vo.getSalairMax()));
} 

 if (vo.getMontant() != null) {
 item.setMontant(NumberUtil.toBigDecimal(vo.getMontant()));
} 

 if (vo.getMajoration() != null) {
 item.setMajoration(NumberUtil.toBigDecimal(vo.getMajoration()));
} 

 if (vo.getPenalite() != null) {
 item.setPenalite(NumberUtil.toBigDecimal(vo.getPenalite()));
} 

 if (vo.getDateApplicationDebut() != null) {
 item.setDateApplicationDebut(DateUtil.parse(vo.getDateApplicationDebut()));
} 

 if (vo.getDateApplicationFin() != null) {
 item.setDateApplicationFin(DateUtil.parse(vo.getDateApplicationFin()));
} 

return item;
 }
 }

  @Override 
 public TauxIRVo toVo(TauxIR item) {
 if (item == null) {
    return null;
      } else {
TauxIRVo vo = new TauxIRVo();

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

 if (item.getSalairMin() != null) {
 vo.setSalairMin(NumberUtil.toString(item.getSalairMin()));
} 

 if (item.getSalairMax() != null) {
 vo.setSalairMax(NumberUtil.toString(item.getSalairMax()));
} 

 if (item.getMontant() != null) {
 vo.setMontant(NumberUtil.toString(item.getMontant()));
} 

 if (item.getMajoration() != null) {
 vo.setMajoration(NumberUtil.toString(item.getMajoration()));
} 

 if (item.getPenalite() != null) {
 vo.setPenalite(NumberUtil.toString(item.getPenalite()));
} 

 if (item.getDateApplicationDebut() != null) {
 vo.setDateApplicationDebut(DateUtil.formateDate(item.getDateApplicationDebut()));
} 

 if (item.getDateApplicationFin() != null) {
 vo.setDateApplicationFin(DateUtil.formateDate(item.getDateApplicationFin()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
