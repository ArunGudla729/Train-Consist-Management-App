# Train-Consist-Management-App
## Train Consist Management System (UC1)
This project is a Java-based logistics tool designed to manage the assembly and tracking of train bogies (wagons). Use Case 1 (UC1) establishes the application's foundation by initializing the digital manifest and displaying the starting state of a train consist.
## 🚀 Overview
The Train Consist Management App allows railroad operators to maintain a dynamic record of a train's composition. This module focuses on the startup sequence, ensuring the system is ready for real-time operations and providing a clear summary of the initial train state.
## ✨ Key Features

* Standardized Entry Point: Implements a robust main() method for reliable application startup.
* Dynamic Collection Logic: Utilizes the ArrayList implementation of the List interface to allow for a flexible number of bogies that can grow during runtime.
* Automated State Reporting: Instantly calculates the initial bogie count using the .size() method.
* Clean Console Interface: Provides a formatted welcome banner and status messages for ease of use in industrial environments.

## 🛠️ Technical Implementation

| Concept | Description |
|---|---|
| Java Class | Acts as the primary container for the program's data and logistics logic. |
| Main Method | The public static void main(String[] args) serves as the execution entry point. |
| ArrayList | A resizable array implementation used to store bogies dynamically instead of using fixed-size arrays. |
| List Interface | Provides an abstraction layer, making the code maintainable and interchangeable with other list types. |
| Console Output | Uses System.out.println() for real-time reporting to the operator. |

## 💻 Sample Output
Upon compilation and execution, the program generates the following status report:

==========================================
=== Train Consist Management App ===
==========================================

Train initialized successfully...
Initial Bogie Count : 0
Current Train Consist : []

System ready for operations...

## 🚉 Business Use Cases

* Rail Yard Logistics: Initializing a new digital manifest for incoming or outgoing freight.
* Inventory Accuracy: Providing a baseline "zero-state" to ensure no ghost data exists before building a train consist.
* Scalable Architecture: Creating the structural foundation required for adding, removing, and sorting bogies in future modules.

------------------------------


