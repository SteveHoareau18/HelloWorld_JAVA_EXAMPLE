package fr.steve.helloworld.entity.address;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import fr.steve.helloworld.Repository;

public class AddressRepository extends Repository<Address> {

    public AddressRepository() {
        super(new ArrayList<>());
    }
}
