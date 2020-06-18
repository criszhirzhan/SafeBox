package com.safebox.jpa;

import com.safebox.dao.GenericDAO;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class JPAGenericDAO <T, ID> implements GenericDAO<T,ID> {
    private Class<T> persistentClass;
    protected EntityManager em;

    public JPAGenericDAO(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
        this.em = Persistence.createEntityManagerFactory("Safebox").createEntityManager();
    }

    @Override
    public boolean create(T entity) {
        return false;
    }

    @Override
    public T read(ID id) {
        return null;
    }

    @Override
    public boolean update(T entity) {
        return false;
    }

    @Override
    public boolean delete(T entity) {
        return false;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
