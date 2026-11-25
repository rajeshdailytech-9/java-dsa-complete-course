# Notes — Day 66: Greedy with heaps

## Core Idea

Write a one- or two-sentence explanation of **Greedy with heaps** after studying it.

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

### Greedy with heaps

This lesson belongs to the **greedy and intervals** phase. Sort by the feature that makes a local choice safe, then articulate why no later choice can improve the prefix.

### Java Focus

Use comparator lambdas with `Arrays.sort` or `List.sort`; use a heap when active choices must be tracked.

### Practice Recipe

1. State the input, output, and constraints before choosing a data structure.
2. Write the invariant or recursive contract in a comment or on paper.
3. Trace a normal case and the smallest failing edge case.
4. Record the final time and space complexity, including any auxiliary structure.

### Review Questions

- Which constraint makes this technique appropriate?
- What state must stay correct after each operation?
- How would the implementation change for an empty or single-item input?

