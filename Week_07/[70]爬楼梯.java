    //假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        if(n <= 1) dp[n] = 1;
        int[] dp = new int[n+1];
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp(i-2);
        }
        return dp[n];



    }     //因为会用到memo[n]，所以数组的个数为n+1
//        int memo[] = new int[n+1];
//        return climbStairsMemo(n, memo);
//    }
//
//    private int climbStairsMemo(int n, int[] memo) {
          //保存每个结点的结果，如果有保存的就可以直接return，没有保存的进入下面计算。
//        if(memo[n] > 0) return memo[n];
//        if(n == 1) return 1;
//        if(n == 2) return 2;
//        memo[n] = climbStairsMemo(n-1,memo) + climbStairsMemo(n-2,memo);
//        return memo[n];
//    }








////记忆化递归(自底向上)
//        //1. 定义一个长度为n+1的数组，保存每阶的走法数
//        int[] memo = new int[n + 1];
//        //传入开始阶，结束阶，缓存数组，开始递归调用
//        climb_Stairs(0,n,memo);
//    }
//    //2.重新定义一个方法,用于递归调用
//    private climb_Stairs(int i,int n, int[] memo) {
//        //terminator
//        //为什么不是i >= 0都是返回0呢？
//        //为什么是c(i) = c(i+1) + c(i+2)呢？
//        if (i > n) return 0;
//        if (i = n) return 1;
//        if (memo[i] > 0) return memo[i];
//        //process current logic
//
//        //drill down
//        memo[i] = climb_Stairs(i + 1,n,memo) + climb_Stairs(i + 2,n,memo);
//        //restore current status
//        return memo[i];
//    }

////斐波拉契数(自顶向下) 滚动数组的思想
//        if (n <= 0) return 0;
//        if (n = 1) return 1;
//        if (n = 2) return 2;
//
//        int one_step_before = 2;
//        int two_step_before = 1;
//        int all_ways = 0;
//        //为什么起始值是2呢？
//        for (int i = 2; i < n; i++) {
//        all_ways = one_step_before + two_step_before;
//        two_step_before = one_step_before;
//        one_step_before = all_ways;
//        }
//        return all_ways;

}
//leetcode submit region end(Prohibit modification and deletion)


/*
1.审题
每次爬1或2个台阶。
从特殊到一般的过程？
用什么数据结构呢？
用什么算法呢？

2.思考
记忆化递归
突然无法理解了，，先背下来再反复理解。

3.优化
动态规划

斐波拉契数
突然也有无法理解的地方了，先背下来再说。。

4.反思
看别人写的，试图理解，似乎理解了，但是自己写的时候又不知道某些步的写法。为什么这样写？而不是那样写？
逆向反向思考，反复思考，才能真正明白设计者的意图。只有自己写的时候能完美复制设计者的思想然后写出来才算真正理解。

 */