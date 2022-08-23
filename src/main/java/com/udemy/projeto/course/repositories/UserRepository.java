package com.udemy.projeto.course.repositories;

import com.udemy.projeto.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
