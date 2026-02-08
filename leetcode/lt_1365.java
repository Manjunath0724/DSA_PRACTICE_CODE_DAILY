package leetcode;

public class lt_1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        //Brute force time:o(n^2)
        // int[] arr=new int[nums.length];
        // for(int i=0;i<nums.length;i++){
        //     int input=0;
        //     for(int j=0;j<nums.length;j++){
        //         if(nums[i]>nums[j]){
        //             input++;
        //         }
        //     }
        //     arr[i]=input;
        // }
        // return arr;

        //-----------------------------------------------------------------------------
    
        int[] allNums = new int[101];

        int[] res = new int[nums.length];
        
        for(int num:nums){
            allNums[num]++;
        }
        for (int i = 1; i < 101; i++) {
            allNums[i] += allNums[i - 1];
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
       
                res[i] = 0;
            } else {
         
                res[i] = allNums[nums[i] - 1];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        lt_1365 sol = new lt_1365();
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] result = sol.smallerNumbersThanCurrent(nums);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
