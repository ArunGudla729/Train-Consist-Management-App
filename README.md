## README: UC7 - Sort Bogies by Capacity
### Project Overview
The **Train Consist Management App** is a console-based Java application designed to simulate railway management operations[cite: 1]. This specific module (**UC7**) addresses the need for administrative planning by ranking bogies based on their seating capacity[cite: 1].

### Problem Statement
In previous versions (UC6), data was stored in a `HashMap`, which allowed mapping but did not provide a logical order[cite: 1, 2]. Without sorting:
* Bogies are not ranked[cite: 1].
* There is no logical ordering for reporting[cite: 1].
* It is difficult to identify high-capacity bogies for optimal usage[cite: 1].

### Features
* **Custom Object Handling**: Uses a `Bogie` class to store complex data (name and capacity)[cite: 1].
* **Custom Sorting**: Implements the `Comparator` interface to define business-specific sorting logic[cite: 1].
* **Lambda Support**: Utilizes concise lambda expressions for comparison[cite: 1].

### Key Concepts
| Concept | Description |
| :--- | :--- |
| **Comparator Interface** | Defines custom comparison logic for objects[cite: 1]. |
| **List Collection** | Stores multiple bogie objects for easy iteration and sorting[cite: 1]. |
| **sort() Method** | Rearranges elements based on defined criteria[cite: 1]. |
| **Separation of Logic** | Keeps data structures independent from sorting behavior[cite: 1]. |

### How to Run
1.  Compile the program: `javac TrainApp.java`
2.  Run the application: `java TrainApp`
3.  The system will output the passenger bogies sorted from highest to lowest capacity[cite: 1].