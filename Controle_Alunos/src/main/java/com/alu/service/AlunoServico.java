package com.alu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alu.entities.Aluno;
import com.alu.repository.AlunoRepository;

@Service
public class AlunoServico {
	private final AlunoRepository alunoRepository;
	
	@Autowired 
	public AlunoServico(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public Aluno getAlunoById(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}
	public List<Aluno> getAllAlunos(){
		return alunoRepository.findAll();
	}
	public void deleteAluno(Long id) {
		alunoRepository.deleteById(id);
	}
}
