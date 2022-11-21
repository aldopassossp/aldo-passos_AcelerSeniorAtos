package br.atos.crud_zoologico.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.atos.crud_zoologico.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, UUID>{

	Optional<UserModel> findByUserName(String userName);
	
}
