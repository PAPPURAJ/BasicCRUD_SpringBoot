package com.github.pappuraj.eCoaching.db.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String stdId;
    private String batch;
    private String department;
    private String phone;
    private String presentAddress;
    private String permanentAddress;


    public Student() {
    }

    public Student(int id, String name, String stdId, String batch, String department, String phone, String presentAddress, String permanentAddress) {
        this.id = id;
        this.name = name;
        this.stdId = stdId;
        this.batch = batch;
        this.department = department;
        this.phone = phone;
        this.presentAddress = presentAddress;
        this.permanentAddress = permanentAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStdId() {
        return stdId;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPresentAddress() {
        return presentAddress;
    }

    public void setPresentAddress(String presentAddress) {
        this.presentAddress = presentAddress;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stdId='" + stdId + '\'' +
                ", batch='" + batch + '\'' +
                ", department='" + department + '\'' +
                ", phone='" + phone + '\'' +
                ", presentAddress='" + presentAddress + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                '}';
    }
}
