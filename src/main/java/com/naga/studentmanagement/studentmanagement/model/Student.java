package com.naga.studentmanagement.studentmanagement.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;

@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank(message = "name is mandatory")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "dob is mandatory")
    @Column(name = "dob")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Temporal(TemporalType.DATE)
    private Date dob;

    @NotBlank(message = "age is mandatory")
    @Column(name = "age")
    private long age;

    @NotBlank(message = "bloodGroup is mandatory")
    @Column(name = "bloodGroup")
    private String bloodGroup;

    @NotBlank(message = "course is mandatory")
    @Column(name = "course")
    private String course;

    @NotBlank(message = "city is mandatory")
    @Column(name = "city")
    private String city;

    @NotBlank(message = "Email is mandatory")
    @Column(name = "email")
    private String email;

    @Column(name = "phone_no")
    private long phoneNo;

    public Student() {
    }

    public Student(long id, String name, Date dob, long age, String bloodGroup, String course, String city, String email, long phoneNo) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.course = course;
        this.city = city;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(long phoneNo) {
        this.phoneNo = phoneNo;
    }
}