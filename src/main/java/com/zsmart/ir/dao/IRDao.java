package com.zsmart.ir.dao;
import com.zsmart.ir.bean.EtatIR;
import com.zsmart.ir.bean.IR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface IRDao extends JpaRepository<IR,Long> {
	 public IR findByReference(String reference);

	 public int deleteByReference(String reference);

	 public IR findByEtatIR(EtatIR etatIR);

	 public int deleteByEtatIR(EtatIR etatIR);

}
