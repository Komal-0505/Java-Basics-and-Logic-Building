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


# 2 Palindrome Number

## Problem Statement

Given an integer number, check whether the number is a palindrome or not.

A number is called a palindrome if it remains the same after reversing its digits.

Example:

Input:
121

Output:
true

Explanation:
Reverse of 121 is 121, so it is a palindrome.

---

## Approach

To check whether a number is palindrome:

- Reverse the given number.
- Compare the reversed number with the original number.
- If both are equal, the number is a palindrome.
- Otherwise, it is not a palindrome.

---

## Algorithm

1. Store the original number in a separate variable because the original value will be modified while reversing.

2. Initialize a variable `reverse = 0` to store the reversed number.

3. Extract the last digit of the number using:

   digit = number % 10

4. Add the extracted digit to the reverse number:

   reverse = reverse * 10 + digit

5. Remove the last digit from the number:

   number = number / 10

6. Repeat steps 3 to 5 until the number becomes 0.

7. Compare the original number with the reversed number:
   - If original number == reverse, return true.
   - Otherwise, return false.

---

## Dry Run

Input: 121

Initial:

originalNumber = 121  
reverse = 0

Iteration 1:

digit = 121 % 10 = 1

reverse = 0 * 10 + 1 = 1

number = 121 / 10 = 12


Iteration 2:

digit = 12 % 10 = 2

reverse = 1 * 10 + 2 = 12

number = 12 / 10 = 1


Iteration 3:

digit = 1 % 10 = 1

reverse = 12 * 10 + 1 = 121

number = 1 / 10 = 0


Comparison:

Original Number = 121  
Reverse Number = 121

Output: true

---

## Time Complexity

O(d)

Where d is the number of digits in the number.

---

## Space Complexity

O(1)

Only constant extra variables are used.