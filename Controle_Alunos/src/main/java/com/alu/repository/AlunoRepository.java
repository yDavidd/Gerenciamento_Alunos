package com.alu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alu.entities.Aluno;

public interface AlunoRepository extends JpaRepository <Aluno, Long> {

}
