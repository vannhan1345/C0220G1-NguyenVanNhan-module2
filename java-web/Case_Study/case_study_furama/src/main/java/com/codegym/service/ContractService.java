package com.codegym.service;

import com.codegym.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractService {
    Page<Contract> findAll(Pageable pageable);

    Page<Contract> findAllByNumberContaining(String number, Pageable pageable);

    List<Contract> findAll();

    Contract findById(Long id);

    void save(Contract contract);

    void remove(Long id);
}
