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
import com.zsmart.ir.service.facade.TauxIRService;
import com.zsmart.ir.bean.TauxIR;
import com.zsmart.ir.ws.rest.vo.TauxIRVo;
import com.zsmart.ir.ws.rest.converter.TauxIRConverter;
import com.zsmart.ir.service.util.* ;
@RestController
@RequestMapping("/ir/TauxIR")
@CrossOrigin(origins = {"http://localhost:4200"})
public class TauxIRRest {

 @Autowired 
 private TauxIRService tauxIRService;

 @Autowired 
private TauxIRConverter tauxIRConverter ;

@PostMapping("/")
public TauxIRVo save(@RequestBody TauxIRVo tauxIRVo){
TauxIR tauxIR= tauxIRConverter.toItem(tauxIRVo);
return tauxIRConverter.toVo(tauxIRService.save(tauxIR));
}
@DeleteMapping("/{id}")
public void deleteById(@PathVariable Long id){
tauxIRService.deleteById(id);
}
@GetMapping("/")
public List<TauxIRVo> findAll(){
return tauxIRConverter.toVo(tauxIRService.findAll());
}

 public TauxIRConverter getTauxIRConverter(){
return tauxIRConverter;
}
 
 public void setTauxIRConverter(TauxIRConverter tauxIRConverter){
this.tauxIRConverter=tauxIRConverter;
}

 public TauxIRService getTauxIRService(){
return tauxIRService;
}
 
 public void setTauxIRService(TauxIRService tauxIRService){
this.tauxIRService=tauxIRService;
}

}