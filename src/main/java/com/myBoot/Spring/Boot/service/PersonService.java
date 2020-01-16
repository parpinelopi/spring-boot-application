package com.myBoot.Spring.Boot.service;

import com.myBoot.Spring.Boot.dao.PersonDao;
import com.myBoot.Spring.Boot.model.Person;

public class PersonService {
    private final PersonDao personDao;

    public PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    public int addPerson(Person person) {
        return personDao.insertPerson(person);
    }

}
