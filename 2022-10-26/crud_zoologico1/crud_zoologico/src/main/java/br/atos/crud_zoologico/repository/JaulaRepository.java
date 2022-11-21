package br.atos.crud_zoologico.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.atos.crud_zoologico.model.Jaula;

@Repository
public interface JaulaRepository extends CrudRepository<Jaula, Long>{
	Jaula findById(long id);
}
