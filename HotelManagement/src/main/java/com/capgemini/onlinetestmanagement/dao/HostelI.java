package com.capgemini.onlinetestmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetestmanagement.pojo.Hostel;

@Repository
public interface HostelI extends JpaRepository<Hostel, Long> {

}
