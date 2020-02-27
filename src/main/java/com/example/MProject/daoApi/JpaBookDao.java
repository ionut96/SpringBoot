package com.example.MProject.daoApi;

import com.example.MProject.domainModel.JpaBook;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;

public class JpaBookDao implements Dao<JpaBook> {

    private EntityManager entityManager;

    public JpaBookDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Optional<JpaBook> get(int idBook) {
        return Optional.ofNullable(entityManager.find(JpaBook.class, idBook));
    }

    @Override
    public List<JpaBook> getAll() {
        Query query = entityManager.createQuery("SELECT b FROM Books b");
        return query.getResultList();
    }

    @Override
    public void save(JpaBook b) {
        executeInsideTransaction(entityManager -> entityManager.persist(b));
    }

    @Override
    public void update(JpaBook b, String[] params) {
        b.setName(Objects.requireNonNull(params[0],"Name cannot be null"));
        b.setAuthor(Objects.requireNonNull(params[1],"Author cannot be null"));
        executeInsideTransaction(entityManager -> entityManager.merge(b));
    }

    @Override
    public void delete(JpaBook b) {
        executeInsideTransaction(entityManager -> entityManager.remove(b));
    }

    private void executeInsideTransaction(Consumer<EntityManager> action) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            action.accept(entityManager);
            transaction.commit();
        } catch (RuntimeException e) {
            transaction.rollback();
            throw e;
        }
    }
}
