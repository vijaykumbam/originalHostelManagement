package com.capgemini.onlinetestmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetestmanagement.pojo.Role;

@Repository
public interface RolesI extends JpaRepository<Role, Long> {

}
