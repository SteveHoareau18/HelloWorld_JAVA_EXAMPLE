package fr.steve.helloworld;

import android.app.Activity;

import java.util.Optional;

import fr.steve.helloworld.entity.user.User;
import fr.steve.helloworld.entity.user.UserRepository;
import fr.steve.helloworld.factory.Entity;
import fr.steve.helloworld.service.EntityManager;
import fr.steve.helloworld.service.adapter.AdapterBundleLayout;
import fr.steve.helloworld.service.adapter.AdapterManager;

public class MyAdapterManager extends AdapterManager {

    public MyAdapterManager(Activity activity, EntityManager entityManager) {
        super(activity, entityManager);
    }

    @SuppressWarnings("unchecked")
    public <T extends Entity> Optional<AdapterBundleLayout<?, T>> getEntity(Class<T> clazz) {
        if (clazz == User.class) {
            return Optional.of((AdapterBundleLayout<?, T>) new AdapterBundleLayout<UserRepository, User>(getActivity())
                    .setLayout(android.R.layout.simple_spinner_item)
                    .setItems((UserRepository) getEntityManager().getRepository(User.class).get()));
        }
        return Optional.empty();
    }
}
