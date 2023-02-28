package com.soprankov.entity;

import javax.persistence.*;

@Entity

public class Group {
    @Id
    @Column( name = "GROUP_ID" )
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int id;

    @Column( name = "GROUP_NAME" )
    private String group;

    public Group() {

    }

    public Group(int id, String group) {
        this.id = id;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Groups{" +
                "id=" + id +
                ", group='" + group + '\'' +
                '}';
    }
}
