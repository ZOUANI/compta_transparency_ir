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
import com.zsmart.ir.service.facade.IRService;
import com.zsmart.ir.bean.IR;
import com.zsmart.ir.ws.rest.vo.IRVo;
import com.zsmart.ir.ws.rest.converter.IRConverter;
import com.zsmart.ir.service.util.* ;
@RestController
@RequestMapping("/ir/IR")
@CrossOrigin(origins = {"http://localhost:4200"})
public class IRRest {

 @Autowired 
 private IRService iRService;

 @Autowired 
private IRConverter iRConverter ;

@PostMapping("/")
public IRVo save(@RequestBody IRVo iRVo){
IR iR= iRConverter.toItem(iRVo);
return iRConverter.toVo(iRService.save(iR));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
iRService.deleteById(id);
}
@DeleteMapping("/{reference}")
public void  deleteByReference(@PathVariable String  reference){
iRService.deleteByReference(reference);
}
@GetMapping("/")
public List<IRVo> findAll(){
return iRConverter.toVo(iRService.findAll());
}

 public IRConverter getIRConverter(){
return iRConverter;
}
 
 public void setIRConverter(IRConverter iRConverter){
this.iRConverter=iRConverter;
}

 public IRService getIRService(){
return iRService;
}
 
 public void setIRService(IRService iRService){
this.iRService=iRService;
}

}