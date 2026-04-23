# UC20: Exception Handling During Search Operations

## Project Goal
To implement defensive programming techniques by ensuring that search operations are only performed when the system is in a valid state (i.e., the bogie collection is not empty).

## Key Concepts
* **Defensive Programming:** Validating system state before executing core logic to prevent crashes.
* **Fail-Fast Principle:** Stopping execution immediately when an invalid condition (empty collection) is detected.
* **IllegalStateException:** Utilizing standard Java runtime exceptions to provide meaningful feedback when the system state is inappropriate for the requested operation.

## Requirements Checklist
- [x] Check if bogie collection is empty before searching.
- [x] Throw `IllegalStateException` if count is zero.
- [x] Stop operation immediately upon exception.
- [x] Provide a user-friendly error message.

## How It Works
1. **Trigger:** The user initiates a search for a Bogie ID.
2. **Validation:** The system checks the length of the Bogie array.
3. **Exception:** If the length is `0`, the system throws an `IllegalStateException` with the message: *"Search failed: No bogies available in the train."*
4. **Execution:** If validation passes, the binary search algorithm proceeds as normal.

## Benefits
* **Reliability:** Prevents the system from processing invalid data ranges.
* **Maintainability:** Makes the code easier to debug by identifying "bad states" early.
* **User Experience:** Provides specific feedback rather than generic null pointer errors or silent failures.