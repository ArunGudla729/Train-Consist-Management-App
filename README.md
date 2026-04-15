### README: UC9 Group Bogies by Type

#### Overview
The **Train Consist Management App** is a console-based Java application simulating a railway system's management of a train’s consist (a collection of bogies attached to an engine)[cite: 1].

#### Goal
The objective of this use case is to group bogies into specific categories using **Java Stream collectors** to provide structured reporting rather than flat lists[cite: 1].

#### Key Concepts [cite: 1]
* **`Collectors.groupingBy()`**: A stream collector that classifies elements based on a key (e.g., bogie name) and stores them in a `Map`.
* **Map Output Structure**: The result is a `Map<String, List<Bogie>>` where the key is the category (e.g., "Sleeper") and the value is the list of bogies in that category.
* **Structured Transformation**: Converts flat data into a hierarchical organization suitable for planning and dashboards.

#### Key Requirements [cite: 1]
* Reuse existing `Bogie` objects.
* Apply the `stream()` method followed by `Collectors.groupingBy()`.
* Ensure the original bogie list remains unchanged after the operation.

#### Benefits [cite: 1]
* Transforms flat collections into meaningful structures.
* Supports advanced reporting and monitoring.
* Improves data organization and readability.