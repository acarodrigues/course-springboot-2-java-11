package br.acarodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.acarodrigues.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {
	

}
