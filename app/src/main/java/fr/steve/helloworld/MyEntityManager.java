package fr.steve.helloworld;

import java.util.Optional;

import fr.steve.helloworld.entity.user.User;
import fr.steve.helloworld.entity.user.UserRepository;
import fr.steve.helloworld.factory.Entity;
import fr.steve.helloworld.factory.Repository;
import fr.steve.helloworld.service.EntityManager;

public class MyEntityManager extends EntityManager {

    private final UserRepository userRepository;

    public MyEntityManager() {
        userRepository = new UserRepository();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends Entity, R extends Repository<T>> Optional<R> getRepository(Class<T> clazz) {
        if (!super.getRepository(clazz).isPresent()) {
            if (clazz == User.class) {
                return Optional.of((R) userRepository);
            }
        }
        return Optional.empty();
    }
}
