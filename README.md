This application demonstrates how to use a HashMap to manage train data. Specifically, it maps different types of Bogies (the keys) to their respective Seating/Load Capacities (the values). This approach allows for efficient, lookup-based access to train configuration details.
## Features

* Key-Value Mapping: Utilizes java.util.HashMap to associate unique bogie names with integer capacity values.
* Data Insertion: Demonstrates the put() method to populate the collection.
* Entry Iteration: Uses entrySet() to loop through and display the complete mapping of the train consist.

## Technical Specifications

| Component | Details |
|---|---|
| Language | Java |
| Collection Type | HashMap<String, Integer> |
| Use Case | UC6: Map Bogie to Capacity |
| Version | 6.0 |

## Sample Output

--------------------------------------------------
UC6 : Map Bogie to Capacity (HashMap)
--------------------------------------------------

Bogie Capacity Details:
-----------------------
Bogie: Sleeper | Capacity: 72
Bogie: AC Chair | Capacity: 56
...

## How to Run

1. Ensure you have JDK 8 or higher installed.
2. Save the code as Train.java.
3. Compile the file: javac Train.java
4. Run the application: java Train