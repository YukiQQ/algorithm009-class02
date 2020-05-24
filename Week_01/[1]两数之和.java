//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。 
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。 
//
// 
//
// 示例: 
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
// 
// Related Topics 数组 哈希表


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length;j++) {
                if (nums[i] + nums[j] == target) {
                    //result = {i,j}; 数组的元素不可以是变量吗？
                    //result = new int[] { i, j }; 这样写为啥可以了呢？
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        //如果没有这句，会报错
        throw new IllegalArgumentException("No two sum solution");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

//审题
//1. 如何理解"每种输入只会对应一个答案？"

//2. 如何理解"数组中同一个元素不能使用两遍"？
//比如，nums = [2,3,1],target = 4
// [2,2] [3,1]只能返回[3,1]