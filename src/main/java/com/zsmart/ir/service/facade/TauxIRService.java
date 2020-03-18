package com.zsmart.ir.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.ir.bean.TauxIR;
public interface TauxIRService {

public TauxIR save(TauxIR tauxir); 
public List<TauxIR>  findAll();
public TauxIR findById(Long id);
public int delete(TauxIR tauxir);
public void  deleteById(Long id);
public void clone(TauxIR tauxir,TauxIR tauxirClone);
public TauxIR clone(TauxIR tauxir);
public List<TauxIR> clone(List<TauxIR>tauxirs);
 public List<TauxIR>  findByCriteria(Long idMin,Long idMax,BigDecimal salairMinMin,BigDecimal salairMinMax,BigDecimal salairMaxMin,BigDecimal salairMaxMax,BigDecimal montantMin,BigDecimal montantMax,BigDecimal majorationMin,BigDecimal majorationMax,BigDecimal penaliteMin,BigDecimal penaliteMax,Date dateApplicationDebutMin,Date dateApplicationDebutMax,Date dateApplicationFinMin,Date dateApplicationFinMax);

}
