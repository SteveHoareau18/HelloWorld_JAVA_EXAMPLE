package fr.steve.helloworld;

import java.util.List;
import java.util.Optional;

public abstract class Repository<T extends Entity> {

    private final List<T> list;

    protected Repository(List<T> list) {
        this.list = list;
    }

    public List<T> findAll(){
        return this.list;
    }

    public void add(T entity) {
        this.list.add(entity);
    }

    public void remove(T entity) {
        Optional<T> find = this.list.stream()
                .filter(x -> x.getId() == entity.getId())
                .findFirst();

        find.ifPresent(list::remove);
    }
}
