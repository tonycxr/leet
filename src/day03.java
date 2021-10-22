import java.util.*;

/**
 * 给定一个大小为n的整数数组，找出其中所有出现超过⌊ n/3 ⌋次的元素。
 *
 * 示例1：
 *
 * 输入：[3,2,3]
 * 输出：[3]
 * 示例 2：
 *
 * 输入：nums = [1]
 * 输出：[1]
 * 示例 3：
 *
 * 输入：[1,1,1,3,3,2,2,2]
 * 输出：[1,2]
 *
 *
 */

public class day03 {
    public static List<Integer> majorityElement(int[] nums) {
        int number = nums.length/3;
        Map<Integer,Integer> map = new LinkedHashMap<>();
        List<Integer> tar = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0) + 1);
            //新方法。没有就初始为0，有就+1;
            //大大减少了时间，空间复杂度
//            for(int j=0;j<nums.length;j++){
//                if(nums[j]==nums[i]){
//                    if(j<i){
//                        break;
//                    }else if(j==i){
//                        map.put(nums[i],1);
//                    }else
//                    {
//                        map.put(nums[i],map.get(nums[i])+1);
//                        continue;
//                    }
//                }
//            }
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue()>number)
            {
                tar.add(entry.getKey());
            }
        }
        return tar;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,3,6,6,2,3};
        List<Integer> list = majorityElement(nums);
        System.out.println(list.toString());
    }

}
