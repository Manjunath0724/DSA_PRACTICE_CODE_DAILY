package leetcode;

public class lt_1460 {

    public boolean canBeEqual(int[] targetArray, int[] currentArray) {

        int[] elementCounts = new int[1001];
        int uniqueCount = 0;

        for (int i = 0; i < targetArray.length; i++) {
            if (elementCounts[targetArray[i]]++ == 0)
                uniqueCount++;
            if (elementCounts[currentArray[i]]-- == 1)
                uniqueCount--;
        }

        return uniqueCount == 0;
    }

    public static void main(String[] args) {
        lt_1460 s = new lt_1460();
        int[] targetArray = { 1, 2, 3, 4 };
        int[] currentArray = { 2, 4, 1, 3 };
        boolean result = s.canBeEqual(targetArray, currentArray);
        System.out.println(result); // Output: true
    }
}
