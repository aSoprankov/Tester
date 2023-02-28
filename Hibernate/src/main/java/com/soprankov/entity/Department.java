package com.soprankov.entity;

import javax.persistence.*;

@Entity

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DEPARTMENT_ID")
    private int id;

    @Column(name = "DEPARTMENT_NAME")
    private String department;

    @Column(name = "DEPARTMENT_MANAGER")
    private String manager;

    public Department() {

    }

    public Department(int id, String department, String manager) {
        this.id = id;
        this.department = department;
        this.manager = manager;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", department='" + department + '\'' +
                ", manager='" + manager + '\'' +
                '}';
    }
}
