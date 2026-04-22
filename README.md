# Train Consist Management App - UC13 Performance Benchmark

## Overview
This application performs a performance comparison between traditional **Loop-Based Processing** and modern **Stream-Based Processing**. It serves as a benchmarking tool to help developers make evidence-driven optimization decisions rather than assuming one method is always superior[cite: 1].

## Key Features
* **High-Resolution Timing**: Uses `System.nanoTime()` to measure execution duration in nanoseconds[cite: 1].
* **Filtering Logic**: Filters a dataset of bogies based on a seat capacity threshold (e.g., capacity > 60)[cite: 1].
* **Benchmarking**: Compares the speed of imperative (loops) vs. declarative (streams) coding styles[cite: 1].

## How to Run
1. Ensure you have Java JDK 8 or higher installed.
2. Save the code in a file named `Train.java`.
3. Compile the program:
   ```bash
   javac Train.java
4. Run the application:

Bash
java Train
Key Concepts 
[cite: 1]
Micro-Measurement Awareness: Small code sections require precise timing rather than coarse millisecond clocks.

Evidence-Driven Optimization: Decisions should be based on measured performance results.

Stream API: Utilizes .filter() and .collect() pipelines for data processing.