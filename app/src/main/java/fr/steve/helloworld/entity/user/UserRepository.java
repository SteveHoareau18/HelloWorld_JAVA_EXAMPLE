package fr.steve.helloworld.entity.user;

import java.util.ArrayList;

import fr.steve.helloworld.factory.Repository;

public class UserRepository extends Repository<User> {

    public UserRepository() {
        super(new ArrayList<>());
    }

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }
}
