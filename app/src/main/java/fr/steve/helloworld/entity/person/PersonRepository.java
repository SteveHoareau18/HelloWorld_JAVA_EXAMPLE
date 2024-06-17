package fr.steve.helloworld.entity.person;

import java.util.ArrayList;
import java.util.List;
import fr.steve.helloworld.Repository;

public class PersonRepository extends Repository<Person> {

    private final List<Person> persons;

    public PersonRepository(){
        this.persons = new ArrayList<>();
    }

    public List<Person> findAll(){
        return this.persons;
    }

    @Override
    public void add(Person person){
        this.persons.add(person);
    }
}
