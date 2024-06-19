package fr.steve.helloworld.entity.user;

import fr.steve.helloworld.factory.Entity;

public class User extends Entity {

    private String identifier, password;

    public User() {
    }

    public String getIdentifier() {
        return identifier;
    }

    public User setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }
}
