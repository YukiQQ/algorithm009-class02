# 第7课 泛型递归、树的递归

递归本质上也是循环，是用函数体来进行的循环。

递归和调用栈

```java
Java 代码模版
public void recur(int level,int param) {
// terminator  
if(level > MAX_LEVEL) {
// process result      
        return;
}

// process current logic    
process(level, param);

// drill down    
recur( level: level +1, newParam);

// restore current status  
}

```





1. 不要人肉进行递归（最大误区） 
2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题） 
3. 数学归纳法思维



# 第8课 分治、回溯



## 回溯核心框架

**我们只要在递归之前做出选择，在递归之后撤销刚才的选择**，就能正确得到每个节点的选择列表和路径。

```java
for 选择 in 选择列表:
    # 做选择
    将该选择从选择列表移除
    路径.add(选择)
    backtrack(路径, 选择列表)
    # 撤销选择
    路径.remove(选择)
    将该选择再加入选择列表
```



**【回溯 vs 递归】**

回溯需要穷举整棵决策树，时间复杂度不低于O(N!)，是纯暴力穷举;

动态规划存在重叠子问题可以优化。















