package com.future.transactionManagement.repository;

import com.future.transactionManagement.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface IUserDal {
    Product save(Product product);
}
