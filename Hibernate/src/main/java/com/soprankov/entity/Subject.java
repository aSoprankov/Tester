package com.soprankov.entity;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SUBJECT_ID")
    private int id;

    @Column(name = "SUBJECT_NAME")
    private String subject;

    @Column(name = "TEACHER_ID")
    private int teacher_id;

    @Column(name = "SEMESTER")
    private int semester;

    @Column(name = "YEAR")
    private String year;

    public Subject() {

    }

    public Subject(int id, String subject, int teacher_id, int semester, String year) {
        this.id = id;
        this.subject = subject;
        this.teacher_id = teacher_id;
        this.semester = semester;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getTeacher_id() {
        return teacher_id;
    }

    public void setTeacher_id(int teacher_id) {
        this.teacher_id = teacher_id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "id=" + id +
                ", subject='" + subject + '\'' +
                ", teacher_id=" + teacher_id +
                ", semester=" + semester +
                ", year='" + year + '\'' +
                '}';
    }
}