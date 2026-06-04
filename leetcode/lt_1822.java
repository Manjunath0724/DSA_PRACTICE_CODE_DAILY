package leetcode;

public class lt_1822 {

    public int arraySign(int[] nums) {
        int sign = 1;
        for (int num : nums) {
            if (num == 0) {
                return 0;
            } else if (num < 0) {
                sign = -sign;
            }
        }
        return sign;
    }

public static void main(String[] args) {
    lt_1822 lt = new lt_1822();
    System.out.println(lt.arraySign(new int[] {-1,-2,-3}));
    System.out.println(lt.arraySign(new int[] {1,5,0,2,-3}));
    System.out.println(lt.arraySign(new int[] {-1,1,-1,1,-1}));
}
