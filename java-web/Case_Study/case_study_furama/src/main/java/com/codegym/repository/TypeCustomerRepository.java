package com.codegym.repository;

import com.codegym.model.TypeCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeCustomerRepository extends JpaRepository<TypeCustomer,Long> {
}
