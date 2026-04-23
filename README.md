# UC19: Binary Search for Bogie ID

## Project Goal
The goal of this project is to implement an efficient searching technique to find a specific Bogie ID within a collection of sorted data using the Binary Search algorithm.

## Key Features
* **Divide-and-Conquer:** Reduces search space by half in each step, ensuring high performance.
* **Lexicographical Comparison:** Utilizes the `compareTo()` method to handle String-based IDs accurately.
* **Optimized Performance:** Achieves a time complexity of **O(log n)**, which is significantly faster than a standard linear search.

## Preconditions
1.  **Sorted Data:** The Bogie IDs must be in ascending order for the algorithm to function correctly.
2.  **Unique Keys:** While the algorithm works with duplicates, it is designed to find the index of a specific ID.

## Implementation Flow
1.  **Input:** User provides a list of sorted IDs and a search key.
2.  **Initialize:** System sets the `low` index to 0 and `high` index to the end of the array.
3.  **Find Mid:** Calculate the middle index: `mid = low + (high - low) / 2`.
4.  **Compare:**
    * If `key` matches the middle element, the ID is found.
    * If `key` is greater than the middle element, search the right half.
    * If `key` is smaller than the middle element, search the left half.
5.  **Terminate:** Repeat until the ID is found or the range is exhausted.

## Benefits
Implementing this use case improves search performance in large railway datasets and demonstrates the practical application of algorithmic optimization.