package com.example.acme.jpaCrud;

import com.example.acme.jpaCrud.Dao.StudentDao;
import com.example.acme.jpaCrud.Entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaCrudApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao stddao){
		return runner->{
			//saveStudent(stddao);
			//getStudentById(stddao);
			getAllStudent(stddao);
			//updateStudent(stddao);
			//deleteStudent(stddao);
			//deleteAll(stddao);

		};
	}

	private void deleteAll(StudentDao stddao) {
		stddao.deleteALll();
	}

	private void deleteStudent(StudentDao stddao) {
		int id=1;
		stddao.delete(id);
	}

	private void updateStudent(StudentDao stddao) {
		//Student std=new Student();
		int id=1;
		stddao.update(id);
	}

	private void getAllStudent(StudentDao stddao) {
		stddao.getStudentList();
	}

	private void getStudentById(StudentDao stddao) {
		int id=2;
		stddao.getStudentByIdDao(id);
	}

	public void saveStudent(StudentDao stddao){
		Student s1=new Student("Audumbar",56000);
		Student s2=new Student("Ritesh",50000);
		Student s3=new Student("Kiran",350000);
		stddao.save(s1);
		stddao.save(s2);
		stddao.save(s3);
		System.out.println("Ended....");

	}

}
