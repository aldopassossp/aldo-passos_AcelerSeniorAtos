package br.atos.crud_zoologico.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.atos.crud_zoologico.model.Cuidador;

@Repository
public interface CuidadorRepository extends CrudRepository<Cuidador, Long>{
	Cuidador findById(long id);
}
