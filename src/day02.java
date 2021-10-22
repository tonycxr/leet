/**
 *
 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。

 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。

 示例 1：

 输入：digits = [1,2,3]
 输出：[1,2,4]
 解释：输入数组表示数字 123。
 示例 2：

 输入：digits = [4,3,2,1]
 输出：[4,3,2,2]
 解释：输入数组表示数字 4321。
 *
 *
 *
 */

public class day02 {
//    public static int[] addOne(int[] nums){
//        String value = "";
//        for(int num:nums){
//            value += num;
//        }
//        long target = Long.parseLong(value)+1;
//        String targetString = String.valueOf(target);
//        int[] ints = new int[targetString.length()];
//        for(int i=0;i<ints.length;i++){
//            ints[i] = targetString.charAt(i)-48;
//            System.out.println(ints[i]);
//        }
//        return ints;
//    }
    public static int[] addOneEnhanced(int[] digits){
        for(int i=digits.length;i>0;i--){
            if(digits[i-1]!=9){
//                digits[i-1]+=1;
//              可以用++替代+=1
                digits[i-1]++;
                return digits;
            }else if (digits[0]==9 && i==0){
                int[] ints = new int[digits.length + 1];
                ints[0] = 1;
//                for(int j=1;j<ints.length;j++){
//                    ints[j] = 0;
//                }
                //不用设为0，默认值都是0
                return ints;
            }
//            else{
//这个else可以去掉
                digits[i-1] = 0;
//            }

            }return null;
        }


    public static void main(String[] args) {
        addOneEnhanced(new int[]{9});
    }
}
