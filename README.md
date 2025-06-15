
# 📥 Spring Boot Excel Download API

This project is a simple Spring Boot application that generates an Excel file containing employee data using Apache POI and allows it to be downloaded via a REST API.

---

## ✅ Features

- Generate Excel file (.xlsx) from Java list of employees
- Clean architecture (Model - Service - Controller)
- Download Excel directly from browser or Postman

---

## 🔧 Technologies Used

- Java 17+
- Spring Boot
- Apache POI (Excel)
- Maven

---

## 📦 Dependencies

Add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi</artifactId>
    <version>5.2.3</version>
</dependency>
<dependency>
    <groupId>org.apache.poi</groupId>
    <artifactId>poi-ooxml</artifactId>
    <version>5.2.3</version>
</dependency>
```

---

## 🧾 API Endpoint

- **URL**: `http://localhost:8080/download/excel`
- **Method**: `GET`
- **Response**: Excel file (`.xlsx`)
- **Headers**:
  - `Content-Disposition: attachment; filename=employees.xlsx`
  - `Content-Type: application/octet-stream`

---

## 📁 Project Structure

```
src/
├── controller/
│   └── ExcelController.java
├── model/
│   └── Employee.java
├── service/
│   └── ExcelService.java
```

---

## 👨‍💼 Sample Employee Model

```java
public class Employee {
    private int id;
    private String name;
    private String email;
    private String department;

    // Constructor, Getters
}
```

---

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/excel-download-api.git
   ```
2. Navigate to the project folder and run:
   ```bash
   mvn spring-boot:run
   ```
3. Open your browser or Postman and go to:
   ```
   http://localhost:8080/download/excel
   ```

---

## 📌 Author

**Sharad Kamble**  
📧 sharadkamble131@gmail.com

---

## 📝 License

This project is open source and free to use.
