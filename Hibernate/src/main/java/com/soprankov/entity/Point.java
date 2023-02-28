package com.soprankov.entity;

import javax.persistence.*;

@Entity
public class Point {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "POINT_ID")
    private int id;

    @Column(name = "STUDENT_ID")
    private int student_id;

    @Column(name = "SUBJECT_ID")
    private int subject_id;

    @Column(name = "POINTS")
    private int point;

    public Point() {

    }

    public Point(int id, int student_id, int subject_id, int point) {
        this.id = id;
        this.student_id = student_id;
        this.subject_id = subject_id;
        this.point = point;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Points{" +
                "id=" + id +
                ", student_id=" + student_id +
                ", subject_id=" + subject_id +
                ", point=" + point +
                '}';
    }
}
