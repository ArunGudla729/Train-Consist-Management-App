# Train Consist Management - UC15

## Overview
This project demonstrates structured exception handling in Java using `try-catch-finally`. It prevents the application from crashing when unsafe cargo assignments are attempted.

## Key Features
* **Custom Runtime Exception**: Uses `CargoSafetyException` to signal domain-specific safety violations.
* **Dynamic Validation**: Checks compatibility between bogie shape and cargo type during runtime.
* **Graceful Failure**: Uses `catch` to handle errors and `finally` for mandatory logging.
* **System Stability**: Ensures the program continues executing even if one assignment fails.

## How to Run
1.  Ensure you have **Java JDK** installed.
2.  Save the code as `Train.java`.
3.  Open a terminal and compile the code:
    ```bash
    javac Train.java
    ```
4.  Run the application:
    ```bash
    java Train
    ```

## Safety Rules
* **Petroleum** can only be assigned to **Cylindrical** bogies.
* Assigning **Petroleum** to a **Rectangular** bogie will trigger a safety exception.

Summary of UC15 logic
[cite: 1]:
Try Block: Monitors the cargo assignment logic.

Catch Block: Catches the CargoSafetyException, prints an error, and prevents a crash.

Finally Block: Executes a "validation completed" message regardless of the outcome.