# Java Version and Tooling

## Recommended Setup

- **JDK:** Java 21 LTS is recommended. Java 17 LTS is also supported for all course examples.
- **Editor:** IntelliJ IDEA Community Edition is recommended; VS Code with Extension Pack for Java or Eclipse also work.
- **Build tool:** Start with plain Java source files. Introduce Maven or Gradle when organizing a larger module or capstone.
- **Style:** Use four spaces, descriptive names, and one public class per file when building examples.

## Verify Your Setup

```bash
java --version
javac --version
git --version
```

Create source files under a package such as `com.rajesh.dsa.day01`. Compile a single example with:

```bash
javac src/main/java/com/rajesh/dsa/day01/Example.java
java -cp src/main/java com.rajesh.dsa.day01.Example
```

## Suggested Libraries

The course emphasizes standard-library fluency: `ArrayList`, `ArrayDeque`, `HashMap`, `HashSet`, `PriorityQueue`, and `Collections`. Avoid third-party libraries until you understand the underlying data structure.

