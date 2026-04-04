package leetcode;

public class lt_2798 {
 
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int ans = 0;
        for (int h : hours) {
            if (h >= target) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        lt_2798 s = new lt_2798();
        int[] hours = {0,1,2,3,4};
        int target = 2;
        System.out.println(s.numberOfEmployeesWhoMetTarget(hours, target));
        
    }
}

