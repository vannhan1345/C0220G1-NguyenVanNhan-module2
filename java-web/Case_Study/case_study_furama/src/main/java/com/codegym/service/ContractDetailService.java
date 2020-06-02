package com.codegym.service;

import com.codegym.model.ContractDetail;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ContractDetailService {
    Page<ContractDetail> findAll(Pageable pageable);

    Page<ContractDetail> findAllByNumberContaining(String number, Pageable pageable);

    List<ContractDetail> findAll();

    ContractDetail findById(Long id);

    void save(ContractDetail contractDetail);

    void remove(Long id);
}
