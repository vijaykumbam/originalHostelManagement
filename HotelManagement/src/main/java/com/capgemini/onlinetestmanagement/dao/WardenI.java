package com.capgemini.onlinetestmanagement.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.onlinetestmanagement.pojo.Warden;

@Repository
public interface WardenI extends JpaRepository<Warden, Long> {

	Optional<Warden> findByName(String name);
}
