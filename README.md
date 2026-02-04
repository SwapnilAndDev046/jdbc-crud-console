# Console-Based JDBC CRUD Application (SignUp Form)

A Java console-based CRUD application built using JDBC and MySQL.  
This project demonstrates how to connect Java with a MySQL database and perform Create, Read, Update, and Delete (CRUD) operations using a simple terminal menu.

---

## 📌 Features

- Console-based interactive menu
- JDBC connectivity with MySQL
- Uses PreparedStatement (safe from SQL injection)
- CRUD operations:
  - Insert user data
  - Read all records
  - Update existing records
  - Delete records by ID

---

## 🛠 Technologies Used

- Java (Core Java)
- JDBC (Java Database Connectivity)
- MySQL Database
- MySQL Connector/J (JDBC Driver)

---

## 📂 Project Structure

```
Console-Based-JDBC-CRUD-Operation
│
├── SignUpForm.java
└── README.md
```

---

## ⚙ Prerequisites

### Java JDK (8 or above)

Check installation:
```
java -version
```

### MySQL Server

- Ensure MySQL is running
- Note your MySQL username and password

### MySQL Connector/J (JDBC Driver)

---

## 🔌 Download MySQL JDBC Connector

1. Visit the official website:  
   https://dev.mysql.com/downloads/connector/j/

2. Download **Platform Independent (ZIP)**

3. Extract the ZIP file  
   You will find a file similar to:
   ```
   mysql-connector-j-8.x.x.jar
   ```

---

## 🗄 Database Setup (Very Important)

### 1️⃣ Create Database
```
CREATE DATABASE signupform;
```

### 2️⃣ Use Database
```
USE signupform;
```

### 3️⃣ Create Table
```
CREATE TABLE signup (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    email VARCHAR(100),
    phoneNumber VARCHAR(15),
    Gender VARCHAR(10),
    password VARCHAR(100)
);
```

---

## 🔧 Configure Database Credentials

Open `SignUpForm.java` and update:

```
String url = "jdbc:mysql://localhost:3306/signupform";
String user = "root";
String password = "your_password";
```

Replace:
- `user` → your MySQL username
- `password` → your MySQL password

---

## ▶ How to Compile and Run (Beginner Friendly)

### 🧑‍💻 Method 1: Using Command Line (Recommended)

#### 1️⃣ Navigate to project folder
```
cd Console-Based-JDBC-CRUD-Operation
```

#### 2️⃣ Compile the Java file

**Windows**
```
javac -cp ".;mysql-connector-j-8.x.x.jar" SignUpForm.java
```

**Linux / macOS**
```
javac -cp ".:mysql-connector-j-8.x.x.jar" SignUpForm.java
```

#### 3️⃣ Run the program

**Windows**
```
java -cp ".;mysql-connector-j-8.x.x.jar" SignUpForm
```

**Linux / macOS**
```
java -cp ".:mysql-connector-j-8.x.x.jar" SignUpForm
```

---

### 🧑‍💻 Method 2: Using IDE (IntelliJ / Eclipse)

#### IntelliJ IDEA
- Create a Java Project
- Add `SignUpForm.java`
- Add MySQL Connector JAR:
  - File → Project Structure → Libraries → Add JAR
- Run `SignUpForm.java`

#### Eclipse
- Create a Java Project
- Add `SignUpForm.java`
- Add MySQL Connector JAR:
  - Build Path → Add External Archives
- Run the program

---

## 📋 Program Menu

```
1. Insert
2. Delete
3. Update
4. Read
Make Your Choice:
```

### Operations

- Insert → Add new user data
- Delete → Delete user by ID
- Update → Update Name, Email, Phone, Gender, or Password
- Read → Display all records
- Any other number → Exit program

---

## 📘 JDBC Concepts Used

- DriverManager
- Connection
- PreparedStatement
- ResultSet
- Try-with-resources
- SQL CRUD operations

---

## ✅ Conclusion

This project is ideal for beginners to understand JDBC, MySQL integration, and console-based CRUD operations.

Happy Coding! 🚀
