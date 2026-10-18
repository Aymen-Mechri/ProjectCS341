# CS341 Mini Project

**Course:** CS341 - Data Structures and Algorithms

## Project Objective

The objective of this project is to implement and compare brute-force and optimized Java algorithms for three general problems.

Each algorithm must work for all valid inputs, not only the examples provided in the project description.

## Selected Problems

### 1B: Two Floodwalls (40 points)

**Problem:** Given an array of wall heights, find the maximum water area that can be held between two walls.

**Brute-force algorithm:**
- Examine every possible pair of walls.
- Calculate the area using the shorter wall and the distance between the two walls.
- Return the maximum area.

Time Complexity: O(n²)

Space Complexity: O(1)

**Optimized algorithm:**
- Use two pointers, starting at opposite ends of the array.
- Calculate the area between the selected walls.
- Move the pointer corresponding to the shorter wall inward.
- Keep track of the maximum area.

Time Complexity: O(n)

Space Complexity: O(1)

**Implementation status:** Implemented; final testing pending.

### 1C: Rooftop Puddles (60 points)

Calculate the total rainwater trapped between buildings represented by an array of heights.

**Implementation status:** In progress.

### 2A: Fencing the Pasture (20 points)

Calculate the perimeter of a connected pasture represented by a two-dimensional array.

**Implementation status:** In progress.

## Project Requirements

- Java programming language
- One Java file per problem
- Brute-force and optimized solutions
- Time and space complexity analysis
- General solutions for all valid inputs
- No built-in sorting functions or hashing-based structures in the main solutions

## Testing

The solutions will be checked using multiple valid inputs, including boundary cases. Test results will be documented as development progresses.

## Project Progress

Exercise 1B has been implemented. Exercises 1C and 2A and final verification are the next steps.
