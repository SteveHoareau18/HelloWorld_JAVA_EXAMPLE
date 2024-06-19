package fr.steve.helloworld;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;

import java.util.Map;

import fr.steve.helloworld.entity.user.User;
import fr.steve.helloworld.form.LoginForm;
import fr.steve.helloworld.service.EntityManager;

public class LoginActivity extends Activity {

    private static SharedPreferences sharedPreferences;
    private static EntityManager entityManager;

    public static String getString(String k, String v) {
        return sharedPreferences.getString(k, v);
    }

    public static SharedPreferences.Editor edit() {
        return sharedPreferences.edit();
    }

    public static Map<String, ?> getAll() {
        return sharedPreferences.getAll();
    }

    public static EntityManager getEntityManager() {
        return entityManager;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        sharedPreferences = getSharedPreferences("helloworld", Context.MODE_PRIVATE);
        entityManager = new MyEntityManager();
        LoginForm loginForm = (LoginForm) new LoginForm(findViewById(R.id.inputIdentifier),
                findViewById(R.id.inputPassword))
                .setSubmit(findViewById(R.id.buttonConnect));

        loginForm.getSubmit().setOnClickListener(v -> {
            if (loginForm.isValid()) {
                User user = loginForm.build();
                entityManager.getRepository(User.class).ifPresent(repo -> repo.add(user));
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            } else {
                Log.d("hw_debug", "restart");
            }
        });
    }
}
