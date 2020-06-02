package com.codegym.model;

import net.bytebuddy.implementation.bind.annotation.Empty;
import org.springframework.boot.autoconfigure.web.ResourceProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotEmpty(message = "not null")
    @Size(min = 5, max = 45, message = "must be at least 5 characters and at most 45 characters")
    @Pattern(regexp = "^[\\p{L}\\s]*$", message = "must be a literal character")
    private String firstName;
    @NotEmpty(message = "not null")
    @Size(min = 4, max = 45, message = "must be at least 5 characters and at most 45 characters")
    @Pattern(regexp = "^[\\p{L}\\s]*$", message = "must be a literal character")
    private String lastName;
    @NotNull(message = "not null")
    @Min(value = 18, message = "Must be over 18 years old")
    @Pattern(regexp = "^[0-9]*$", message = "must be a number")
    private String age;
    @NotEmpty(message = "not null")
    @Size(min = 9, max = 11, message = "must be at least 9 numbers and at most 11 numbers")
    @Pattern(regexp = "^[0-9]*$", message = "must be a number")
    private String phoneNumber;
    @NotEmpty(message = "not null")
    @Email(message = "Must be in the correct email format")
    private String email;

    public User() {
    }

    public User(Integer id, String firstName, String lastName, String age, String phoneNumber, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
