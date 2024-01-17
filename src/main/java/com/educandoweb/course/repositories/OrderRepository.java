package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.educandoweb.course.entities.Order;

// Componente de Repositório
@Repository
// Essa extensão fornece vários métodos prontos do CRUD
public interface OrderRepository extends JpaRepository<Order, Long> {

}
