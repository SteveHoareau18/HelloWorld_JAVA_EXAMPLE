package fr.steve.helloworld.entity.address;

import java.util.ArrayList;
import java.util.List;
import fr.steve.helloworld.Repository;

public class AddressRepository extends Repository<Address> {

    private final List<Address> addressList;

    public AddressRepository(){
        this.addressList = new ArrayList<>();
    }
    @Override
    public List<Address> findAll() {
        return addressList;
    }

    @Override
    public void add(Address address) {
        this.addressList.add(address);
    }
}
