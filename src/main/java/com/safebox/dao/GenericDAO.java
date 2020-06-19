package com.safebox.dao;

import java.util.List;

public interface GenericDAO<T,ID> {

    public boolean  create(T entity);
    public T read(ID id);
    public boolean  update(T entity);
    public boolean  delete(T entity);
    public List<T> findAll();

}
