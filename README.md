# Java Developer Technical Assessment

## Overview
This repository contains my solutions for the assessment, implemented in **Java 21**. Each question is solved in a separate file and test cases are included in the file `TestCases.java`

Below are brief explanations of each solution.

---

## Programming Language and Version
- **Language:** Java  
- **Version:** Java 21  

---

## Explanations

### Question 1: GetLongestString (`Question1_LongestString.java`)
- Iterates through the input strings, validates against the given character list, checks for non-repetitive characters and returns the **longest valid string**.  

### Question 2: FirstUniqueProduct (`Question2_FirstUniqueProduct.java`)
- Uses a `LinkedHashMap` to count product occurrences in the array.  
- Finds the **first product with a count of one**.  
- Returns `null` if no unique product exists.

### Question 3: Distance Between Minimums (`Question3_ClosestMinimums.java`)
- Finds the **minimum value** in the array, tracks its indices, and computes the smallest distance between any two occurrences updating the values where necessary.

### Question 4: Three Most Common Strings (`Question4_ThreeMostCommon.java`)
- Splits the input sentence into individual strings.  
- Counts frequencies using a `HashMap`.  
- Returns the **top three strings** sorted appropriately.

### Question 5: List Rotation (`Question5_RotateRight.java`)
- Implements a **linked list rotation** by moving each element `n` times to the right according to the formula.  
- Adjusts pointers to reconnect the list.  
---

## How to Run the Code

1. Ensure **Java 21** is installed on your system.  
2. Clone this repository:

```bash
git clone https://github.com/jkmigiro/take-home-tana-test
```
3. Navigate to the project folder:
cd take-home-tana-test
4. Compile and run each question individually. For example:
```bash
javac Question1_LongestString.java
java Question1_LongestString
```
5. Test cases are included in TestCases.java. Compile and run them similarly like in the previous example.
