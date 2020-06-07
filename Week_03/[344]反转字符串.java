//编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。 
//
// 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。 
//
// 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。 
//
// 
//
// 示例 1： 
//
// 输入：["h","e","l","l","o"]
//输出：["o","l","l","e","h"]
// 
//
// 示例 2： 
//
// 输入：["H","a","n","n","a","h"]
//输出：["h","a","n","n","a","H"] 
// Related Topics 双指针 字符串


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void reverseString(char[] s) {
        //这种遍历方法是不对的，遍历N次
        // int j = 0;
        // for (int i = s.length - 1; i >= 0; i--) {
        //     s [j++] = s [i];
        // }

        //还是数组元素所在的地址改变了，s[i]保存的是第i位元素的地址
//        for (int i = 0,j = s.length - 1; i < j; i++,j--) {
//            char temp = s[i];
//            s[i] = s[j];
//            s[j] = temp;
//        }
//        int left = 0;
//        int right = s.length - 1;
//        while (left < right) {
//            char temp = s[left];
//            s[left++] = s[right];
//            s[right--] = temp;
//        }

        swap(s,0,s.length - 1);
    }

    private void swap(char[] s, int left, int right) {
        if (left > right) return;
        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        swap(s,left + 1,right - 1);
    }
}

/*
1. 审题
反转字符串，实际就是交换2/N次

2. 思考
数据结构：数组
算法：双指针法，迭代(for/while循环)


3.优化
递归：因为使用递归而使用的递归调用栈，这个属于额外空间吗？
递归似乎不如迭代优秀。

4. 反思
不管是循环还是递归，都是一种重复操作的手段，重复的内容是一样的，都是swap
 */
//leetcode submit region end(Prohibit modification and deletion)
