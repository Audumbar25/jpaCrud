package com.example.acme.jpaCrud.Dao;

import java.util.*;
import com.example.acme.jpaCrud.Entity.Student;

public interface StudentDao {

    Student save(Student studnet);

    Student getStudentByIdDao(int id);

    void getStudentList();

    void update(int id);

    void delete(int id);

    void deleteALll();
}
