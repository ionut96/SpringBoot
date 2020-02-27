package com.example.MProject.bookApplication;

import com.example.MProject.config.JpaEntityManagerFactory;
import com.example.MProject.domainModel.JpaBook;
import org.springframework.orm.jpa.EntityManagerHolder;

import javax.persistence.EntityManager;

public class JpaBookApplication {


    private static class EntityManagerHolder {
        private static EntityManager ENTITY_MANAGER
                = new JpaEntityManagerFactory(new Class[]{JpaBook.class}).getEntityManager();
    }

    private static EntityManager getJpaEntityManager() {
        return EntityManagerHolder.ENTITY_MANAGER;
    }

    public static void main(String[] args) {
        //CRUD operations
        EntityManager entityManager = getJpaEntityManager();


        //CREATE
        entityManager.getTransaction().begin();
        entityManager.persist(new JpaBook("Carte2","Rembrand"));
        entityManager.getTransaction().commit();


        //READ
        JpaBook jpaBook = entityManager.find(JpaBook.class, 2);
        System.out.println("Create and read:        " + jpaBook);





//        //UPDATE
//        entityManager.getTransaction().begin();
//        jpaBook.setAuthor("Rename Test3");
//        jpaBook.setName("Rename Test3");
//        entityManager.merge(jpaBook);
//        entityManager.getTransaction().commit();
//
//        JpaBook jpaBook2 = entityManager.find(JpaBook.class, 2);
//        System.out.println("Update and read:        " + jpaBook2);
//
//        //DELETE
//        entityManager.getTransaction().begin();
//        entityManager.remove(jpaBook2);
//        entityManager.getTransaction().commit();
//
//        jpaBook2 = entityManager.find(JpaBook.class, 2);
//        System.out.println("Delete and read:        " + jpaBook2);
    }
}
