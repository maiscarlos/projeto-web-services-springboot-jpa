package br.com.linecomp.projetowebservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.linecomp.projetowebservicesspringbootjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
