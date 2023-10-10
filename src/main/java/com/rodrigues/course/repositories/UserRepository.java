package com.rodrigues.course.repositories;

import com.rodrigues.course.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*@Repository
@Autowired*/
public interface UserRepository extends JpaRepository<User, Long> {

}
