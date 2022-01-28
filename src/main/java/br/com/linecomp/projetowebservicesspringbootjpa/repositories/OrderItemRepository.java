package br.com.linecomp.projetowebservicesspringbootjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.linecomp.projetowebservicesspringbootjpa.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
