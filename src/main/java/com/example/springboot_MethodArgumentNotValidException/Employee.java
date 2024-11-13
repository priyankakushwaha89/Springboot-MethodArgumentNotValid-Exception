package com.example.springboot_MethodArgumentNotValidException;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity(name="employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    int id;

    @Column(name="Name",nullable=false)
    @NotBlank(message="Name cannot be null")
    @Size(min=4,max=30,message="Name should be more than 3")
    String name;

    @Column(name= "Address")
    @NotNull(message="Please enter valid address")
    String address;

    @Column(name= "Age")
    @NotNull(message="Age cannot be empty")
    @Min(value=18 ,message="Age should be 18")
    @Max(value=45, message="Age limit exceed")
    int age;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
