package fr.steve.helloworld.form;

import android.widget.Button;

public abstract class Form {

    private Button submit;

    public Form(){

    }

    public Form setSubmit(Button button){
        this.submit = button;
        return this;
    }

    public Button getSubmit(){
        return this.submit;
    }

    public abstract boolean isValid();

    abstract void reset();
}
