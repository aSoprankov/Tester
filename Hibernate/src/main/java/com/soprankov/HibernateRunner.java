package com.soprankov;

import com.soprankov.entity.Student;
import org.hibernate.Session;

public class HibernateRunner {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Student student1 = new Student(1, "Kirill", 1);
        Student student2 = new Student(2, "Stepan", 2);

        session.getTransaction();

        session.save(student1);
        session.save(student2);

        session.getTransaction().commit();

    }
}
