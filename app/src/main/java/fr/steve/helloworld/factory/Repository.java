package fr.steve.helloworld.factory;

import android.widget.ArrayAdapter;

import java.util.List;
import java.util.Optional;

public abstract class Repository<T extends Entity> {

    private final List<T> list;
    private ArrayAdapter<T> adapter;

    protected Repository(List<T> list) {
        this.list = list;
    }

    public List<T> findAll() {
        return this.list;
    }

    public void add(T entity) {
        this.list.add(entity);
        if (this.adapter != null) this.adapter.notifyDataSetChanged();
    }

    public void remove(T entity) {
        Optional<T> find = this.list.stream()
                .filter(x -> x.getId() == entity.getId())
                .findFirst();

        find.ifPresent(list::remove);
        if (this.adapter != null) this.adapter.notifyDataSetChanged();
    }

    public void setAdapter(ArrayAdapter<T> adapter) {
        this.adapter = adapter;
    }
}
