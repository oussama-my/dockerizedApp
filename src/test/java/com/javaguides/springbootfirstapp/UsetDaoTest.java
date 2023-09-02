package com.javaguides.springbootfirstapp;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.javaguides.springbootfirstapp.model.User;
import com.javaguides.springbootfirstapp.repository.UserRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class UsetDaoTest
{
    @Autowired
    UserRepository userRepository;


    @Test
    public void User_SaveTest(){

        User user= User.builder()
                .id(1L)
                .email("email@gmail.com")
                .full_name("ikram amine")
                .password("****")
                .build();

        User userSaved= userRepository.save(user);
        Assertions.assertThat(userSaved).isNotNull();
        Assertions.assertThat(userSaved.getId()).isEqualTo(1L);
        Assertions.assertThat(userSaved.getEmail()).isEqualTo("email@gmail.com");

    }
}
