package fr.steve.helloworld.form;

import android.widget.EditText;
import android.widget.Spinner;

import fr.steve.helloworld.entity.person.Person;

public class PersonForm extends Form {

    private final EditText name,firstName,phone;
    private Spinner spinner;

    public PersonForm(EditText name, EditText firstName, EditText phone, Spinner spinner){
        this.name = name;
        this.firstName = firstName;
        this.phone = phone;
        this.spinner = spinner;
    }

    public EditText getName() {
        return name;
    }

    public EditText getFirstName() {
        return firstName;
    }

    public EditText getPhone() {
        return phone;
    }

    public Spinner getSpinner(){
        return this.spinner;
    }

    public Person build(){
        Person p = new Person().setName(this.name.getText().toString())
                .setFirstName(this.firstName.getText().toString())
                .setPhone(this.phone.getText().toString());
        this.reset();
        return p;
    }
    @Override
    public boolean isValid() {
        //TODO
        return true;
    }

    @Override
    void reset() {
        this.name.setText("");
        this.firstName.setText("");
        this.phone.setText("");
    }
}
