package com.test.testApp.service;

import com.test.testApp.model.dao.UserRepository;
import com.test.testApp.model.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void mock() {
        User user1 = new User();
        user1.setName("Mehdi");

        User user2 = new User();
        user2.setName("Narj");

        userRepository.save(user1);
        userRepository.save(user2);

        userRepository.findAll().forEach(System.out::println);
    }

}
