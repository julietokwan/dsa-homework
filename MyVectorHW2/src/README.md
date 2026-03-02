# MyVector – Homework 2

This assignment was about creating a simplified version of Java’s ArrayList using a generic dynamic array. I implemented my own MyVector<T> class with basic operations and tested everything in a separate MyVectorTest file.

## What I implemented
- A generic vector that stores elements in an array
- Automatic resizing when the array gets full
- Methods to add, get, set, and remove elements
- Bounds checking for invalid indexes
- Shifting elements after removal
- A simple test program to show everything works

## Main methods
- add(T value) — adds a new element to the end
- get(int index) — returns the element at a position
- set(int index, T value) — updates an element
- remove(int index) — removes an element and shifts the rest
- size() — returns how many elements are stored

## Test Output
Running MyVectorTest produced:

Size: 3  
Get index 1: 20  
After set: 99  
After remove: 99  
Size now: 2

This shows that adding, updating, removing, and resizing all work correctly.

## Notes
This project helped me understand how dynamic arrays work behind the scenes and how Java handles generics and resizing. It also made me more comfortable with writing my own data structures.