package fr.steve.helloworld.entity.address;

import java.util.ArrayList;

import fr.steve.helloworld.factory.Repository;

public class AddressRepository extends Repository<Address> {

    public AddressRepository() {
        super(new ArrayList<>());
    }

    @Override
    protected Class<Address> getEntityClass() {
        return Address.class;
    }
}
