# Use Case 2: Train Consist Agent

## Description
This project demonstrates the use of Java **ArrayLists** to manage a train consist. It simulates adding, removing, and verifying passenger bogies (carriages) dynamically during runtime.

## Key Concepts Covered
*   **ArrayList**: A resizable collection for dynamic data management.
*   **CRUD Operations**:
    *   **Create**: Adding bogies using `.add()`.
    *   **Read**: Checking existence using `.contains()`.
    *   **Delete**: Removing elements using `.remove()`.
*   **Insertion Order**: Maintaining the sequence of how bogies are attached.

## Requirements
*   **Language**: Java 8 or higher.
*   **Main Class**: `UseCase2TrainConsistAgent`

## How to Run
1.  **Compile the code**:
    ```bash
    javac UseCase2TrainConsistAgent.java
    ```
2.  **Execute the program**:
    ```bash
    java UseCase2TrainConsistAgent
    ```

## Expected Output
The program will display the status of the train consist after every operation, concluding with the final list of bogies and a success message.
