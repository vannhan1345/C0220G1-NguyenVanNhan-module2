package com.codegym.model;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String number;



    private String amount;
    @ManyToOne
    private AccompanyingService accompanyingService;
    @ManyToOne
    private Contract contract;

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AccompanyingService getAccompanyingService() {
        return accompanyingService;
    }

    public void setAccompanyingService(AccompanyingService accompanyingService) {
        this.accompanyingService = accompanyingService;
    }

    public ContractDetail() {
    }

    public ContractDetail(Long id,String number, String amount) {
        this.id = id;
        this.number=number;
        this.amount = amount;
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
