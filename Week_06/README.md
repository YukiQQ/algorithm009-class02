# 动态规划



1. 递归

```java
public void recur(int level,int param) {
if(level > MAX) {
    return;
}
//process current status
process(level,param);
//*drill down*(key code)
recur(level + 1,param);

//restore current status

}
```



分治

回溯





4. 动态规划

本质上是“分治”，共性是找到重复子问题，不同的是动态规划需要找到最优子结构。复杂度从指数级降到多项式。

动态递推，自底向上，for循环；

递归，自顶向下。





## 解题套路框架

+ 状态转移方程思维框架

**明确 base case -> 明确「状态」-> 明确「选择」 -> 定义 dp 数组/函数的含义**。



+ 解法

基础：暴力递归

进阶：带备忘录的递归(自顶向下)

终极：dp数组迭代(自底向上)



## 经典例题



### 斐波那契数列





### 凑零钱问题





