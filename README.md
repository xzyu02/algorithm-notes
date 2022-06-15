> # Algorithm Practice Notes

Hi, this is Xizheng Yu. This is my note of solutions of classical algorithm and data structure problems. You can find solution files written in Java in my repository. All solutions are written by myself and references (solution links) are from public sources include YouTube, LeetCode Community, Geekforgeeks etc., which are organized on the main page. Feel free to reach out if you have any question.

> # Data Structure

## LinkedList

| Questions | Solutions | Notes
| --- | --- | ---
| **19. Remove Nth Node From End of List**  | [Solution](./data-structures/linked-list/19.java), <br>[Solution with Explanation](https://leetcode.com/problems/remove-nth-node-from-end-of-list/discuss/8804/Simple-Java-solution-in-one-pass) | Two pointers
| **21. Merge Two Sorted Lists** | [Solution](./data-structures/linked-list/21.java), <br>[Solution with Explanation](https://leetcode.com/problems/merge-two-sorted-lists/discuss/1405588/100-or-Java-or-Clear-Code-%2B-Explanation) | Recursive
| **24. Swap Nodes in Pairs** | [Solution](./data-structures/linked-list/24.java) |
| **83. Remove Duplicates from Sorted List** | [Solution](./data-structures/linked-list/83.java) |
| **160. Intersection of Two Linked Lists** | [Solution](./data-structures/linked-list/160.java) |
| **206. Reverse Linked List** | [Solution](./data-structures/linked-list/206.java) |
| **234. Palindrome Linked List** | [Solution](./data-structures/linked-list/234.java), <br>[Solution with Explanation](https://leetcode.com/problems/palindrome-linked-list/discuss/64501/Java-easy-to-understand) | Cut half and compare
| **328. Odd Even Linked List** | [Solution](./data-structures/linked-list/328.java) |
| **445. Add Two Numbers II** | [Solution](./data-structures/linked-list/445.java) | Stack
| **725. Split Linked List in Parts** | [Solution](./data-structures/linked-list/725.java) |

## Tree

| Questions | Solutions | Notes
| --- | --- | ---
| **101. Symmetric Tree** | [Solution](./data-structures/tree/101.java) |
| **104. Maximum Depth of Binary Tree**| [Solution](./data-structures/tree/104.java)|
| **110. Balanced Binary Tree**| [Solution](./data-structures/tree/110.java)|
| **111. Minimum Depth of Binary Tree**| [Solution](./data-structures/tree/111.java)| BFS is better than revursively DFS here
| **112. Path Sum** | [Solution](./data-structures/tree/112.java)|
| **226. Invert Binary Tree**| [Solution](./data-structures/tree/226.java)|
| **337. House Robber III**| [Backtrace Solution](./data-structures/tree/337.java), <br>[Solution with Explanation](https://leetcode.com/problems/house-robber-iii/discuss/79330/Step-by-step-tackling-of-the-problem)| DP memorization? or bottom to up backtrace?
| **404. Sum of Left Leaves**| [Solution](./data-structures/tree/404.java)|
| **437. Path Sum III**|[Solution](./data-structures/tree/437.java) |Brute force DFS
| **543. Diameter of Binary Tree**| [Solution](./data-structures/tree/543.java)|
| **572. Subtree of Another Tree**| [Solution](./data-structures/tree/572.java)|
| **617. Merge Two Binary Trees** | [Solution](./data-structures/tree/617.java) |
| **687. Longest Univalue Path** | [Solution](./data-structures/tree/687.java) |

```
Traversal:        1           
                /   \
               2     3       
             /   \ /   \     
            4    5 6    7    
In-order (Left, Root, Right): [4, 2, 5, 1, 3, 6, 7]
Pre-order (Root, Left, Right): [1, 2, 4, 5, 3, 6, 7]
Post-Order (Left, Right, Root): [4, 5, 2, 6, 7, 3, 1]
Level: [1, 2, 3, 4, 5, 6, 7]
```

| Questions | Solutions | Notes
| --- | --- | ---
| **94. Binary Tree Inorder Traversal**| [Solution](./data-structures/tree/94.java)|
| **144. Binary Tree Preorder Traversal**| [Solution](./data-structures/tree/144.java)|push right then left
| **145. Binary Tree Postorder Traversal**| [Solution](./data-structures/tree/145.java)|Iterate from top to bottom, result from back to front
| **513. Find Bottom Left Tree Value**| [Solution](./data-structures/tree/513.java)|level-traversal, right to left on each level
| **637. Average of Levels in Binary Tree**| [Solution](./data-structures/tree/637.java)|level-traversal

`Morris traversal`: an (in-order) tree traversal algorithm that does not employ the use of `recursion` or a `stack`, visit this [link](https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/) for details.

## Binary Search Tree (BST)

| Questions | Solutions | Notes
| --- | --- | ---
|**108. Convert Sorted Array to Binary Search Tree**|[Solution](./data-structures/bst/108.java)|divide and conquer
|**109. Convert Sorted List to Binary Search Tree**|[Solution](./data-structures/bst/109.java)|divide and conquer
|**230. Kth Smallest Element in a BST**|[Solution](./data-structures/bst/230.java)|Stack, In-Order Traversal
|**235. Lowest Common Ancestor of a Binary Search Tree**|[Solution](./data-structures/bst/235.java)|
|**236. Lowest Common Ancestor of a Binary Tree**|[Solution](./data-structures/bst/236.java)|
|**501. Find Mode in Binary Search Tree**|[Solution with Explanation](./data-structures/bst/501.java)|
|**530. Minimum Absolute Difference in BST**|[Solution](./data-structures/bst/530.java)|In-order traversal
|**538. Convert BST to Greater Tree**|[Solution](./data-structures/bst/538.java)|
|**653. Two Sum IV - Input is a BST**|[Solution](./data-structures/bst/653.java),<br>[Three Approaches with Explanation](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/discuss/106059/JavaC%2B%2B-Three-simple-methods-choose-one-you-like)|
|**669. Trim a Binary Search Tree**|[Solution](./data-structures/bst/669.java)|

## Trie

| Questions | Solutions | Notes
| --- | --- | ---
| **208. Implement Trie (Prefix Tree)** | [Solution](./data-structures/trie/208.java) |
| **677. Map Sum Pairs** | [Solution](./data-structures/trie/677.java) |

## Queue

| Questions | Solutions | Notes
| --- | --- | ---
| **232. Implement Queue using Stacks** | [Solution](./data-structures/queue/232.java) | use two stacks to reverse order


## Stack

## Hash Table

| Questions | Solutions | Notes
| --- | --- | ---
| **13. Roman to Integer** |[Solution](./data-structures/hash/13.java) | use a prev pointer to manage deduction
| **1630. Arithmetic Subarrays** | [Solution](./data-structures/hash/1630.java) |

> # Algorithm

## Two-Pointers

| Questions | Solutions | Notes
| --- | --- | ---
| **88. Merge Sorted Array**|[Solution](./algorithm/pointers/88.java)|
| **167. Two Sum II - Input Array Is Sorted**|[Solution](./algorithm/pointers/167.java)|

## Greedy

## Divide and Conquer (DC)

## Dynamic Programming (DP)

**Classical Problems:**

- [0/1 Knapsack Problem Graphical Explanation](https://leetcode.com/discuss/study-guide/1152328/01-Knapsack-Problem-and-Dynamic-Programming)
- 1143. Longest Common Subsequence

| Questions | Solutions | Notes
| --- | --- | ---
| **32. Longest Valid Parentheses** | [Solution](./algorithm/dp/32.java) | think as a stack, count left then compare
| **62. Unique Paths** | [Solution](./algorithm/dp/62.java), <br>[Graphical Explanation](https://leetcode.com/problems/unique-paths/discuss/405983/Easy-understand-Java-Solutions-with-Explanations-(DP-Top-down-Bottom-up-Linear-Space)) |
| **63. Unique Paths II** | [Solution](./algorithm/dp/63.java) |
| **120. Triangle** | [Solution](./algorithm/dp/120.java) | top-to-bottom memorization |
| **446. Arithmetic Slices II - Subsequence** | [Solution](./algorithm/dp/446.java), <br>[Graphical Explanation](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/discuss/1455658/C%2B%2BJavaPython-DP-with-Picture-explained-Clean-and-Concisev) | hashmap |
| **583. Delete Operation for Two Strings** | [Two Solutions](./algorithm/dp/583.java) | 1. find the longest common subsequence (1143), use two words' length minus it <br> 2. edit distance
| **647. Palindromic Substrings** | [Solution](./algorithm/dp/647.java)|
| **1143. Longest Common Subsequence**| [Solution](./algorithm/dp/1143.java), [Video Explanation](https://www.youtube.com/watch?v=NnD96abizww)|
| | |
| | |
| | |
| | |



**97. Interleaving String** -
[Graphical Explanation](https://leetcode.com/problems/interleaving-string/discuss/1468511/Simple-Explanation-for-Bottom-up-Approach-with-diagrams)

**1277. Count Square Submatrices with All Ones** -
[Graphical Explanation](https://leetcode.com/problems/count-square-submatrices-with-all-ones/discuss/643429/Python-DP-Solution-%2B-Thinking-Process-Diagrams-(O(mn)-runtime-O(1)-space))

## Sliding Window

What is sliding window? View this [link](https://stackoverflow.com/questions/8269916/what-is-sliding-window-algorithm-examples).

| Questions | Solutions | Notes
| --- | --- | ---
| **3. Longest Substring Without Repeating Characters** | [Solution](./algorithm/sliding-window/3.java), <br> [Solution with Explanation](https://leetcode.com/problems/longest-substring-without-repeating-characters/discuss/1014921/SLIDING-WINDOW-oror-O(n)-oror-Faster-than-90-and-Memory-usage-less-than-100) |
| **1461. Check If a String Contains All Binary Codes of Size K** | [Solution](./algorithm/sliding-window/1461.java) | Hashset |
| **1658. Minimum Operations to Reduce X to Zero**| [Solution](./algorithm/sliding-window/1658.java), <br>[Solution with Explanation](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/discuss/2136555/C%2B%2BPython-Simple-Solution-w-Explanation-or-Sliding-Window)|
| **1695. Maximum Erasure Value** | [Solution](./algorithm/sliding-window/1695.java)| Hashset

## Backtracking

| Questions | Solutions | Notes
| --- | --- | ---
| **51. N-Queens (Hard)** | [Solution](./algorithm/backtracking/51.java), <br>[Graphical and Video Explanation](http://zxi.mytechroad.com/blog/searching/leetcode-51-n-queens/) |  Use boolean list to record diagnals
| **52. N-Queens II (Hard)** | [Solution](./algorithm/backtracking/52.java) | Different from 51, we do not actually place Queen. We only record the column availability instead

## Binary-Search

| Questions | Solutions | Notes
| --- | --- | ---
| **300. Longest Increasing Subsequence**| [Solution](./algorithm/binary-search/300.java), <br>[Video Explanation](https://www.youtube.com/watch?v=l2rCz7skAlk), <br>[Solution with Explanation](https://leetcode.com/problems/longest-increasing-subsequence/discuss/74824/JavaPython-Binary-search-O(nlogn)-time-with-explanation)|DP & Greedy & Binary-Search
| **354. Russian Doll Envelopes (Hard)** | [Solution](./algorithm/binary-search/354.java), <br> [Solution with Explanation](https://leetcode.com/problems/russian-doll-envelopes/discuss/82763/Java-NLogN-Solution-with-Explanation) | Similar to 300. Longest Increasing Subsequence

> # Others

## Bit Manipulation

|  | Operators | Lemmas
| --- | --- | --- 
| 1 | ^ | a ^ b ^ b == a
| 2 | << | a << n == a * 2^n
| 3 | >> | a >> n == a * 2^n

| Questions | Solutions | Notes
| --- | --- | ---
| **29. Divide Two Integers** | [Solution](./others/bit/29.java), <br>[Solution with Explanation](https://leetcode.com/problems/divide-two-integers/discuss/1327339/Java-or-0ms-or-100-faster-or-Obeys-all-conditions) | This question sucks, use Lemma 2 & 3
| **191. Number of 1 Bits** | [Solution](./others/bit/191.java), <br>[Solution with Explanation](https://leetcode.com/problems/number-of-1-bits/discuss/55099/Simple-Java-Solution-Bit-Shifting) | Bit shift
| **268. Missing Number** | [Math, XOR Solutions](./others/bit/268.java), <br>[XOR Solution with Explanation](https://leetcode.com/problems/missing-number/discuss/69791/4-Line-Simple-Java-Bit-Manipulate-Solution-with-Explaination) | Lemma 1
| **318. Maximum Product of Word Lengths** | [Solution](./others/bit/318.java), <br>[Bit Mask Solution with Explanation](https://leetcode.com/problems/maximum-product-of-word-lengths/discuss/1212054/Java-beats-100-with-Explanation) |
| **1342. Number of Steps to Reduce a Number to Zero** | [Recursion, Bit Manipulation Solutions](./others/bit/1342.java) |

## Others

| Questions | Solutions | Notes
| --- | --- | ---
| **304. Range Sum Query 2D - Immutable** | [Solution](./others/others/304.java) |  dp, prefix-sum
| **867. Transpose Matrix** | [Solution](./others/others/867.java)
| **1480. Running Sum of 1d Array** | [Solution](./others/others/1480.java) | prefix-sum

## Not Recommended

Wired questions that I do not recommend. But summarised some worth to know details.

| Questions | Solutions | Topic | Notes
| --- | --- | --- | ---
| **671. Second Minimum Node In a Binary Tree** | [Solution](./data-structures/tree/671.java) | Tree | This questions refers to a special tree that each node has exactly `two` or `zero` sub-node. 
| **1332. Remove Palindromic Subsequences** | [Solution](./algorithm/pointers/1332.java), [Solution with Explanation](https://leetcode.com/problems/remove-palindromic-subsequences/discuss/490303/JavaC%2B%2BPython-Maximum-2-Operations) | Two-Pointers | Subarray vs Subsequence: Subarray need to be consecutive, Subsequence don't have to be consecutive.


> # References

- LeetCode
- https://github.com/CyC2018/cs-notes