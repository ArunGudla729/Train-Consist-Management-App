# Use Case 5: Preserve Insertion Order of Bogies

## Project Overview
This project demonstrates the use of the **LinkedHashSet** collection within the Train Consist Management system. It provides a solution where both **uniqueness** (no duplicate bogies) and **insertion order** (physical sequence) are critical requirements.

## Key Concepts
*   **LinkedHashSet**: A hybrid collection (Hash table + Linked List) that maintains a doubly-linked list through its entries to preserve the order in which elements were inserted.
*   **Set Interface**: Ensures that the same bogie cannot be attached more than once, protecting the train from invalid duplicate attachments.
*   **Automatic Deduplication**: The system ignores duplicate entries internally, removing the need for manual validation logic.
*   **Ordered Iteration**: Bogies are returned in the exact sequence they were connected to the engine.

## Requirements
*   **Data Structure**: `LinkedHashSet<String>`
*   **Core Flow**:
    1. Insert unique bogies.
    2. Attempt to insert a duplicate.
    3. Verify that the output remains unique and ordered.

## How to Run
1.  **Compile**:
    ```bash
    javac UseCase5TrainConsistAgent.java
    ```
2.  **Execute**:
    ```bash
    java UseCase5TrainConsistAgent
    ```

## Key Benefits
*   **Business Rules**: Enforces the real-world rule that a specific bogie cannot exist in two places at once.
*   **Physical Integrity**: Preserves the actual physical attachment sequence of the train.
*   **Predictable Output**: Provides safe and predictable composition logic compared to a standard `HashSet`.
