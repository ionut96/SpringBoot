package com.example.LProject.dao;

import com.example.LProject.model.Person;

import java.util.UUID;

public interface PersonDao {

    int insertPerson(UUID id, Person person);
    
}
