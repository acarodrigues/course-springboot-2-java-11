package br.acarodrigues.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.acarodrigues.course.entities.Order;
import br.acarodrigues.course.repositories.OrderRepository;

@Service //registra a classe como Componente do tipo Serviço do Spring
public class OrderService {
	
	@Autowired //Injeção automática de dependência pelo Spring
	private OrderRepository repository; //dependência para UserRepository
	
	//Retorna todos os usuários do Banco de Dados
	public List<Order> findAll() {		
		return repository.findAll();		
	}
	
	//Retorna os usuários do Banco de Dados por id
		public Order findById(Long id) {		
			Optional<Order> obj = repository.findById(id);
			return obj.get();		
		}
	
}
