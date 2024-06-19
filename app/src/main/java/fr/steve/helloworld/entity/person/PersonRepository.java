package fr.steve.helloworld.entity.person;

import java.util.ArrayList;

import fr.steve.helloworld.factory.Repository;

public class PersonRepository extends Repository<Person> {

    public PersonRepository() {
        super(new ArrayList<>());
    }

    @Override
    public void add(Person entity) {
        super.add(entity);
    }

    @Override
    protected Class<Person> getEntityClass() {
        return Person.class;
    }
}
