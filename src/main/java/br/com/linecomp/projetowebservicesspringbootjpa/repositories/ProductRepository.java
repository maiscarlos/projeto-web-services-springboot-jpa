package br.com.linecomp.projetowebservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.linecomp.projetowebservicesspringbootjpa.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
