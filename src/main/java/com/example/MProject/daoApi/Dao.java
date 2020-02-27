package com.example.MProject.daoApi;

import java.util.List;
import java.util.Optional;

public interface Dao<T>{

    Optional<T> get(int idBook);

    List<T> getAll();

    void save(T b);

    void update(T b, String[] params);

    void delete(T b);
}