package br.com.linecomp.projetowebservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.linecomp.projetowebservicesspringbootjpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
