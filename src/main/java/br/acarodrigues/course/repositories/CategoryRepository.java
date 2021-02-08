package br.acarodrigues.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import br.acarodrigues.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	

}
