package com.test.testApp.model.dao;

import com.test.testApp.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface UserRepository extends JpaRepository<User, Long> {
}
