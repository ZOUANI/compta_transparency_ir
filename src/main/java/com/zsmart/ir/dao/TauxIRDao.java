package com.zsmart.ir.dao;
import com.zsmart.ir.bean.TauxIR;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
 public interface TauxIRDao extends JpaRepository<TauxIR,Long> {




}
