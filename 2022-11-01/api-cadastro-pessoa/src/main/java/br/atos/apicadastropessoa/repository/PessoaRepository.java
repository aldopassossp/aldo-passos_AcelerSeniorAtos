package br.atos.apicadastropessoa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.atos.apicadastropessoa.model.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Pessoa findById(long id);
}
