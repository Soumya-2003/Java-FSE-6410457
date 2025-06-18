*This project demonstrates how to implement linear search and binary search algorithms for a basic e-commerce platform.*

Q) Explain Big O notation and how it helps in analyzing algorithms.
- Big O notation is a way to describe upper bound of an algorithm's time or space complexity. It shows how its resource usage grows as the
  input size increases. It focuses on growth rate rather than exact executioon time.
- It provides an upper limit on the time taken by an algorithm in terms of the size of the input.
- It’s denoted as O(f(n)), where f(n) is a function that represents the number of operations (steps) that an algorithm performs to solve a problem of size n.

Q) Describe the best, average, and worst-case scenarios for search operations.

![Screenshot 2025-06-18 144747](https://github.com/user-attachments/assets/1781711a-cdcc-4de0-948a-cf7ce9518c8a)

SCREENSHOT OF THE OUTPUT

![Screenshot 2025-06-18 143700](https://github.com/user-attachments/assets/4a51c62c-b9f2-439f-ae1c-5a91a7412d9a)

* Linear Search is Good for Small or Unsorted Data. For small datasets or when the data is not sorted, linear search is simple and easy to implement.
  It can also be used for searching by name or category , which may not be easily sorted.

* Binary Search is More Suitable for Large Datasets. If you have thousands or millions of products , binary search will perform much better
  due to its logarithmic time complexity. However, it requires that the data is sorted , which may add overhead during insertion or updates.
