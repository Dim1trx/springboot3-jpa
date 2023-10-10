package com.rodrigues.course.repositories;

import com.rodrigues.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


//nao precisa da annotation Repository pois ao herdar JpaRepository o spring ja reconhece como um componente
public interface UserRepository extends JpaRepository<User, Long> { }
