# 🔁 Remove Duplicates from Sorted Array

## 📌 Problem Statement

Given a **sorted array**, remove the duplicates **in-place** such that each element appears only once.

Return the number of unique elements.

> ⚠️ Do not use extra space. Modify the array in-place.

---

## 💡 Approach: Two Pointer Technique

Since the array is **sorted**, duplicate elements are always adjacent.

We use:

* **Pointer `i`** → tracks position of last unique element
* **Pointer `j`** → scans the array

---

## ⚙️ Steps

1. Initialize `i = 0`
2. Traverse the array using `j` from index `1`
3. If current element is **different** from `nums[i]`:

   * Move `i` forward
   * Place the new unique element at position `i`
4. Continue until the end of the array
5. Final answer = `i + 1`

---

## 🧠 Why This Works

* Sorted array ensures duplicates are grouped together
* We only keep **first occurrence** of each element
* All unique elements are moved to the front

---

## 🖼 Example

### Input:

```id="qsnj5d"
[1, 1, 2, 2, 3]
```

### Processed Array:

```id="7czv92"
[1, 2, 3, _, _]
```

### Output:

```id="m6kmle"
3
```

---

## ⏱ Complexity Analysis

| Type  | Complexity |
| ----- | ---------- |
| Time  | O(n)       |
| Space | O(1)       |

* Single pass → **O(n)**
* No extra memory → **In-place**

---

## 🚀 Key Insights

* 🔹 Use two pointers for in-place modification
* 🔹 Sorted property simplifies duplicate detection
* 🔹 No need for extra data structures

---

## ⚠️ Edge Cases

* Empty array → return 0
* All elements same → return 1
* No duplicates → return array length

---

## 🔁 Variations

* Allow at most **2 duplicates**
* Remove duplicates from **unsorted array**

---

## 📚 Tags

`Array` `Two Pointers` `In-place` `DSA` `Interview Prep`

---

## ✨ Author

**Daksh Saini**

> Consistency beats intensity 🚀
