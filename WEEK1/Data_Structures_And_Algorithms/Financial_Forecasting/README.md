*Developing a financial forecasting tool that predicts future values based on past data.*

Q) What is Recursion?
  Recursion is a programming technique where a function calls itself to solve smaller subproblems of the same type. 
  It’s useful for problems that can be broken down into similar, simpler subproblems.

Q) Why Use Recursion for Financial Forecasting?
 - Financial data often has repetitive patterns (e.g., compound interest).
 - Recursion can naturally model compound growth over time.
 - It simplifies code by breaking the problem into smaller steps.

SCREENSHOT OF THE OUTPUT

![Screenshot 2025-06-18 153132](https://github.com/user-attachments/assets/39da9ee1-f65d-47df-8cd8-d9a4d3a44404)


* Time Complexity of the Recursive Solution
The recursive approach runs in O(n) time, where n is the number of years.
Each recursive call reduces the year count by 1, so it makes exactly n calls before reaching the base case.

* Space Complexity
It also uses O(n) space due to the recursion stack.

* Problem with the Recursive Approach
  If years is large (say 10,000), the recursion depth will exceed Java’s default stack limit and cause a StackOverflowError .

* We can optimize the recursive solution by using memoization to store previously computed results and avoid redundant calculations.
