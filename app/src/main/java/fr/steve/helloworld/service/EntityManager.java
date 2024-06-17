package fr.steve.helloworld.service;

import fr.steve.helloworld.entity.address.Address;
import fr.steve.helloworld.entity.address.AddressRepository;
import fr.steve.helloworld.Entity;
import fr.steve.helloworld.Repository;
import fr.steve.helloworld.entity.person.Person;
import fr.steve.helloworld.entity.person.PersonRepository;

public class EntityManager {

    private final PersonRepository personRepository;
    private final AddressRepository addressRepository;

    public EntityManager(){
        this.personRepository = new PersonRepository();
        this.addressRepository = new AddressRepository();
    }

    @SuppressWarnings("unchecked")
    public <T extends Entity, R extends Repository<T>> R getRepository(Class<T> clazz) {
        if (clazz == Person.class) {
            return (R) personRepository;
        }else if(clazz == Address.class){
            return (R) addressRepository;
        }
        throw new IllegalArgumentException("Repository for the class " + clazz.getName() + " is not supported.");
    }
}
