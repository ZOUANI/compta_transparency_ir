package com.zsmart.ir.ws.rest.provided ;


import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.zsmart.ir.service.facade.IREmployeService;
import com.zsmart.ir.bean.IREmploye;
import com.zsmart.ir.ws.rest.vo.IREmployeVo;
import com.zsmart.ir.ws.rest.converter.IREmployeConverter;
import com.zsmart.ir.service.util.* ;
@RestController
@RequestMapping("/ir/IREmploye")
@CrossOrigin(origins = {"http://localhost:4200"})
public class IREmployeRest {

 @Autowired 
 private IREmployeService iREmployeService;

 @Autowired 
private IREmployeConverter iREmployeConverter ;

@PostMapping("/")
public IREmployeVo save(@RequestBody IREmployeVo iREmployeVo){
IREmploye iREmploye= iREmployeConverter.toItem(iREmployeVo);
return iREmployeConverter.toVo(iREmployeService.save(iREmploye));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
iREmployeService.deleteById(id);
}
@GetMapping("/")
public List<IREmployeVo> findAll(){
return iREmployeConverter.toVo(iREmployeService.findAll());
}

 public IREmployeConverter getIREmployeConverter(){
return iREmployeConverter;
}
 
 public void setIREmployeConverter(IREmployeConverter iREmployeConverter){
this.iREmployeConverter=iREmployeConverter;
}

 public IREmployeService getIREmployeService(){
return iREmployeService;
}
 
 public void setIREmployeService(IREmployeService iREmployeService){
this.iREmployeService=iREmployeService;
}

}