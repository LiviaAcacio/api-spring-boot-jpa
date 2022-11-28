package com.livia.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livia.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
