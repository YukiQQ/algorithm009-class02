# 前言



首先，你要知道这个数据结构用代码如何表示？基本的CRUD如何实现？每个元素如何遍历？

其次，通过各种应用题来学会灵活运用！应用很重要！

理论不明白的时候，多做几道应用题，因为理论来源于实践，是实践的抽象总结。拼命理解理论是错误的，实在理解不了就死记硬背，在以后的实践中不断去理解。

但是如果理论不扎实，应用起来就比较困难，找不到方向。

如何做到理论和实践相结合？

![](/Users/yuki/Documents/数据结构和算法/Algo/Week02/Data Structure.png)



# 散列表



## 定义

【组成】

Keys,hash function,hash code,hash table

![hashtable](https://upload.wikimedia.org/wikipedia/commons/thumb/7/7d/Hash_table_3_1_1_0_1_0_0_SP.svg/630px-Hash_table_3_1_1_0_1_0_0_SP.svg.png)

### References

https://www.geeksforgeeks.org/hashing-data-structure/

https://www.geeksforgeeks.org/hashing-set-1-introduction/

https://www.geeksforgeeks.org/hashing-set-2-separate-chaining/?ref=rp

https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/



## Java 常用数据结构

+ Map

HashMap

TreeMap



+ Set

HashSet: unsorted

TreeSet:sorted



### References

https://www.geeksforgeeks.org/hashing-in-java/

https://www.geeksforgeeks.org/hashset-in-java/

https://www.geeksforgeeks.org/hashtable-in-java/

https://www.geeksforgeeks.org/hashmap-treemap-java/



# 树、二叉树、二叉搜索树

+ 定义

A tree whose elements have *at most 2 children* is called a binary tree.



+ 应用场景

**Why Trees?**
**1.** One reason to use trees might be because you want to store information that naturally forms a hierarchy. For example, the file system on a computer:





+ 描述树的代码模板

A Tree node contains following parts.
\1. Data
\2. Pointer to left child
\3. Pointer to right child

```java
/* Class containing left and right child of current 
node and key value*/
class Node 
{ 
	int key; 
	Node left, right; 

	public Node(int item) 
	{ 
		key = item; 
		left = right = null; 
	} 
} 

```





## 二叉树遍历 Pre-order/In-order/Post-order

1.前序（Pre-order）：根-左-右 

2.中序（In-order）：左-根-右 

3.后序（Post-order）：左-右-根



+ 代码模板

https://towardsdatascience.com/4-types-of-tree-traversal-algorithms-d56328450846







## Implementation

见代码。

## Application



写循环麻烦，写递归调用简单。



树的面试题都是递归，为什么？

如何理解递归？





# Heap



## 定义

a *special Tree-based* data structure in which the tree is *a complete binary tree*.

Heaps can be of two types:

**Max-Heap**

**Min-Heap**

![Heap Data Structure](https://www.geeksforgeeks.org/wp-content/uploads/MinHeapAndMaxHeap.png)



## Binary Heap



### Representation



A Binary Heap is a Complete Binary Tree. A binary heap is typically represented as an array.

- The root element will be at Arr[0].

- Below table shows indexes of other nodes for the i node, i.e., Arr[i]:

  | Arr[(i-1)/2] | Returns the parent node      |
  | ------------ | ---------------------------- |
  | Arr[(2*i)+1] | Returns the left child node  |
  | Arr[(2*i)+2] | Returns the right child node |



The traversal method use to achieve Array representation is **Level Order**:

![binaryheap](https://www.geeksforgeeks.org/wp-content/uploads/binaryheap.png)

### Implementation

再反复看BinaryHeap的实现！！！



### Application