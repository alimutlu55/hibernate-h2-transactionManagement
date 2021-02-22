package com.future.transactionManagement.service;

import com.future.transactionManagement.models.Product;
import com.future.transactionManagement.repository.IUserDal;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ProductService implements IProductManager {

    private IUserDal userDal;
    private SessionFactory sessionFactory;

    @Autowired
    public ProductService(IUserDal userDal, SessionFactory sessionFactory) {
        this.userDal = userDal;
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Product saveProduct(Product product){
        Product savedProduct = userDal.save(product);
        if(6>5 ) throw new RuntimeException("An error is occured.");
        return savedProduct;
    }

 /*  @Override
    public Product saveProduct(Product product){
        Session session = sessionFactory.openSession();
        Product savedProduct = null;
        try {
            session.beginTransaction();
            savedProduct = userDal.save(product);
            if(6>5 ) throw new RuntimeException("An error is occured.");
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            session.getTransaction().rollback();
        }finally {
            session.close();
        }
        return savedProduct;
    }
*/
}
