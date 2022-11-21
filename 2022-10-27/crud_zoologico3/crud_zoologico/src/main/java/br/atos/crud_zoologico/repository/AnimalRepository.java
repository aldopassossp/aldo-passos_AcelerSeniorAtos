package br.atos.crud_zoologico.repository;

import org.springframework.data.repository.CrudRepository;

import br.atos.crud_zoologico.model.Animal;

public interface AnimalRepository extends CrudRepository<Animal, Long>{
	Animal findById(long id);
}
