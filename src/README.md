MyVector<T> — Homework 2
This project is my implementation of a simplified dynamic array called MyVector<T>. It works like a basic version of Java’s ArrayList, using an internal array that grows automatically when more space is needed.

What I Implemented
- A generic class MyVector<T>
- Internal storage using a T[] array
- Automatic resizing with a 2× growth strategy
- The following methods:
- size()
- add(T value)
- get(int index)
- set(int index, T value)
- remove(int index)
- ensureCapacity(int minCapacity) (private helper)

How the Dynamic Array Works
The vector starts with a small array (capacity 10).
Whenever I add an element and the array is full, the vector doubles its capacity.
This keeps adding elements efficient over time.
Removing an element shifts everything after it one position to the left so there are no gaps.

Time Complexity Notes
Constant‑time operations (O(1)):
- size()
- get(index)
- set(index, value)
  Amortized O(1):
- add(value)
  Most adds are constant time, but when the array is full, it resizes and copies all elements.
  That resize is O(n), but it happens rarely, so the average cost stays O(1).
  Linear‑time operations (O(n)):
- remove(index) — because elements must shift left
- ensureCapacity() — copies the whole array during resizing

Reflection
This assignment helped me understand how ArrayList actually works under the hood.
The biggest idea is that doubling the array makes adding elements efficient overall, even though resizing is expensive when it happens.

