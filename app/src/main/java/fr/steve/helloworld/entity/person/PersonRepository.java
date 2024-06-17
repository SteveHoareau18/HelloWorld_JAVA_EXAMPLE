package fr.steve.helloworld.entity.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.steve.helloworld.Repository;
import fr.steve.helloworld.entity.address.Address;

public class PersonRepository extends Repository<Person> {

    public PersonRepository(){
        super(new ArrayList<>());
    }
}
