def write_intro(f):
    s = """> # Algorithm Practice Notes

Hi, this is Xizheng Yu. This is my note of solutions of classical algorithm and data structure problems. You can find solution files written in Java in my repository. All solutions are written by myself and references (solution links) are from public sources include YouTube, LeetCode Community, Geekforgeeks etc., which are organized on the main page. Feel free to reach out if you have any question.

To find those questions, access this [link](https://leetcode.com/problemset/all/) and search the question number listed below.

Questions has been seperated into 2 types: 
- **Bold** Questions: Clssical Question to practice for each category.
- Normal Questions: Additional Question for more practices.\n\n"""
    f.write(s)

def write_link(f):
    s = """
In-page Hyperlinks:
* [Data Structures](#data-structure)
    * [LinkedList](#linkedlist)
    * [Tree](#tree)
    * [BST](#binary-search-tree-bst)
    * [Trie](#trie)
    * [Queue](#queue)
    * [Stack](#stack)
    * [HashTable](#hashtable)
    * [Graph](#graph)
    * [Priority Queue](#priority-queue)
* [Algorithms](#algorithm)
    * [Two-Pointers](#two-pointers)
    * [Sort](#sort)
    * [Greedy](#greedy)
    * [Divide and Conquer (DC)](#divide-and-conquer-dc)
    * [Dynamic Programming (DP)](#dynamic-programming-dp)
    * [Sliding Window](#sliding-window)
    * [Backtrace](#backtrace)
    * [Binary-Search](#binary-search)
* [Others](#others)
    * [Bit Manipulation](#bit-manipulation)
    * [String](#string)
    * [Math](#math)
    * [Other](#others-1)\n\n"""
    f.write(s)

def write_tree(f, tag):
    if tag == "tree":
            f.write("""```
Traversal:        1           
                /   \\
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
| **637. Average of Levels in Binary Tree** | [Solution](./data-structures/tree/637.java)| level-traversal
| **513. Find Bottom Left Tree Value** | [Solution](./data-structures/tree/513.java)|level-traversal, right to left on each level
| **144. Binary Tree Preorder Traversal** | [Solution](./data-structures/tree/144.java)|push right then left
| **94. Binary Tree Inorder Traversal** | [Solution](./data-structures/tree/94.java)|
| **145. Binary Tree Postorder Traversal** | [Solution](./data-structures/tree/145.java)|Iterate from top to bottom, result from back to front

`Morris traversal`: an (in-order) tree traversal algorithm that does not employ the use of `recursion` or a `stack`, visit this [link](https://www.geeksforgeeks.org/inorder-tree-traversal-without-recursion-and-without-stack/) for details
\n""")

def write_special(f, tag):

    if tag == "graph":
            f.write("""Graph Theories:
- Search
    - **Breath-First Search (BFS)** - [Video Explanation](https://www.youtube.com/watch?v=oDqjPvD54Ss)
    - **Depth-First Search (DFS)** - [Video Explanation](https://www.youtube.com/watch?v=7fujbpJ0LB4)
- Shortest Path
    - **Dijkstra's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=pSqmAO-m7Lk&t=784s)
    - **Bellman Ford Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=lyw4FaxrwHg)
- Topological Sort
    - **Kahn's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=cIBFEhD77b4)
- Strongly Connected Components
    - **Tarjan's Strongly Connected Component (SCC) Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=wUgWX0nc4NY&t=2s)
- Union and Find
    - **Disjoint Union and Find** - [Video Explanation](https://www.youtube.com/watch?v=0jNmHPfA_yE)
- Minimum Spanning Tree
    - **Prim's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=jsmMtJpPnhU&t=2s)
    - **Kruskal's Algorithm** - [Video Explanation](https://www.youtube.com/watch?v=JZBQLXgSGfs) - Union and Find application
- Network Flow
    - **Ford-Fulkerson Algorithm** - Maximum Flow - [Video Explanation](https://www.youtube.com/watch?v=LdOnanfc5TM), [Java Code](https://gist.githubusercontent.com/thmain/2d475da99d1b794e8cfb9eae5f4e0a11/raw/e5114963f06621a79a8662682c3f6172e766a7fa/MaxFlow_Ford_Fulkerson.java)
    - **Bipartite Matching** - 
\n""")

    if tag == "sort":
        f.write("""QuickSort
- [QuickSelect](https://leetcode.com/problems/kth-largest-element-in-an-array/discuss/2180600/A-Guide-to-Quick-Select-or-JAVA)
- [Hoare’s vs Lomuto partition scheme in QuickSort](https://www.geeksforgeeks.org/hoares-vs-lomuto-partition-scheme-quicksort/)
\n""")

    if tag == "greedy":  
        f.write("\"Local Optimal is Global Optimal\"\n\n")

    if tag == "sliding-window":
        f.write("""What is sliding window? View this [link](https://stackoverflow.com/questions/8269916/what-is-sliding-window-algorithm-examples).
\n""")

    if tag == "bit":
        f.write("""|  | Operators | Lemmas
| --- | --- | --- 
| 1 | ^ | a ^ b ^ b == a
| 2 | << | a << n == a * 2^n
| 3 | >> | a >> n == a * 2^n
\n""")