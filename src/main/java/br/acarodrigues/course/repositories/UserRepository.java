package br.acarodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.acarodrigues.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	

}
