package com.example.myBank.repository;

import com.example.myBank.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @AUTHOR : Dinusha Ariyarathna
 * @DATE : 10/19/2024
 * @PROJECT : myBank
 */
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    void deleteById(Integer id);
}
