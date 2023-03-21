## 30 Days of Code - Day 1 - Data Types

### Objective

Today, we're discussing data types.

### Task

The variables <i>i</i>, <i>d</i>, and <i>s</i> are already declared and initialized for you. You must:

1. Declare 3 variables: one of type ```int```, one of type ```double```, and one of type ```String```.
2. Read 3 lines of input from stdin (according to the sequence given in the Input Format section below) and initialize your 3 variables.
3. Use the + operator to perform the following operations:
    1. Print the sum of <i>i</i> plus your ```int``` variable on a new line.
    2. Print the sum of <i>d</i> plus your ```double``` variable to a scale of one decimal place on a new line.
    3. Concatenate <i>s</i> with the ```String``` you read as input and print the result on a new line.

### Input Format

The first line contains an integer that you must sum with <i>i</i>.<br />
The second line contains a double that you must sum with <i>d</i>.<br />
The third line contains a string that you must concatenate with <i>s</i>.

### Output Format

Print the sum of both integers on the first line, the sum of both doubles (scaled 1 to decimal place) on the second line, and then the two concatenated strings on the third line.

### Sample Input

```
12
4.0
is the best place to learn and practice coding!
```

### Sample Output

```
16
8.0
HackerRank is the best place to learn and practice coding!
```

### Explanation

When we sum the integers 4 and 12, we get the integer 16.<br />
When we sum the floating-point numbers 4.0 and 4.0, we get 8.0.<br>
When we concatenate ```HackerRank``` with ```is the best place to learn and practice coding!```, we get ```HackerRank is the best place to learn and practice coding!```.
