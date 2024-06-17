package fr.steve.helloworld;

import java.util.List;

public abstract class Repository<T extends Entity> {

    public abstract List<T> findAll();
    public abstract void add(T entity);
}
