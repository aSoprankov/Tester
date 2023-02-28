package com.soprankov.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table( name = "STUDENT" )
public class Student {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    @Column( name = "STUDENT_ID" )
    private int id;

    @Column( name = "STUDENT_NAME" )
    private String name;

    @Column( name = "GROUP_ID" )
    private int groupId;

    @Column( name = "JOINED_DATE" )
    @Temporal(TemporalType.DATE)
    private Date joionedDate;

    public Student() {

    }

    public Student(int id, String name, int groupId) {
        this.id = id;
        this.name = name;
        this.groupId = groupId;
        this.joionedDate = new Date();
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

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public Date getJoionedDate() {
        return joionedDate;
    }

    public void setJoionedDate(Date joionedDate) {
        this.joionedDate = joionedDate;
    }

    @Override
    public String toString() {
        return "Students{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", group_id=" + groupId +
                ", JOINED_date='" + joionedDate + '\'' +
                '}';
    }
}
