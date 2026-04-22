# 🚆 Train Consist Management App

## 📌 Overview

The **Train Consist Management App** is a Java-based application designed to model and validate train composition using Object-Oriented Programming principles.

It focuses on ensuring **safety compliance of goods bogies** based on predefined domain constraints.

---

## 🎯 Objective

To simulate a train system where different types of goods bogies are added and validated against safety rules.

---

## 🧠 Key Concept (UC12)

### **Safety Compliance Check for Goods Bogies**

**Rule Implemented:**

* Bogies carrying **EXPLOSIVE cargo** must be **CYLINDRICAL in shape**
* Any violation marks the entire train as **NOT SAFE**

---

## 🏗️ Project Structure

```
Train-Consist-Management-App/
│
├── App/
│   └── src/
│       └── Train.java
│
├── README.md
```

---

## ⚙️ Technologies Used

* Java (JDK 23)
* Object-Oriented Programming (OOP)
* VS Code / IntelliJ IDEA

---

## 🧩 OOP Concepts Used

* **Abstraction** → `abstract class Bogie`
* **Inheritance** → `GoodsBogie extends Bogie`
* **Polymorphism** → `isSafetyCompliant()` method
* **Encapsulation** → Controlled data access using private members

---

## 🚄 Classes Description

### 1. **Bogie (Abstract Class)**

* Base class for all bogie types
* Defines:

  * `id`
  * `isSafetyCompliant()` (abstract method)

---

### 2. **GoodsBogie**

* Extends `Bogie`
* Contains:

  * `CargoType` (PETROLEUM, COAL, GRAIN, EXPLOSIVE)
  * `Shape` (CYLINDRICAL, OPEN, BOX)
* Implements safety validation logic

---

### 3. **TrainManager**

* Manages a list of bogies
* Performs:

  * Addition of bogies
  * Safety compliance check
  * Report generation

---

### 4. **Train (Main Class)**

* Entry point of the program
* Creates sample train configuration
* Triggers safety validation

---

## ▶️ How to Run

### Step 1: Navigate to source folder

```bash
cd App/src
```

### Step 2: Compile

```bash
javac Train.java
```

### Step 3: Run

```bash
java Train
```

---

## 📊 Sample Output

```
UC12 - Safety Compliance Check for Goods Bogies
================================================

Goods Bogies in Train:
Cylindrical -> Petroleum
Open -> Coal
Box -> Grain
Box -> Explosive

Safety Compliance Status: false
Train formation is NOT SAFE.

UC12 safety validation completed...
```

---

## ✅ Features

* Validates train safety based on domain rules
* Clean and structured OOP design
* Easily extendable for new bogie types or rules
* Clear console-based reporting

---

## 🔮 Future Enhancements

* Add passenger bogies
* GUI using JavaFX or Swing
* Database integration (PostgreSQL)
* REST API using Spring Boot

---

## 👨‍💻 Author

**Arun Sriram Gudla**

---

## 📜 License

This project is for educational purposes.
