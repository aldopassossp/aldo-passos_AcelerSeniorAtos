package br.atos.crud_zoologico.security;

import javax.transaction.Transactional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.atos.crud_zoologico.model.UserModel;
import br.atos.crud_zoologico.repository.UserRepository;

@Service
@Transactional
public class UserDetailServiceImpl implements UserDetailsService{

	final UserRepository userRepository;
	
	public UserDetailServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		
		UserModel userModel = userRepository.findByUserName(username).orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado" + username));
		return new User(userModel.getUsername(),userModel.getPassword(), true, true, true, true, userModel.getAuthorities() );
	}
}
