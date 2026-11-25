# Notes — Day 33: Frequency counting and grouping

## Core Idea

Write a one- or two-sentence explanation of **Frequency counting and grouping** after studying it.

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

### Frequency counting and grouping

This lesson belongs to the **hashing** phase. Define the key precisely and reason about collisions, equality, and load factor. Hashing trades ordering for expected O(1) lookup.

### Java Focus

Use `HashMap.merge`, `getOrDefault`, `HashSet.add`, and correct `equals`/`hashCode` overrides.

### Practice Recipe

1. State the input, output, and constraints before choosing a data structure.
2. Write the invariant or recursive contract in a comment or on paper.
3. Trace a normal case and the smallest failing edge case.
4. Record the final time and space complexity, including any auxiliary structure.

### Review Questions

- Which constraint makes this technique appropriate?
- What state must stay correct after each operation?
- How would the implementation change for an empty or single-item input?

