package com.javaguides.springbootfirstapp.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.*;
//import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="user")
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="full_name")
    private String full_name;
    @Column(name = "email")
    private String email;
    @Column(name="password")
    private String password;



}
