package br.acarodrigues.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.acarodrigues.course.entities.Category;
import br.acarodrigues.course.repositories.CategoryRepository;

@Service //registra a classe como Componente do tipo Serviço do Spring
public class CategoryService {
	
	@Autowired //Injeção automática de dependência pelo Spring
	private CategoryRepository repository; //dependência para CategoryRepository
	
	//Retorna todos os usuários do Banco de Dados
	public List<Category> findAll() {		
		return repository.findAll();		
	}
	
	//Retorna os usuários do Banco de Dados por id
		public Category findById(Long id) {		
			Optional<Category> obj = repository.findById(id);
			return obj.get();		
		}
	
}
