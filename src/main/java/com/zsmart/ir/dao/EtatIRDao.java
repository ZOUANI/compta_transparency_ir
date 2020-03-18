package com.zsmart.ir.dao;
import com.zsmart.ir.bean.EtatIR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface EtatIRDao extends JpaRepository<EtatIR,Long> {




}
