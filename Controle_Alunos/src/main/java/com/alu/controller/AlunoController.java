package com.alu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alu.entities.Aluno;
import com.alu.service.AlunoServico;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	private final AlunoServico alunoServico;
	
	@Autowired
	public AlunoController(AlunoServico alunoServico) {
		this.alunoServico = alunoServico;
	}
	@GetMapping("/{id}")
	public Aluno getAluno(@PathVariable Long id) {
		return alunoServico.getAlunoById(id);
	}
	@PostMapping
	private Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoServico.saveAluno(aluno);
	}
	@GetMapping 
	public List<Aluno> gettAllAlunos(){
		return alunoServico.getAllAlunos();
	}
	@DeleteMapping("/{id}")
	public void deleteAluno(@PathVariable Long id) {
		alunoServico.deleteAluno(id);
	}
}
