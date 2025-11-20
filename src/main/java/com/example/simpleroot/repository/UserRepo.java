package com.example.simpleroot.repository;

import com.example.simpleroot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User,Integer> {

    @Query(value = "SELECT * FROM user WHERE Id = ?1", nativeQuery = true)
    User getUserByUserId(String userId);

    @Query(value = "SELECT * FROM user WHERE Id = ?1 AND Address = ?2", nativeQuery = true)
    User getUserByUserIdAndAddress(String userId,String address);

//    Update 1k nam @Modifying kiyana annotation 1 add karanna one.

}
