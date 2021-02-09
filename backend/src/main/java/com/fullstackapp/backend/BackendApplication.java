package com.fullstackapp.backend;

import com.fullstackapp.backend.model.User;
import com.fullstackapp.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendApplication implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        this.userRepository.save(new User("John", "Scott","scott157", "js@gmail.com"));
        this.userRepository.save(new User("Thomas", "Winter","ThomasW", "tw@gmail.com"));
    }
}
