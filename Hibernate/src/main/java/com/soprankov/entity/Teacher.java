package com.soprankov.entity;

import javax.persistence.*;

@Entity
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TEACHER_ID")
    private int id;

    @Column(name = "TEACHER_NAME")
    private String name;

    @Column(name = "DEPARTMENT_ID")
    private int department_id;

    public Teacher() {

    }

    public Teacher(int id, String name, int department_id) {
        this.id = id;
        this.name = name;
        this.department_id = department_id;
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

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department_id=" + department_id +
                '}';
    }
}
