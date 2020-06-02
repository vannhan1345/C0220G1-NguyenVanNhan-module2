package com.codegym.repository;

import com.codegym.model.TypeRent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TypeRentRepository extends JpaRepository<TypeRent,Long> {
}
