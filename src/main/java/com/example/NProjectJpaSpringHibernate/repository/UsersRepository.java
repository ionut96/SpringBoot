package com.example.NProjectJpaSpringHibernate.repository;

import com.example.NProjectJpaSpringHibernate.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {

}
