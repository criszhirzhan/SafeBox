package com.safebox.dao;

import com.safebox.jpa.JPADAOFactory;

public abstract class DAOFactory {
    protected static DAOFactory factory = new JPADAOFactory();

    public static DAOFactory getDAOFactory() {
        return factory;
    }

}
