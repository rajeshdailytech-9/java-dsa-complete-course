# Notes — Day 50: Breadth-first search

## Core Idea

Write a one- or two-sentence explanation of **Breadth-first search** after studying it.

## Key Concepts

- Definition:
- Invariant or rule to preserve:
- Common Java APIs or language features:
- Time complexity:
- Space complexity:

## Walkthrough

Use a small input, trace each operation, and record the changing state here.

## Edge Cases

- Empty input:
- Single item:
- Duplicate values:
- Boundary values:

## Mistakes and Review Prompts

- What initially felt confusing?
- When would this approach be a poor fit?
- Can I implement the core technique tomorrow without notes?

## Reference Notes

### Breadth-first search

This lesson belongs to the **graphs** phase. Decide whether vertices, edges, and direction are explicit. Track visited state so traversal never repeats work.

### Java Focus

Represent sparse graphs with adjacency lists; use `ArrayDeque` for BFS and recursion or a stack for DFS.

### Practice Recipe

1. State the input, output, and constraints before choosing a data structure.
2. Write the invariant or recursive contract in a comment or on paper.
3. Trace a normal case and the smallest failing edge case.
4. Record the final time and space complexity, including any auxiliary structure.

### Review Questions

- Which constraint makes this technique appropriate?
- What state must stay correct after each operation?
- How would the implementation change for an empty or single-item input?

