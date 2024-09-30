# Data Structures Adventure Assignment
#Author
Name: Rupak Poudyal
Student Id: c0903770


# Overview

This repository contains solutions to **Assignment 1: Data Structures Adventure**, which consists of 5 coding challenges. Each challenge explores different data structures and algorithms, including arrays, linked lists, stacks, queues, and binary trees. The solutions are implemented in Java.

# Challenges

### 1. The Array Artifact (ArtifactVault Class)
   - **Description**: A vault to store artifacts using an array, with methods to add, remove, and search for artifacts.
   - **Approach**: I used a basic array to store the artifacts. Linear search is implemented by iterating through the array, and binary search is used on a sorted array of artifacts.
   - **Assumptions**: Binary search is only possible if the array is sorted. The array has a fixed size, set when initializing the `ArtifactVault`.

### 2. The Linked List Labyrinth (LabyrinthPath Class)
   - **Description**: A labyrinth path implemented as a singly linked list with methods to add locations, remove the last location, check for loops, and print the path.
   - **Approach**: I implemented a simple singly linked list, with a loop detection algorithm (Floyd’s Cycle Detection) to identify cycles.
   - **Assumptions**: Locations are represented as strings, and the list is singly linked.

### 3. The Stack of Ancient Texts (ScrollStack Class)
   - **Description**: A stack to manage ancient scrolls, supporting push, pop, peek, and search operations.
   - **Approach**: I used Java’s built-in `Stack` class to handle basic stack operations like pushing, popping, and searching for scrolls.
   - **Assumptions**: The stack has no predefined limit, and scrolls are represented as strings.

### 4. The Queue of Explorers (ExplorerQueue Class)
   - **Description**: A circular queue to manage explorers waiting to enter a temple. The queue supports enqueue, dequeue, and checking if it is full or empty.
   - **Approach**: I used an array-based circular queue implementation with fixed capacity. The queue wraps around when full.
   - **Assumptions**: The queue has a fixed size defined at the time of instantiation.

### 5. The Binary Tree of Clues (ClueTree Class)
   - **Description**: A binary search tree to store clues, with methods to insert clues, traverse the tree (in-order, pre-order, post-order), search for clues, and count the total number of clues.
   - **Approach**: I implemented the binary tree using recursive methods for insertion, traversal, searching, and counting.
   - **Assumptions**: Clues are inserted in a way that maintains the binary search tree property.

## Assumptions or Design Decisions
1. **ArtifactVault**: The array has a fixed size. Binary search is only valid on a sorted array.
2. **LabyrinthPath**: Locations are represented as strings, and loops in the labyrinth are detected using the two-pointer technique.
3. **ScrollStack**: Java’s built-in stack is used to manage the scrolls.
4. **ExplorerQueue**: A circular queue with a fixed size is used, and it wraps around when full.
5. **ClueTree**: The binary tree assumes a unique ordering of clues and performs operations like insert and search recursively.

## Instructions to Run the Code

1. **Clone the Repository**:
   Clone the repository to your local machine using:
   ```bash
   git clone https://github.com/rupakpoudyal5/DataStructures-Assignment1-Rupak_Poudyal.git

2. **Compile java code:**
   ```bash
javac Main.java ArtifactVault.java LabyrinthPath.java ScrollStack.java ExplorerQueue.java ClueTree.java

**Run Java Code**
```bash
java Main

