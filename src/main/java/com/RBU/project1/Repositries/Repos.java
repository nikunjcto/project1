package com.RBU.project1.Repositries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RBU.project1.Models.Students;

@Repository
public interface Repos extends JpaRepository<Students, Long>{

}
