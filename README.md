# Use Case 3: Track Unique Bogie IDs

## Project Overview
This module demonstrates the application of the **Set Interface** in a train management system. The primary goal is to ensure that every bogie added to a train consist has a unique identifier, preventing system errors or duplicate assignments.

## Key Concepts
*   **HashSet**: A collection that does not allow duplicate elements and provides fast access via hashing.
*   **Set Interface**: Defines a collection that ensures uniqueness.
*   **Automatic Deduplication**: The `add()` method returns `false` if an element already exists, ensuring no manual checks are needed.
*   **Unordered Storage**: Elements are stored based on their hash code, not their insertion order.

## Requirements
*   **Data Structure**: `HashSet<String>`
*   **Methods Used**: `.add()`
*   **Behavior**: Intentional duplicate entries (e.g., `B8101`) must be ignored.

## How to Run
1.  **Compile**:
    ```bash
    javac UseCase3TrainConsistAgent.java
    ```
2.  **Execute**:
    ```bash
    java UseCase3TrainConsistAgent
    ```

## Benefits
*   **Enforces Business Constraints**: Guarantees no two bogies share the same ID.
*   **Data Integrity**: Prevents data corruption in the train formation logic.
*   **Efficiency**: Introduces students to $O(1)$ complexity operations for uniqueness validation.
