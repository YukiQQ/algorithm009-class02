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

