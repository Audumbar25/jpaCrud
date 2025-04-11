package com.example.acme.jpaCrud.Dao;

import com.example.acme.jpaCrud.Entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDaoImpl implements  StudentDao{


    EntityManager em;

    @Autowired
    public StudentDaoImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    @Transactional
    public Student save(Student student) {
        em.persist(student);
        System.out.println("student saved:: "+student);
        return student;
    }

    @Override
    public Student getStudentByIdDao(int id) {
        Student get=em.find(Student.class,id);
        System.out.println("student is: "+get);
        return get;
    }

    @Override
    public void getStudentList() {
        TypedQuery<Student> query=em.createQuery("from Student",Student.class);
        System.out.println(query.getResultList());

    }

    @Override
    @Transactional
    public void update(int id) {
        Student std=em.find(Student.class,id);
        std.setName("Audumbar Tanangi");
        em.persist(std);
        System.out.println(std);
    }

    @Override
    @Transactional
    public void delete(int id) {
        Student std=em.find(Student.class,id);
        em.remove(std);
        System.out.println(std);
    }

    @Override
    @Transactional
    public void deleteALll() {
        int numberOfRowsExecuted=em.createQuery("Delete from Student").executeUpdate();
        System.out.println(numberOfRowsExecuted);
    }
}
