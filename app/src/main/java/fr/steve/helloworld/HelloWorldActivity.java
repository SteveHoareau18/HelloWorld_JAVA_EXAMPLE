package fr.steve.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.Nullable;

import fr.steve.helloworld.entity.person.Person;
import fr.steve.helloworld.form.PersonForm;
import fr.steve.helloworld.service.EntityManager;
import fr.steve.helloworld.service.Toaster;
import fr.steve.helloworld.service.adapter.AdapterManager;

public class HelloWorldActivity extends Activity {

    private static EntityManager entityManager;

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hw);
        Toaster toaster = new Toaster(this);
        entityManager = new MyEntityManager();
        AdapterManager adapterManager = new MyAdapterManager(this, entityManager);

        PersonForm loginForm = (PersonForm) new PersonForm(this.findViewById(R.id.inputName),
                this.findViewById(R.id.inputFirstName),
                this.findViewById(R.id.inputPhone),
                this.findViewById(R.id.spinner))
                .setSubmit(this.findViewById(R.id.btnSubmit));
        ArrayAdapter<Person> adapter = adapterManager.getEntity(Person.class).get().build();
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        loginForm.setAdapter(adapter);

        loginForm.getSubmit().setOnClickListener(v -> {
            if (loginForm.isValid()) {
                Person person = loginForm.build();
                entityManager.getRepository(Person.class).ifPresent(repo -> repo.add(person));
                entityManager.getRepository(Person.class).ifPresent(repo ->
                        Toast.makeText(this, person.getFirstName() + " a été ajouté dans la liste, il y a " +
                                repo.findAll().size() + " personnes dans la liste", Toast.LENGTH_SHORT).show());
            } else {
                toaster.ERROR_LOGIN().show();
            }
        });

        Log.d("hw_debug", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("hw_debug", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("hw_debug", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("hw_debug", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("hw_debug", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("hw_debug", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("hw_debug", "onRestart");
    }
}
