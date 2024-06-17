package fr.steve.helloworld.entity.person;

import androidx.annotation.NonNull;

import fr.steve.helloworld.Entity;

public class Person extends Entity {

    private String name, firstName, phone;

    public Person() {

    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Person setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @NonNull
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
