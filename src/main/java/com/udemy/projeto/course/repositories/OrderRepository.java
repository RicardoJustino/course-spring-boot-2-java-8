package com.udemy.projeto.course.repositories;

import com.udemy.projeto.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
