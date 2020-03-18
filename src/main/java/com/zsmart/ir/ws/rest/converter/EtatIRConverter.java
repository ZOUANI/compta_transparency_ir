package com.zsmart.ir.ws.rest.converter;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.zsmart.ir.service.util.*;
import com.zsmart.ir.bean.EtatIR; 
import com.zsmart.ir.ws.rest.vo.EtatIRVo; 

 @Component 
public class EtatIRConverter extends AbstractConverter<EtatIR,EtatIRVo>{ 


 @Override 
 public EtatIR toItem(EtatIRVo vo) {
 if (vo == null) {
    return null;
      } else {
EtatIR item = new EtatIR();

 if (StringUtil.isNotEmpty(vo.getLibelle())) {
 item.setLibelle(vo.getLibelle());
} 

 if (StringUtil.isNotEmpty(vo.getCode())) {
 item.setCode(vo.getCode());
} 

 if (vo.getId() != null) {
 item.setId(NumberUtil.toLong(vo.getId()));
} 

return item;
 }
 }

  @Override 
 public EtatIRVo toVo(EtatIR item) {
 if (item == null) {
    return null;
      } else {
EtatIRVo vo = new EtatIRVo();

 if (StringUtil.isNotEmpty(item.getLibelle())) {
 vo.setLibelle(item.getLibelle());
} 

 if (StringUtil.isNotEmpty(item.getCode())) {
 vo.setCode(item.getCode());
} 

 if (item.getId() != null) {
 vo.setId(NumberUtil.toString(item.getId()));
} 

return vo;
 }
 }
public void init() { 
}
 } 
