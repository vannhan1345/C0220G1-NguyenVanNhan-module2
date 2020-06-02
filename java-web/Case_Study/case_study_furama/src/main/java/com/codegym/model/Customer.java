package com.codegym.model;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    //    @Pattern(regexp = "^\\d{1,2}[/]\\d{1,2}[/]\\d{4}$",message = "must be in the correct format DD / MM / YYYY")
    private String birthDay;
    @Pattern(regexp = "[0-9]{9,12}$", message = "ID card number must be in the format XXXXXXXXX or XXXXXXXXXXXX (X is the number 0-9)")
    private String idCard;
    @Pattern(regexp = "^(090|091|(\\(84\\)\\+90)|(\\(84\\)\\+91))+[0-9]{7}$", message = "Phone numbers must be in the format " +
            "090xxxxxxx or 091xxxxxxx or (84) + 90xxxxxxx or (84) + 91xxxxxxx")
    private String numberPhone;
    private String email;
    private String address;

    @ManyToOne
    private TypeCustomer typeCustomer;
    @OneToMany
    private List<Contract> contractList;

    public List<Contract> getContractList() {
        return contractList;
    }

    public void setContractList(List<Contract> contractList) {
        this.contractList = contractList;
    }

    public TypeCustomer getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(TypeCustomer typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public Customer() {
    }

    public Customer(Long id, String name, String birthDay, String idCard, String numberPhone, String email, String address) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
        this.idCard = idCard;
        this.numberPhone = numberPhone;
        this.email = email;
        this.address = address;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
