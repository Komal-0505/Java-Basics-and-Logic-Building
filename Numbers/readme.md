# 1 Armstrong Number

## Problem Statement

An **Armstrong Number** (also known as a Narcissistic Number) is a number that is equal to the sum of its own digits, where each digit is raised to the power of the total number of digits.

---

## Example

### Example 1

**Input**

```text
153
```

**Output**

```text
true
```

**Explanation**

153 is a 3-digit number.

[
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
]

Since the sum is equal to the original number, **153 is an Armstrong Number**.

---

### Example 2

**Input**

```text
9474
```

**Output**

```text
true
```

**Explanation**

9474 is a 4-digit number.

[
9^4 + 4^4 + 7^4 + 4^4
= 6561 + 256 + 2401 + 256
= 9474
]

---

### Example 3

**Input**

```text
123
```

**Output**

```text
false
```

---

# Approach

1. Store the original number.
2. Count the total number of digits.
3. Extract each digit using the modulus (`%`) operator.
4. Raise the digit to the power of the total number of digits.
5. Add all the powered values.
6. Compare the final sum with the original number.
7. If both are equal, the number is an Armstrong Number; otherwise, it is not.

---

# Algorithm

1. Read the input number `N`.
2. Store `N` in a variable named `originalNumber`.
3. Count the number of digits in `N`.
4. Initialize `sum = 0`.
5. Repeat until the number becomes 0:

   * Extract the last digit.
   * Calculate `digit^digits`.
   * Add it to `sum`.
   * Remove the last digit.
6. Compare `sum` with `originalNumber`.
7. Return **true** if they are equal; otherwise return **false**.

---

# Dry Run

### Input

```text
153
```

### Step 1

Digits = **3**

### Step 2

| Digit | Calculation | Sum |
| ----: | ----------- | --: |
|     3 | 3³ = 27     |  27 |
|     5 | 5³ = 125    | 152 |
|     1 | 1³ = 1      | 153 |

Final Sum = **153**

Original Number = **153**

Output = **true**

---

# Time Complexity

* Counting digits → **O(d)**
* Calculating the powered sum → **O(d)**

**Overall Time Complexity:** **O(d)**

where `d` is the number of digits.

---

# Space Complexity

**O(1)**

No extra space is used except a few variables.

---

# Java Concepts Used

* Loops (`while`)
* Methods
* Conditional Statements (`if`)
* Arithmetic Operators (`%`, `/`)
* `Math.pow()`
* Variables
* User Input (`Scanner`)
