package fr.steve.helloworld.service.adapter;

import android.widget.ArrayAdapter;
import fr.steve.helloworld.Entity;
import fr.steve.helloworld.HelloWorldActivity;
import fr.steve.helloworld.Repository;

public class AdapterBundleLayout<R extends Repository<T>, T extends Entity> {

    private int layout;
    private R repository;
    private final HelloWorldActivity helloWorldActivity;

    public AdapterBundleLayout(HelloWorldActivity helloWorldActivity){
        this.helloWorldActivity = helloWorldActivity;
    }

    public AdapterBundleLayout<R,T> setLayout(int layout){
        this.layout = layout;
        return this;
    }

    public AdapterBundleLayout<R,T> setItems(R repository){
        this.repository = repository;
        return this;
    }

    public ArrayAdapter<T> build(){
        return new ArrayAdapter<>(helloWorldActivity, layout, this.repository.findAll());
    }
}
