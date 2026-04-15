# Use Case 4: Maintain Ordered Bogie Consist

## Project Overview
This project simulates the physical management of a train consist using the **LinkedList** collection. By modeling bogies as nodes in a doubly linked list, the system can efficiently handle the attachment and detachment of carriages at various positions.

## Key Concepts
*   **Node-Based Structure**: Each carriage (node) contains data and links to the previous and next bogies, enabling efficient insertions and deletions.
*   **Order Preservation**: Maintains the specific physical sequence of train bogies throughout all operations.
*   **Positional Flexibility**: Demonstrates the ability to insert elements into the middle of the consist without shifting the entire underlying array.

## Operations Implemented
1.  **Sequential Addition**: Building the initial train structure.
2.  **Mid-Chain Insertion**: Adding a 'Pantry Car' at a specific index.
3.  **Head/Tail Deletion**: Using `removeFirst()` and `removeLast()` to decouple the engine and guard van.

## How to Run
1.  **Compile**:
    ```bash
    javac UseCase4TrainConsistAgent.java
    ```
2.  **Execute**:
    ```bash
    java UseCase4TrainConsistAgent
    ```

## Key Benefits
*   **Real-World Modeling**: Mirrors the actual chaining behavior of a physical train.
*   **Efficiency**: Showcases the performance advantages of LinkedList for node-based modifications.
