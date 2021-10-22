/**
 * 给你一个长度为 n 的整数数组，每次操作将会使 n - 1 个元素增加 1 。返回让数组所有元素相等的最小操作次数。
 *
 *  
 *
 * 示例 1：
 * 输入：nums = [1,2,3]
 * 输出：3
 * 解释：
 * 只需要3次操作（注意每次操作会增加两个元素的值）：
 * [1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
 * 示例 2：
 *
 * 输入：nums = [1,1,1]
 * 输出：0
 *
 *
 */

public class day01 {
    public static int minMoves(int[] nums){
        int l = nums.length;
        if(l==0 || nums==null){
            return 0;
        }
        int min = nums[0];
        int sum=0;
        for(int num:nums){
            if(min>num){
                min = num;
            }
        }
        for(int num:nums){
            sum += num-min;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] test = new int[]{3,5,7};
        int i = minMoves(test);
        System.out.println(i);
    }
}
