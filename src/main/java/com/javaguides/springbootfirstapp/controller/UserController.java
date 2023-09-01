package com.javaguides.springbootfirstapp.controller;

import com.javaguides.springbootfirstapp.exception.ResourceNotFoundException;
import com.javaguides.springbootfirstapp.model.User;
import com.javaguides.springbootfirstapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.module.ResolutionException;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/users")

public class UserController {
    @Autowired
    private UserRepository userRepository;


    @DeleteMapping("{id}")
        public void deleteCar(@PathVariable long id) {

        User deleteUser = userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("user not exist"+id));
        userRepository.delete(deleteUser);}
@GetMapping
    public List<User> getAllusers() {

        return (List<User>) userRepository.findAll();

    }


/*    @GetMapping
    public void User() {

        System.out.println("it's an user");

    }*/
//add
@PostMapping
public void addUser(@RequestBody User user)
    { userRepository.save(user);}

    //build get employee by id
@GetMapping("{id}")
   public ResponseEntity<User>getUser(@PathVariable Long id){
    User user=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("user not exist"+id));
    return ResponseEntity.ok(user);
   }
   //update
@PutMapping("{id}")
   public ResponseEntity<User> updateEUser(@PathVariable  long id,@RequestBody  User info){
    User updateUser = userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("user not exist"+id));
    updateUser.setFull_name(info.getFull_name());
       updateUser.setEmail(info.getEmail());
       updateUser.setPassword(info.getPassword());
       userRepository.save(updateUser);
       return ResponseEntity.ok(updateUser);

}




}
//RequestBody: convert json into java object

