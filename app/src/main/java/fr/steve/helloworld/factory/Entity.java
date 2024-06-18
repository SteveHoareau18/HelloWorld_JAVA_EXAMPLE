package fr.steve.helloworld.factory;

import fr.steve.helloworld.HelloWorldActivity;

public abstract class Entity {

    private static int nextId = 0;
    private final int id;

    public Entity() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public Repository<? extends Entity> getRepository() {
        return HelloWorldActivity.getEntityManager().getRepository(this.getClass());
    }
}
