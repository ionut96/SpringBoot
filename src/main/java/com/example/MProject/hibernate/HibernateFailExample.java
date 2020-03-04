package com.example.MProject.hibernate;

import com.example.MProject.domainModel.JpaBook;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.BootstrapServiceRegistry;
import org.hibernate.boot.registry.BootstrapServiceRegistryBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.service.ServiceRegistry;

public class HibernateFailExample {

    public static void main(String[] args) {
//        // HibernateFailExample specific configuration class
//        //StandardServiceRegistryBuilder standardRegistry = new StandardServiceRegistryBuilder();
//        StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder().configure().build();
//
//        // Here we tell HibernateFailExample that we annotated our User class
//        MetadataSources sources = new MetadataSources(standardRegistry);
//        sources.addAnnotatedClass( JpaBook.class );
//        Metadata metadata = sources.buildMetadata();
//
//        SessionFactory sessionFactory = metadata.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        JpaBook book = new JpaBook();
//        book.setName("HibernateFailExample");
//        book.setAuthor("First Save");
//        //insert
//        session.save(book);

//        StandardServiceRegistryBuilder standardServiceRegistry =
//                new StandardServiceRegistryBuilder();

        BootstrapServiceRegistry bootstrapServiceRegistry =
                new BootstrapServiceRegistryBuilder().build();
        StandardServiceRegistryBuilder standardServiceRegistryBuilder =
                new StandardServiceRegistryBuilder(bootstrapServiceRegistry);
        StandardServiceRegistry standardServiceRegistry = standardServiceRegistryBuilder
                .configure()
                .build();
        MetadataSources metadataSources = new MetadataSources(standardServiceRegistry);
        metadataSources.addAnnotatedClass(JpaBook.class);
        metadataSources.addResource("hibernate.cfg.xml");
        Metadata metadata = metadataSources.buildMetadata();
        SessionFactory sessionFactory = metadata.buildSessionFactory();
        Session session = sessionFactory.openSession();
        JpaBook book = new JpaBook();
        book.setName("HibernateFailExample");
        book.setAuthor("First Save");
        session.persist(book);
        session.createQuery("FROM Books").list();

    }
}
