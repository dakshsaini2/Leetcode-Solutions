# 🌡️ Daily Temperatures

## 📌 Problem Statement

Given an array of integers `temperatures` representing daily temperatures, return an array `answer` such that:

* `answer[i]` is the number of days you have to wait after the `i-th` day to get a warmer temperature.
* If there is no future day for which this is possible, keep `0` instead.

---

## 🧠 Approach: Monotonic Stack

We use a **Monotonic Decreasing Stack** to efficiently solve the problem in **O(n)** time.

### 🔑 Key Idea:

* Store indices of temperatures in the stack.
* For each day:

  * Compare current temperature with the temperature at the top index of the stack.
  * If current temperature is higher:

    * Pop the index
    * Calculate number of days waited
  * Push current index into the stack

---

## ⚙️ Algorithm

1. Initialize:

   * `res[]` → result array
   * `stack` → to store indices

2. Traverse the array:

   * While stack is not empty AND current temp > temp at stack top:

     * Pop index
     * Calculate difference
   * Push current index

3. Return result array

---

## 💻 Code (Java)

```java
import java.util.*;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {
                int idx = st.pop();
                res[idx] = i - idx;
            }
            st.push(i);
        }

        return res;
    }
}
```

---

## 📊 Example

### Input:

```
[73, 74, 75, 71, 69, 72, 76, 73]
```

### Output:

```
[1, 1, 4, 2, 1, 1, 0, 0]
```

---

## ⏱️ Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(n)` (stack)

---

## 🚀 Related Problems

* Next Greater Element
* Stock Span Problem
* Largest Rectangle in Histogram

---

## 📚 Concepts Covered

* Stack
* Monotonic Stack
* Array Traversal
* Greedy Thinking

---

## 🧑‍💻 Author

**Daksh Saini**

---

⭐ If you found this helpful, consider giving it a star!
