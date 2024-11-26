# Data Structure Examples in Java

This repository contains examples demonstrating different data structures in Java, including their usage and typical applications.

## Contents

1. [TextEditor](#texteditor)
2. [UniqueVisitors (Set)](#uniquevisitors-set)
3. [FileSystem (Tree)](#filesystem-tree)
4. [SocialNetwork (Graph)](#socialnetwork-graph)
5. [TaskScheduler (Heap)](#taskscheduler-heap)

---

## TextEditor

### Description
Demonstrates the **Stack** data structure by simulating undo/redo functionality in a text editor.

### Key Concepts
- **Stack** follows the Last In, First Out (LIFO) principle
- Used to manage the history of edits for undo/redo operations

### Code Overview
- Maintains two stacks:
  - `undoStack`: Stores the history of edits
  - `redoStack`: Stores undone edits for redo functionality

### Usage
Run the `TextEditor` class to simulate text editing and test undo/redo functionality.

---

## UniqueVisitors (Set)

### Description
Demonstrates the **Set** data structure by tracking unique visitor IP addresses.

### Key Concepts
- **HashSet** is used to ensure uniqueness of elements
- Prevents duplicate entries

### Code Overview
- Adds visitor IP addresses to a `HashSet`
- Ensures only unique visitors are counted

### Usage
Run the `UniqueVisitors` class to see how many unique visitors are added.

---

## FileSystem (Tree)

### Description
Demonstrates the **Tree** data structure by simulating a simple file system hierarchy.

### Key Concepts
- Nodes represent files and directories
- Recursive traversal of the tree is used to display the hierarchy

### Code Overview
- `Node` class:
  - Represents a file or directory
  - Contains a `name` and an array of `children`
- Recursive `display()` method prints the hierarchy

### Usage
Run the `FileSystem` class to display the file system structure.

---

## SocialNetwork (Graph)

### Description
Demonstrates the **Graph** data structure by modeling friend connections in a social network.

### Key Concepts
- **Graph** consists of nodes (users) connected by edges (friendships)
- Uses a `HashMap` to store adjacency lists

### Code Overview
- Nodes (users) are represented as keys in the map
- Friend connections are stored as lists of adjacent nodes

### Usage
Run the `SocialNetwork` class to display a user’s friends.

---

## TaskScheduler (Heap)

### Description
Demonstrates the **Heap** data structure using a priority queue to manage tasks.

### Key Concepts
- **PriorityQueue** is used to store tasks based on priority
- Automatically sorts tasks so the highest priority task is processed first

### Code Overview
- Tasks are added to a `PriorityQueue` with numerical priority values
- Tasks are dequeued in priority order

### Usage
Run the `TaskScheduler` class to simulate task scheduling.

---

## Requirements

- Java Development Kit (JDK) 8 or higher.

## How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/data-structure-examples.git
   cd data-structure-examples
