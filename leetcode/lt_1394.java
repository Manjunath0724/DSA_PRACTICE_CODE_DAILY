package leetcode;

public class lt_1394 {
    public int findLucky(int[] arr) {
        // int[] count=new int[501];
        // int max=-1;

        // for(int i=0;i<arr.length;i++){
        //     count[arr[i]]++;
        // }
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]==count[arr[i]]){
        //         max=Math.max(max,arr[i]);
        //     }
        // }
        // return max;

        int count[]=new int[501];
        int ans=-1;
        for(int num:arr){
            count[num]++;
        }
        for(int i=1;i<=500;i++){
            if(count[i]==i){
                ans=i;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        lt_1394 sol = new lt_1394();
        int[] arr = { 1, 1, 1, 3 };
        int result = sol.findLucky(arr);
        System.out.println(result);
    }
}
