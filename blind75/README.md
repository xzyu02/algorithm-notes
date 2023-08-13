# Notes

- 2: dummy node, iteration both l1 l2, record carry from mode
- 19: dummy -> 0 -> 1 -> 2 ... -> 5, left pointer starts from dummy, right pointer from head move n step, then shift both left and right points until right is None
- 36: dumb question. 3 hashset brute force
- 43: O(n) array of left max vals and right max vals, and then get array of minimial vals, use this as constrints to minus each height, O(1) l and r ptrs, build a virtual wall, move pointer with smaller max val only
- 138: two pass, use hashmap, oldnode as key, cpy node as val, cpy node does not connect at all at first iter, connect in second iter
- 143: slow fast find mid, reverse second half, merge
- 167: squzze both sides, whenever sum is larger, squzze right, otherwise left
- 287: multiple nodes point to a same node (duplicated number), then this node will be the start of the cycle. We can just turn this question to a cycle start detection. Floyd's Algorithm: slow fast pointers, first intersection, then create another slow pointer 2. slow 2 and slow1 move at the same time and then they intersect.
