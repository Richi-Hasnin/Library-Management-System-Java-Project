# 📚 Library Management System - Java OOP Project

A basic Java-based object-oriented system that simulates a Library Management System. It includes functionality for managing books, catalog updates, book issues/returns, fine alerts, and member (student/faculty) interactions.

## 🧩 Features

- Book catalog management
- Member handling (Students & Faculty)
- Book issuing and return
- Alerts for overdue books and fine calculation
- Librarian operations (search, manage members, issue/return)

## 🏗️ Class Structure

### 1. `Catalog`
- Fields: `authorName`, `noOfCopies`
- Methods: `updateInfo()`, `search()`

### 2. `Librarian`
- Fields: `name`, `address`, `mobileNo`
- Methods:
  - `updateInfo()`
  - `manageMemberInfo()`
  - `issueBooks()`
  - `returnBook()`
  - `searchBook()`

### 3. `Books`
- Fields: `authorName`, `noOfBooks`
- Methods: `addToCatalog()`, `removeFromCatalog()`

### 4. `Alert`
- Fields: `issueDate`, `bookName`, `returnDate`, `fine`
- Methods:
  - `viewAlert()`
  - `calculateFine()`
  - `deleteAlertByNumber()`

### 5. `Member` (Superclass)
- Fields: `name`, `address`, `memberNo`
- Methods: `requestBook()`, `returnBook()`

### 6. `FacultyMember` (Inherits `Member`)
- Field: `facultyId`
- Method: `checkoutBook()`

### 7. `Students` (Inherits `Member`)
- Fields: `studentId`, `studentCall`
- Methods: `checkoutBook()`, `returnBook()`

### 8. `LibraryManagementSystem` (Main Class)
- Demonstrates object instantiation and interaction through simulated scenarios.

## 💡 Concepts Demonstrated

- **Inheritance**: `Students` and `FacultyMember` extend `Member`
- **Encapsulation**: Use of private/public fields and methods (partially implemented)
- **Polymorphism**: Overriding book checkout/return functionality in subclasses
- **Object Collaboration**: Librarian interacts with members and books

## 🚀 How to Run

### ✅ Requirements
- Java JDK 8 or higher
- IDE (IntelliJ, Eclipse) or terminal

### ▶️ Steps

1. Save the code in a file named `LibraryManagementSystem.java`
2. Open a terminal or IDE
3. Compile and run the program:

```bash
javac LibraryManagementSystem.java
java LibraryManagementSystem
