package com.zsmart.ir.service.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Date; 
import java.math.BigDecimal; 
import com.zsmart.ir.bean.EtatIR;
public interface EtatIRService {

public EtatIR save(EtatIR etatir); 
public List<EtatIR>  findAll();
public EtatIR findById(Long id);
public int delete(EtatIR etatir);
public void  deleteById(Long id);
public void clone(EtatIR etatir,EtatIR etatirClone);
public EtatIR clone(EtatIR etatir);
public List<EtatIR> clone(List<EtatIR>etatirs);
 public List<EtatIR>  findByCriteria(String libelle,String code,Long idMin,Long idMax);

}
