package fr.steve.helloworld.form;

import android.widget.Button;

import fr.steve.helloworld.Entity;

public abstract class Form<T extends Entity> {

    private Button submit;

    public Form() {

    }

    public Button getSubmit() {
        return this.submit;
    }

    public Form<T> setSubmit(Button button) {
        this.submit = button;
        return this;
    }

    public abstract boolean isValid();

    abstract void reset();

    abstract T build();
}
