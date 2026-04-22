### README.md

```markdown
# Train Consist Management App - UC14

## Overview
This module implements **UC14: Handle Invalid Bogie Capacity**[cite: 1]. It introduces robust error handling by preventing the creation of passenger bogies with invalid seating capacities (negative or zero) using a **Custom Exception**.

## Key Features
* **Custom Exception (`InvalidCapacityException`)**: A domain-specific checked exception[cite: 1].
* **Fail-Fast Validation**: Capacity is validated immediately during object construction[cite: 1].
* **Business Rule Enforcement**: Ensures that only bogies with a capacity > 0 can exist in the train consist[cite: 1].

## Technical Concepts Used
* **Inheritance**: Extending the `Exception` class[cite: 1].
* **throw/throws**: Explicitly raising and declaring exceptions[cite: 1].
* **Constructor Validation**: Encapsulating rules within the object's lifecycle[cite: 1].

## How to Run
1. Save the code as `Train.java`.
2. Compile the code:
   ```bash
   javac Train.java
   ```
3. Run the application:
   ```bash
   java Train
   ```

## Test Scenarios Covered
* **Valid Creation**: Bogie with capacity 72 is created successfully[cite: 1].
* **Zero Capacity**: Throws `InvalidCapacityException` with message "Capacity must be greater than zero"[cite: 1].
* **Negative Capacity**: Throws `InvalidCapacityException` for negative values[cite: 1].
```