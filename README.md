```markdown
# 🧑‍🎓 JPA CRUD - Student Management App using Spring Boot

This is a **simple beginner-friendly Java Spring Boot app** that performs **CRUD operations** on a `Student` table using **JPA (Hibernate)** and `EntityManager`.

No need to worry about advanced stuff like Spring Data JPA repositories – this project focuses on **core JPA logic** to help you understand how things work under the hood! 💡

---

## 📸 Preview (Add these as screenshots)

1. ✅ Save student  
2. 🔍 Get student by ID  
3. 📋 View all students  
4. ✏️ Update student  
5. ❌ Delete one or all students  


![Screenshot (329)](https://github.com/user-attachments/assets/4f1591d9-0e19-44d4-b3fa-c5aa06598123)
![Screenshot (330)](https://github.com/user-attachments/assets/14e989e8-3e99-469e-80f6-eb1cc6927d10)
![Screenshot (331)](https://github.com/user-attachments/assets/9d37fff9-add4-4667-9407-68f3c4da34fc)
![Screenshot (332)](https://github.com/user-attachments/assets/11064d8f-4880-4a55-b579-756042b71839)
![Screenshot (333)](https://github.com/user-attachments/assets/0cbf3725-0116-43e2-b0e4-b63a94967c24)
![Screenshot (335)](https://github.com/user-attachments/assets/d16ee75e-2976-43a0-a863-79e7c3222f22)




---

## 🛠️ Technologies Used

- Java 17+
- Spring Boot
- JPA (Hibernate)
- MySQL
- Maven

---

## 📂 Project Structure

```bash
src/
└── main/
    ├── java/
    │   └── com.example.acme.jpaCrud/
    │       ├── Entity/
    │       │   └── Student.java         # Your entity class
    │       ├── Dao/
    │       │   ├── StudentDao.java      # Interface
    │       │   └── StudentDaoImpl.java  # Implementation using EntityManager
    │       └── JpaCrudApplication.java  # Main Spring Boot class with CLI runner
```

---

## 🚀 Getting Started

### 1️⃣ Clone this repo

```bash
git clone https://github.com/Audumbar25/jpaCrud.git
cd jpaCrud
```

### 2️⃣ Configure MySQL (or use H2)

In `application.properties`, set your DB credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/student_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

### 3️⃣ Run the application

Use IntelliJ, Eclipse, or run from terminal:

```bash
./mvnw spring-boot:run
```

You’ll see logs like:
```
student saved:: Student{id=1, name='Audumbar', salary=56000}
```

---

## 📌 Features Demonstrated

| Feature          | Method in Code                 |
|------------------|-------------------------------|
| Add Student      | `saveStudent()`               |
| Get Student by ID| `getStudentById()`            |
| List All         | `getAllStudent()`             |
| Update           | `updateStudent()`             |
| Delete One       | `deleteStudent()`             |
| Delete All       | `deleteAll()`                 |

All operations are triggered from `CommandLineRunner` for easy understanding 💻

---

## 🤔 Why No Repository Interface?

Because this app is designed to help **absolute beginners**:
- See how JPA works with `EntityManager`
- Understand `@Entity`, `@Id`, `@Transactional`, etc.
- Build CRUD step-by-step, not magically behind `JpaRepository`

---

## ❤️ Like it?

If this helped you, feel free to ⭐ star this repo and share it with friends!

---

## 🧠 Want to Contribute?

You’re welcome to add:
- Exception handling
- REST API layer (using `@RestController`)
- Unit Tests

---

## 📬 Connect With Me

- LinkedIn: https://www.linkedin.com/in/audumbar-tanangi-b46aa7241/
- GitHub: https://github.com/Audumbar25

---

> “Learning by doing is the best way. One CRUD project at a time!” 🚀

```

