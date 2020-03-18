package com.zsmart.ir.dao;
import com.zsmart.ir.bean.IR;
import com.zsmart.ir.bean.TauxIR;
import com.zsmart.ir.bean.EtatIR;
import com.zsmart.ir.bean.IREmploye;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface IREmployeDao extends JpaRepository<IREmploye,Long> {


	 public IREmploye findByIr(IR ir);
	 public IREmploye findByTauxIR(TauxIR tauxIR);
	 public IREmploye findByEtatIR(EtatIR etatIR);

	 public int deleteByIr(IR ir);
	 public int deleteByTauxIR(TauxIR tauxIR);
	 public int deleteByEtatIR(EtatIR etatIR);

}
