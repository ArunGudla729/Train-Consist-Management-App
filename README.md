# UC8: Filter Passenger Bogies Using Streams

## Overview
This use case demonstrates the application of the Java Stream API to process and filter a collection of passenger bogies. By moving away from imperative loops to a declarative style, the code becomes more readable and maintainable.

## Key Features
* **Stream API**: Utilizes `stream()` to process the bogie collection.
* **Filter Operation**: Uses a Lambda expression `(b -> b.capacity > 60)` to select specific elements.
* **Collectors**: Converts the processed stream back into a `List` using `collect(Collectors.toList())`.

## Requirements
* Reuse the `Bogie` list logic from UC7.
* Filter criteria: Bogie capacity must be greater than 60.
* Display both the original and the filtered results.

## Expected Output
```text
All Bogies:
Sleeper -> 72
AC Chair -> 56
First Class -> 24
General -> 90

Filtered Bogies (Capacity > 60):
Sleeper -> 72
General -> 90

UC8 filtering completed.
```

## Benefits
* Reduces boilerplate code compared to traditional `for` loops.
* Improves clarity of business rules through declarative programming.
* Prepares the codebase for more advanced stream operations like mapping or sorting.
```