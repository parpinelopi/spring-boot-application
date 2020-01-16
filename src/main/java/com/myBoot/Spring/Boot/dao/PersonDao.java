package com.myBoot.Spring.Boot.dao;

import com.myBoot.Spring.Boot.model.Person;

import java.util.UUID;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person){
        UUID id=UUID.randomUUID();
        return insertPerson(id, person);
    }
}
