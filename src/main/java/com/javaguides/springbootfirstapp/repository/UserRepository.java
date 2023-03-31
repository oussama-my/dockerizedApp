package com.javaguides.springbootfirstapp.repository;

import com.javaguides.springbootfirstapp.model.User;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User,Long> {
    // all crud database methods

    @Override
    <S extends User> S save(S entity);

}