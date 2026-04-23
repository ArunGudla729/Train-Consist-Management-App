# UC18: Linear Search for Bogie ID (Array-Based Searching)

## Overview
This module introduces basic searching logic to the **Train Consist Management App**. It allows operators and maintenance teams to locate a specific bogie ID within a train's consist, even if the list is unsorted[cite: 1].

## Key Features
* **Linear Search:** Checks each element one by one until a match is found[cite: 1].
* **Unsorted Data Handling:** Works correctly regardless of the order of bogies[cite: 1].
* **Time Complexity:** Operates at **O(n)** performance[cite: 1].
* **Safe Comparison:** Uses `equals()` for reliable string identification[cite: 1].

## How to Run
1.  **Compile:** `javac BogieSearch.java`
2.  **Execute:** `java BogieSearch`
3.  **Input:** Enter a Bogie ID (e.g., `BG309`) when prompted.

## Test Scenarios [cite: 1]
| Test Case | Input Key | Expected Result |
| :--- | :--- | :--- |
| **Bogie Found** | `BG309` | `true` |
| **Bogie Not Found** | `BG999` | `false` |
| **First Element Match** | `BG101` | `true` (Terminates immediately) |
| **Last Element Match** | `BG550` | `true` (Traverses full list) |
| **Single Element** | `BG101` | `true` (If array has only one ID) |

## Benefits
This approach is simple, reliable, and serves as a fundamental building block for more optimized search techniques (like Binary Search) in future use cases[cite: 1].