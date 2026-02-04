Console-Based JDBC CRUD Application (SignUp Form)

This is a Java console-based CRUD application using JDBC and MySQL.
The program allows users to Insert, Read, Update, and Delete records from a MySQL database using a simple terminal menu.

📌 Features

Console-based menu system

JDBC connectivity with MySQL

Uses PreparedStatement (safe from SQL injection)

CRUD operations:

Insert user data

Read all records

Update existing records

Delete records by ID

🛠 Technologies Used

Java (Core Java)

JDBC (Java Database Connectivity)

MySQL Database

MySQL Connector/J (JDBC Driver)

📂 Project Structure
Console-Based-JDBC-CRUD-Operation
│
├── SignUpForm.java
└── README.md

⚙ Prerequisites

Make sure you have the following installed:

Java JDK (8 or above)

Check installation:

java -version


MySQL Server

Ensure MySQL is running

Note your MySQL username and password

MySQL Connector/J (JDBC Driver)

🔌 Download MySQL JDBC Connector

Go to the official site:
https://dev.mysql.com/downloads/connector/j/

Download Platform Independent ZIP

Extract the ZIP file
You will find a file like:

mysql-connector-j-8.x.x.jar

🗄 Database Setup (Very Important)
1️⃣ Create Database
CREATE DATABASE signupform;

2️⃣ Use Database
USE signupform;

3️⃣ Create Table
CREATE TABLE signup (
    id INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(100),
    email VARCHAR(100),
    phoneNumber VARCHAR(15),
    Gender VARCHAR(10),
    password VARCHAR(100)
);

🔧 Configure Database Credentials

Open SignUpForm.java and update:

String url = "jdbc:mysql://localhost:3306/signupform";
String user = "root";
String password = "your_password";


Replace:

user → your MySQL username

password → your MySQL password

▶ How to Compile and Run (Beginner Friendly)
🧑‍💻 Method 1: Using Command Line (Recommended)
1️⃣ Navigate to project folder
cd Console-Based-JDBC-CRUD-Operation

2️⃣ Compile the Java file

(Replace path with actual connector location)

javac -cp ".;mysql-connector-j-8.x.x.jar" SignUpForm.java


On Linux / macOS, use : instead of ;

javac -cp ".:mysql-connector-j-8.x.x.jar" SignUpForm.java

3️⃣ Run the program
java -cp ".;mysql-connector-j-8.x.x.jar" SignUpForm

🧑‍💻 Method 2: Using IDE (IntelliJ / Eclipse)

Open IDE

Create a Java Project

Add SignUpForm.java

Add MySQL Connector JAR:

IntelliJ:
File → Project Structure → Libraries → Add JAR

Eclipse:
Build Path → Add External Archives

Run SignUpForm.java

📋 Program Menu

When the program runs, you will see:

1.Insert
2.Delete
3.Update
4.Read
Make Your Choice:

Operations

Insert → Add new user data

Delete → Delete user by ID

Update → Update Name, Email, Phone, Gender, or Password

Read → Display all records

Any other number → Exit program

📘 JDBC Concepts Used

DriverManager

Connection

PreparedStatement

ResultSet

Try-with-resources

SQL CRUD operations
