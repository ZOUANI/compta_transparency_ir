package com.zsmart.ir.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.ir.bean.IREmploye;
import com.zsmart.ir.bean.IR; 
import com.zsmart.ir.bean.TauxIR; 
import com.zsmart.ir.bean.EtatIR; 
public interface IREmployeService {

public IREmploye save(IREmploye iremploye); 
public List<IREmploye>  findAll();
public IREmploye findById(Long id);
public int delete(IREmploye iremploye);
public void  deleteById(Long id);
public void clone(IREmploye iremploye,IREmploye iremployeClone);
public IREmploye clone(IREmploye iremploye);
public List<IREmploye> clone(List<IREmploye>iremployes);
 public List<IREmploye>  findByCriteria(String referenceEemploye,Long idMin,Long idMax,BigDecimal salaireMin,BigDecimal salaireMax,BigDecimal primeMin,BigDecimal primeMax,BigDecimal honnoraireMin,BigDecimal honnoraireMax,BigDecimal penaliteMin,BigDecimal penaliteMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal montantTotalMin,BigDecimal montantTotalMax);

}
