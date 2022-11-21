package br.atos.apicadastropessoa.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atos.apicadastropessoa.model.Pessoa;
import br.atos.apicadastropessoa.repository.PessoaRepository;

@RestController
@RequestMapping("/api/pessoa")
@CrossOrigin
public class PessoaController {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoas")
	public List<Pessoa> listarPessoas(){
		
		List<Pessoa> pessoas = pessoaRepository.findAll();
		return pessoas;
	}
	
	@PostMapping("/cadastrar")
	public void cadastrarPessoa(@RequestBody Pessoa pessoa){
		
		pessoaRepository.save(pessoa);
	}
	
	@GetMapping(value = "/listarId/{id}")
	public Pessoa buscarPessoa(long id){
		
		Pessoa pessoa = pessoaRepository.findById(id);
		return pessoa;
	}
	
	@DeleteMapping(value = "/excluir/{id}")
	public void deletarPessoa(@PathVariable long id){
		
		pessoaRepository.deleteById(id);
	}
	
	@PutMapping(value = "/alterar")
	public void alterarPessoa(@RequestBody Pessoa pessoa){
		
		pessoaRepository.save(pessoa);
	}

}
