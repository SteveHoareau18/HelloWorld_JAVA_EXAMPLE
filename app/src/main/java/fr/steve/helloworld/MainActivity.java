package fr.steve.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import fr.steve.helloworld.entity.user.User;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginActivity.getEntityManager().getRepository(User.class).flatMap(repo ->
                        repo.findAll().stream().findFirst())
                .ifPresent(user -> ((TextView) findViewById(R.id.tvHello)).setText(user.getIdentifier()));
    }
}