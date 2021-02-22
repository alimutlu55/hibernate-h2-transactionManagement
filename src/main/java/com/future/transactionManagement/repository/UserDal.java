package com.future.transactionManagement.repository;

import com.future.transactionManagement.models.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(propagation = Propagation.MANDATORY) //Use current transaction,if not exist throw an error.
public class UserDal implements IUserDal {

    private SessionFactory sessionFactory;

    @Autowired
    public UserDal(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Product save(Product product) {
        Session session = this.sessionFactory.getCurrentSession();
        session.save(product);
        return product;
    }
}
