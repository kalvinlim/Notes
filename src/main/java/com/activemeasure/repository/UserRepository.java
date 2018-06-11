package com.activemeasure.repository;

import com.activemeasure.domain.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    @Query(value= "SELECT * from Users where email = ?1 AND password = ?2 limit 1", nativeQuery = true)
    User authenticate(String email, String password);
}
