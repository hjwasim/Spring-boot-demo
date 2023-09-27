package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;
import org.example.config.MyPersistenceUnit;
import org.example.entity.Product;
import org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl;
import org.hibernate.jpa.boot.internal.PersistenceUnitInfoDescriptor;

import java.util.HashMap;

/**
 * @author Hjwasim
 */
public class Main {
    public static void main(String[] args) {
        PersistenceUnitInfoDescriptor descriptor = new PersistenceUnitInfoDescriptor(new MyPersistenceUnit());
        EntityManagerFactory emf = new EntityManagerFactoryBuilderImpl(descriptor,new HashMap<>()).build();
        try (EntityManager em = emf.createEntityManager()) {
            TypedQuery<Product> productsQuery = em.createQuery("SELECT p from Product p", Product.class);
            var productList = productsQuery.getResultList();
            productList.forEach(System.out::println);
        }
    }
}