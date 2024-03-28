package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entities.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long>{

}