package com.codegym.repository;

import com.codegym.model.Contract;
import com.codegym.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractDetailRepository extends JpaRepository<ContractDetail,Long> {
    Page<ContractDetail> findAllByNumberContaining(String number, Pageable pageable);
}
