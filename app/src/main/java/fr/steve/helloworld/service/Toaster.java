package fr.steve.helloworld.service;

import android.widget.Toast;

import androidx.annotation.NonNull;

import fr.steve.helloworld.HelloWorldActivity;

public class Toaster {

    private final HelloWorldActivity helloWorldActivity;
    public Toaster(HelloWorldActivity activity){
        this.helloWorldActivity = activity;
    }

    //ERROR

    //LOGIN
    public Toast ERROR_LOGIN(){
        return Toast.makeText(this.helloWorldActivity, "Une erreur est survenue...", Toast.LENGTH_LONG);
    }


    //SUCCESS

    //LOGIN
    public Toast SUCCESS_LOGIN(){
        return Toast.makeText(this.helloWorldActivity, "Vous êtes connecté !", Toast.LENGTH_SHORT);
    }
}
