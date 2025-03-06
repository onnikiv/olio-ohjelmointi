package dao;

import java.util.List;

import entity.Currency;
import jakarta.persistence.EntityManager;

public class CurrencyDao {


    public void persist(Currency currency) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.persist(currency);
        em.getTransaction().commit();
    }

    public Currency find(int id) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        Currency currency = em.find(Currency.class, id);
        return currency;
    }

    public List<Currency> findAll() {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        List<Currency> currencies = em.createQuery("select e from Currency e", Currency.class).getResultList();
        return currencies;
    }
    
    public void update(Currency currency) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.merge(currency);
        em.getTransaction().commit();
    }

    public void delete(Currency currency) {
        EntityManager em = datasource.MariaDbJpaConnection.getInstance();
        em.getTransaction().begin();
        em.remove(currency);
        em.getTransaction().commit();
    }
}
