package com.javaguides.springbootfirstapp;
import org.springframework.boot.CommandLineRunner;

import com.javaguides.springbootfirstapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan("com.javaguides.springbootfirstapp")

public class SpringbootBackendApplication implements CommandLineRunner{

	public static void main(String[] args) {

		SpringApplication.run(SpringbootBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	}

	//@Autowired
	//private EmployeeRepository employeeRepository;

			//	@Override
				//public void run(String... args) throws Exception {
					//Employee employee = new Employee();
					//employee.setFirstName("Ramesh");
					//employee.setLastName("Fadatare");
					//employee.setEmailId("ramesh@gmail.com");
					//employeeRepository.save(employee);

					//Employee employee1 = new Employee();
					//employee1.setFirstName("John");
					//employee1.setLastName("Cena");
					//employee1.setEmailId("cena@gmail.com");

				//	employeeRepository.save(employee1);
				//}
}