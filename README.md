# Sorting Algorithms Comparison – Homework Assignment

This project implements three classic sorting algorithms in Java:
- Insertion Sort
- Selection Sort
- Bubble Sort

The goal is to compare their performance by counting the number of **comparisons** and **swaps** for three types of input:
1. Increasing (already sorted)
2. Reverse (worst case)
3. Random (average case)

---

## How the Program Works

The program:
- Creates three arrays (increasing, reverse, random)
- Runs all three sorting algorithms on each array
- Tracks the number of comparisons and swaps using global counters
- Prints the results to the console

Each algorithm uses the same input size (10 elements) for a fair comparison.

---

## Results

### **Increasing Input**
| Algorithm       | Comparisons | Swaps |
|-----------------|-------------|-------|
| Insertion Sort  | 9           | 0     |
| Selection Sort  | 45          | 0     |
| Bubble Sort     | 9           | 0     |

### **Reverse Input**
| Algorithm       | Comparisons | Swaps |
|-----------------|-------------|-------|
| Insertion Sort  | 45          | 45    |
| Selection Sort  | 45          | 5     |
| Bubble Sort     | 45          | 45    |

### **Random Input**
| Algorithm       | Comparisons | Swaps |
|-----------------|-------------|-------|
| Insertion Sort  | 33          | 26    |
| Selection Sort  | 45          | 6     |
| Bubble Sort     | 45          | 26    |

---

## Analysis

### **Insertion Sort**
- Best case: very fast on sorted data (only 9 comparisons, 0 swaps)
- Worst case: slow on reverse data (45 comparisons, 45 swaps)
- Average case: moderate performance  
  Insertion Sort adapts to the input — it stops early when the array is already sorted.

### **Selection Sort**
- Always performs the same number of comparisons (45), no matter the input
- Swaps only when needed (at most 1 per pass)
- Not adaptive  
  Selection Sort is predictable but not efficient on large data.

### **Bubble Sort**
- Best case: stops early when sorted (9 comparisons)
- Worst case: very slow on reverse data (45 comparisons, 45 swaps)
- Average case: similar to Insertion Sort but usually slower  
  Bubble Sort benefits from early stopping but still performs many swaps.

---

## How to Run the Program

1. Open the project in IntelliJ IDEA
2. Navigate to `SortingHomework.java`
3. Right‑click inside the file
4. Select **Run 'SortingHomework.main()'**
5. View the results in the console

---

## Author
Juliet Okwan  
CISC 3130 – Data Structures  
Brooklyn Colleges