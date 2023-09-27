package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import org.example.entity.Product;

/**
 * @author Hjwasim
 */
public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        EntityManager em = null;
        try {
            em = emf.createEntityManager();
            TypedQuery<Product> productsQuery = em.createQuery("SELECT p from Product p", Product.class);
            var productList = productsQuery.getResultList();
            productList.forEach(System.out::println);
        } finally {
            if(em != null) em.close();
        }
    }
}
