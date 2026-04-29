# 🔄 Rotate Image (90° Clockwise)

## 📌 Problem Statement

Given an `n x n` 2D matrix representing an image, rotate the image by **90 degrees clockwise**.

> ⚠️ The rotation must be done **in-place**, without using extra memory.

---

## 💡 Approach: Transpose + Reverse

Instead of rotating the matrix layer by layer (which is complex), we use a simple and efficient method:

### ✅ Step 1: Transpose the Matrix

* Convert rows into columns
* Swap elements across the diagonal
* Position `(i, j)` becomes `(j, i)`

---

### ✅ Step 2: Reverse Each Row

* Reverse every row of the matrix
* First element ↔ Last element

---
---

## 🖼 Example

### Original Matrix:

```id="g1r4aa"
1 2 3
4 5 6
7 8 9
```

### After Transpose:

```id="czs6l0"
1 4 7
2 5 8
3 6 9
```

### Final Output (After Row Reverse):

```id="svlj9l"
7 4 1
8 5 2
9 6 3
```

---

## ⏱ Complexity Analysis

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n²)      |
| Space | O(1)       |

* Each element is visited once → **O(n²)**
* No extra memory used → **In-place solution**

---


---

## 🔁 Variations

### 🔄 Anti-Clockwise Rotation

* Transpose the matrix
* Reverse each **column** instead of rows

---

