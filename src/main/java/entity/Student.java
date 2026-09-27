package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private int Roll_Number;
    private String name;
    private int age;
    private String department;
    private int year;
    private int Phone_Number;
    private String email;
    private String address;
}