# 深度优先搜索和广度优先搜索



## DFS



+ 递归写法

```python
visited = set() defdfs(node, visited):   visited.add(node)  # process current node here. ...for next_node in node.children():  ifnot next_node in visited:     dfs(next node, visited)
```



+ 非递归写法

```python
defDFS(self, tree):  if tree.root is None:  return []   visited, stack = [], [tree.root] while stack:    node = stack.pop()    visited.add(node)   process (node)    nodes = generate_related_nodes(node)    stack.push(nodes)  # other processing work ...

```





## BFS



```python
defBFS(graph, start, end):  queue = []   queue.append([start])   visited.add(start) while queue:    node = queue.pop()    visited.add(node)   process(node)    nodes = generate_related_nodes(node)    queue.push(nodes) 

```







# 第9课 深度优先搜索和广度优先搜索



## DFS代码模板



### 递归写法

```java
//Java
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> allResults = new ArrayList<>();
        if(root==null){
            return allResults;
        }
        travel(root,0,allResults);
        return allResults;
    }


    private void travel(TreeNode root,int level,List<List<Integer>> results){
        if(results.size()==level){
            results.add(new ArrayList<>());
        }
        results.get(level).add(root.val);
        if(root.left!=null){
            travel(root.left,level+1,results);
        }
        if(root.right!=null){
            travel(root.right,level+1,results);
        }
    }
```









## BFS代码模板

```java
//Java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> allResults = new ArrayList<>();
    if (root == null) {
        return allResults;
    }
    Queue<TreeNode> nodes = new LinkedList<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
        int size = nodes.size();
        List<Integer> results = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            TreeNode node = nodes.poll();
            results.add(node.val);
            if (node.left != null) {
                nodes.add(node.left);
            }
            if (node.right != null) {
                nodes.add(node.right);
            }
        }
        allResults.add(results);
    }
    return allResults;
}
```













# 第10课 贪心算法



对每个子问题都做出选择，不能回退；

而动态规划会保存以前的结果，根据以前的结果进行选择，可以回退。



贪心：当下做局部最优判断

回溯：能够回退

动态规划：最优判断+回退







递归，分治，回溯，贪心，动态规划



难点：如何知道用贪心？