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