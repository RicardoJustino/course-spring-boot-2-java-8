package com.udemy.projeto.course.repositories;

import com.udemy.projeto.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
