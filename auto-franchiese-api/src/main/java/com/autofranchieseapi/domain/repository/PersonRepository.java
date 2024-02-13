package com.autofranchieseapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.autofranchieseapi.domain.model.Insured;

@Repository
public interface PersonRepository extends JpaRepository<Insured, Long>{

}
