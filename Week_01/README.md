# 1. 时间复杂度和空间复杂度

## Big O notation

O(1): Constant Complexity 常数复杂度

O(log n): Logarithmic Complexity 对数复杂度 

O(n): Linear Complexity 线性时间复杂度 

O(n^2): N square Complexity 平方

 O(n^3): N cubic Complexity 立方

O(2^n): Exponential Growth 指数

O(n!): Factorial 阶乘

**注意**:只看最高复杂度的运算;考察代码执行的次数。



### O(1) 

```java
int n = 1000;
System.out.println("Hey - your input is: " + n);
```



### O(?)

```java
int n = 1000;
System.out.println("Hey - your input is: " + n); 
System.out.println("Hmm.. I'm doing more stuff with: " + n); 
System.out.println("And more: " + n);
```



### O(N) 

```java
for (int i = 1; i <= n; i++) {
    System.out.println("Hey - I'm busy looking at: " + i); 
}
```



### O(N^2)

```java
for (int i = 1; i <= n; i++) { 
    for (int j = 1; j <=n; j++) {
        System.out.println("Hey - I'm busy looking at: " + i + " and " + j);
    }
}
```



### O(log(n))

```java
for (int i = 1; i < n; i = i * 2) {
    System.out.println("Hey - I'm busy looking at: " + i);
}
```



### O(k^n)

```java
int fib(int n) {
    if (n < 2) return n;
    return fib(n - 1) + fib(n - 2);
}
```



## 时间复杂度曲线



![Screen Shot 2020-05-24 at 10.39.17 PM](/Users/yuki/Desktop/Screen Shot 2020-05-24 at 10.39.17 PM.png)



# 2.存储结构

## 数组——顺序存储



#### 结构

