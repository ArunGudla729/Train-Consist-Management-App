# Train Consist Management App - UC11 (Regex Validation)

## Overview
This module provides strict input validation for the Train Consist Management App[cite: 1]. It ensures that critical identifiers like **Train ID** and **Cargo Code** follow specific formats before being processed by the system to maintain data integrity[cite: 1].

## Features
* **Regex-based Validation**: Uses `java.util.regex` (Pattern and Matcher) to enforce formatting rules[cite: 1].
* **Format Enforcement**:
    * **Train ID**: Must follow the pattern `TRN-xxxx` where `xxxx` is exactly four digits (e.g., TRN-1234)[cite: 1].
    * **Cargo Code**: Must follow the pattern `PET-YY` where `YY` is exactly two uppercase letters (e.g., PET-AB)[cite: 1].
* **Error Handling**: Provides immediate feedback if the user enters malformed data[cite: 1].

## How it Works
1. The user provides input via the console.
2. The application compiles the required Regex patterns.
3. The `Matcher.matches()` method checks if the entire input string conforms to the pattern[cite: 1].
4. The system outputs whether the validation was successful or failed[cite: 1].

## Requirements
* Java Development Kit (JDK) 8 or higher.