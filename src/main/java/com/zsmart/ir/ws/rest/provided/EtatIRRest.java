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
import com.zsmart.ir.service.facade.EtatIRService;
import com.zsmart.ir.bean.EtatIR;
import com.zsmart.ir.ws.rest.vo.EtatIRVo;
import com.zsmart.ir.ws.rest.converter.EtatIRConverter;
import com.zsmart.ir.service.util.* ;
@RestController
@RequestMapping("/ir/EtatIR")
@CrossOrigin(origins = {"http://localhost:4200"})
public class EtatIRRest {

 @Autowired 
 private EtatIRService etatIRService;

 @Autowired 
private EtatIRConverter etatIRConverter ;

@PostMapping("/")
public EtatIRVo save(@RequestBody EtatIRVo etatIRVo){
EtatIR etatIR= etatIRConverter.toItem(etatIRVo);
return etatIRConverter.toVo(etatIRService.save(etatIR));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
etatIRService.deleteById(id);
}
@GetMapping("/")
public List<EtatIRVo> findAll(){
return etatIRConverter.toVo(etatIRService.findAll());
}

 public EtatIRConverter getEtatIRConverter(){
return etatIRConverter;
}
 
 public void setEtatIRConverter(EtatIRConverter etatIRConverter){
this.etatIRConverter=etatIRConverter;
}

 public EtatIRService getEtatIRService(){
return etatIRService;
}
 
 public void setEtatIRService(EtatIRService etatIRService){
this.etatIRService=etatIRService;
}

}