## **README: UC10 - Count Total Seats in Train (reduce)**

### **Overview**
The **Train Consist Management App** is a console-based Java application that simulates a railway system[cite: 1]. **UC10** introduces functional aggregation to calculate quantitative metrics for a train[cite: 1].

### **The Problem**
In previous approaches (like UC9), data was grouped but provided no numerical insight[cite: 1]. Administrators need to know the total seating capacity to:
* Estimate passenger handling capability[cite: 1].
* Perform effective utilization planning[cite: 1].

### **Technical Solution**
We replace manual loops with a **Stream Pipeline** to compute a single total value[cite: 1]:
* **`map()` Operation:** Transforms each `Bogie` object into its numeric `capacity`[cite: 1].
* **`reduce()` Method:** Combines multiple values into one result using `Integer::sum`[cite: 1].

### **Key Concepts**
* **Method Reference:** Uses concise syntax (`Integer::sum`) for aggregation logic[cite: 1].
* **Identity Value:** The `reduce` operation starts with an identity of `0`, ensuring that an empty list returns a result of 0 rather than an error[cite: 1].
* **Data Integrity:** The original collection remains unchanged after the stream operation[cite: 1].

### **Expected Output**
```text
Bogies in Train:
Sleeper (Capacity: 72)
AC Chair (Capacity: 64)
First Class (Capacity: 24)
Sleeper (Capacity: 72)

--- Train Statistics ---
Total Seating Capacity: 232
```
