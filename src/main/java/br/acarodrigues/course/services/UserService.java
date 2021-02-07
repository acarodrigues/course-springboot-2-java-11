package br.acarodrigues.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.acarodrigues.course.entities.User;
import br.acarodrigues.course.repositories.UserRepository;

@Service //registra a classe como Componente do tipo Serviço do Spring
public class UserService {
	
	@Autowired //Injeção automática de dependência pelo Spring
	private UserRepository repository; //dependência para UserRepository
	
	//Retorna todos os usuários do Banco de Dados
	public List<User> findAll() {		
		return repository.findAll();		
	}
	
	//Retorna os usuários do Banco de Dados por id
		public User findById(Long id) {		
			Optional<User> obj = repository.findById(id);
			return obj.get();		
		}
	
}
