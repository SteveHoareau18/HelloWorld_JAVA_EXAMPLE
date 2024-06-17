package fr.steve.helloworld.service.adapter;

import fr.steve.helloworld.Entity;
import fr.steve.helloworld.HelloWorldActivity;
import fr.steve.helloworld.entity.address.Address;
import fr.steve.helloworld.entity.address.AddressRepository;
import fr.steve.helloworld.entity.person.Person;
import fr.steve.helloworld.entity.person.PersonRepository;
import fr.steve.helloworld.service.EntityManager;

public class AdapterManager {

    private final HelloWorldActivity helloWorldActivity;
    private final EntityManager entityManager;

    public AdapterManager(HelloWorldActivity helloWorldActivity, EntityManager entityManager){
        this.helloWorldActivity = helloWorldActivity;
        this.entityManager = entityManager;
    }

    @SuppressWarnings("unchecked")
    public <T extends Entity> AdapterBundleLayout<?, T> getEntity(Class<T> clazz) {
        if (clazz == Person.class) {
            return (AdapterBundleLayout<?, T>) new AdapterBundleLayout<PersonRepository, Person>(helloWorldActivity)
                    .setLayout(android.R.layout.simple_spinner_item)
                    .setItems(entityManager.getRepository(Person.class));
        } else if (clazz == Address.class) {
            return (AdapterBundleLayout<?, T>) new AdapterBundleLayout<AddressRepository, Address>(helloWorldActivity)
                    .setLayout(android.R.layout.simple_spinner_item)
                    .setItems(entityManager.getRepository(Address.class));
        }
        throw new IllegalArgumentException("Repository for the class " + clazz.getName() + " is not supported.");
    }
}