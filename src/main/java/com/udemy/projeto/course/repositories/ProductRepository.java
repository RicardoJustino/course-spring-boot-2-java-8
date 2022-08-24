package com.udemy.projeto.course.repositories;

import com.udemy.projeto.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