![array](https://media.geeksforgeeks.org/wp-content/uploads/array-2.png)

#### 代码实现



#### 时间/空间复杂度

|         | 时间复杂度 |
| ------- | ---------- |
| prepend | O(1)       |
| append  | O(1)       |
| lookup  | O(1)       |
| insert  | O(n)       |
| delete  | O(n)       |

 

#### 应用

1. Leetcode

https://leetcode-cn.com/problems/two-sum/

https://leetcode-cn.com/problems/add-two-numbers/

https://leetcode-cn.com/problems/container-with-most-water/

https://leetcode-cn.com/problems/3sum/

https://leetcode-cn.com/problems/move-zeroes/

2. 常用思路

暴力法

枚举

左右边界，向中间收敛

双指针

## 链表——链式存储



#### 结构

![Linkedlist](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png)

#### 代码实现

```java
// A simple Java program to introduce a linked list 
class LinkedList { 
	Node head; // head of list 

	/* Linked list Node. This inner class is made static so that 
	main() can access it */
	static class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} // Constructor 
	} 

	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		LinkedList llist = new LinkedList(); 

		llist.head = new Node(1); 
		Node second = new Node(2); 
		Node third = new Node(3); 

		/* Three nodes have been allocated dynamically. 
		We have references to these three blocks as head, 
		second and third 

		llist.head	 second			 third 
			|			 |				 | 
			|			 |				 | 
		+----+------+	 +----+------+	 +----+------+ 
		| 1 | null |	 | 2 | null |	 | 3 | null | 
		+----+------+	 +----+------+	 +----+------+ */

		llist.head.next = second; // Link first node with the second node 

		/* Now next of the first Node refers to the second. So they 
			both are linked. 

		llist.head	 second			 third 
			|			 |				 | 
			|			 |				 | 
		+----+------+	 +----+------+	 +----+------+ 
		| 1 | o-------->| 2 | null |	 | 3 | null | 
		+----+------+	 +----+------+	 +----+------+ */

		second.next = third; // Link second node with the third node 

		/* Now next of the second Node refers to third. So all three 
			nodes are linked. 

		llist.head	 second			 third 
			|			 |				 | 
			|			 |				 | 
		+----+------+	 +----+------+	 +----+------+ 
		| 1 | o-------->| 2 | o-------->| 3 | null | 
		+----+------+	 +----+------+	 +----+------+ */
	} 
} 

```



#### 时间/空间复杂度

|         | 时间复杂度 |
| ------- | ---------- |
| prepend | O(1)       |
| append  | O(1)       |
| lookup  | O(n)       |
| insert  | O(1)       |
| delete  | O(1)       |

 

#### 应用

1. Leetcode

https://leetcode-cn.com/problems/reverse-linked-list/

2. 常用思路

暴力法

Iterative

# 3.逻辑结构



## 3.1 线性结构



### 1. 栈

#### 结构

+ Stack

![stack](https://www.geeksforgeeks.org/wp-content/uploads/gq/2013/03/stack.png)





#### 代码实现

+ Stack

```java
/* Java program to implement basic stack 
operations */
class Stack { 
	static final int MAX = 1000; 
	int top; 
	int a[] = new int[MAX]; // Maximum size of Stack 

	boolean isEmpty() 
	{ 
		return (top < 0); 
	} 
	Stack() 
	{ 
		top = -1; 
	} 

	boolean push(int x) 
	{ 
		if (top >= (MAX - 1)) { 
			System.out.println("Stack Overflow"); 
			return false; 
		} 
		else { 
			a[++top] = x; 
			System.out.println(x + " pushed into stack"); 
			return true; 
		} 
	} 

	int pop() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top--]; 
			return x; 
		} 
	} 

	int peek() 
	{ 
		if (top < 0) { 
			System.out.println("Stack Underflow"); 
			return 0; 
		} 
		else { 
			int x = a[top]; 
			return x; 
		} 
	} 
} 

// Driver code 
class Main { 
	public static void main(String args[]) 
	{ 
		Stack s = new Stack(); 
		s.push(10); 
		s.push(20); 
		s.push(30); 
		System.out.println(s.pop() + " Popped from stack"); 
	} 
} 

```



#### 时间/空间复杂度



#### 应用



### 2. 队列



#### 结构



+ Queue

![Queue](https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2014/02/Queue.png)

+ Deque



+ Priority Queue



#### 代码实现

+ Queue

```java
// Java program for array implementation of queue 

// A class to represent a queue 
class Queue 
{ 
	int front, rear, size; 
	int capacity; 
	int array[]; 
	
	public Queue(int capacity) { 
		this.capacity = capacity; 
		front = this.size = 0; 
		rear = capacity - 1; 
		array = new int[this.capacity]; 
			
	} 
	
	// Queue is full when size becomes equal to 
	// the capacity 
	boolean isFull(Queue queue) 
	{ return (queue.size == queue.capacity); 
	} 
	
	// Queue is empty when size is 0 
	boolean isEmpty(Queue queue) 
	{ return (queue.size == 0); } 
	
	// Method to add an item to the queue. 
	// It changes rear and size 
	void enqueue( int item) 
	{ 
		if (isFull(this)) 
			return; 
		this.rear = (this.rear + 1)%this.capacity; 
		this.array[this.rear] = item; 
		this.size = this.size + 1; 
		System.out.println(item+ " enqueued to queue"); 
	} 
	
	// Method to remove an item from queue. 
	// It changes front and size 
	int dequeue() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 
		
		int item = this.array[this.front]; 
		this.front = (this.front + 1)%this.capacity; 
		this.size = this.size - 1; 
		return item; 
	} 
	
	// Method to get front of queue 
	int front() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 
		
		return this.array[this.front]; 
	} 
		
	// Method to get rear of queue 
	int rear() 
	{ 
		if (isEmpty(this)) 
			return Integer.MIN_VALUE; 
		
		return this.array[this.rear]; 
	} 
} 

	
// Driver class 
public class Test 
{ 
	public static void main(String[] args) 
	{ 
		Queue queue = new Queue(1000); 
			
		queue.enqueue(10); 
		queue.enqueue(20); 
		queue.enqueue(30); 
		queue.enqueue(40); 
		
		System.out.println(queue.dequeue() + 
					" dequeued from queue\n"); 
		
		System.out.println("Front item is " + 
							queue.front()); 
		
		System.out.println("Rear item is " + 
								queue.rear()); 
	} 
} 

// This code is contributed by Gaurav Miglani 

```



#### 时间/空间复杂度



#### 应用