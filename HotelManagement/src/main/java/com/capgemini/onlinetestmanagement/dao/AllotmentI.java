package com.capgemini.onlinetestmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetestmanagement.pojo.Allotment;

@Repository
public interface AllotmentI extends JpaRepository<Allotment, Long> {

}
