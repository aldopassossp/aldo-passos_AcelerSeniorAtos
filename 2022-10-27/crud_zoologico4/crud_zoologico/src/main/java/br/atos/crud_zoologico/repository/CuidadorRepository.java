package br.atos.crud_zoologico.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.atos.crud_zoologico.model.Cuidador;

@Repository
public interface CuidadorRepository extends CrudRepository<Cuidador, Long>{
	Cuidador findById(long id);
	
	@Query(value = "select id_cuidador from cuidador order by id_cuidador desc limit 1", nativeQuery = true)
	Long findLastId();
}
