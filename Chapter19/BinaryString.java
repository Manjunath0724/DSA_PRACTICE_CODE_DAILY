// package Chapter19;

// public class BinaryString {
//     public static void printBinaryStrings(int n, int lastplace, String ans) {
//         if (n == 0) {
//             System.out.println(ans);
//             return;
//         }

//         printBinaryStrings(n - 1, 0, ans + "0");
//         if(lastplace == 0){
//         printBinaryStrings(n - 1, 1, ans + "1");
//         }
//     }
//     public static void main(String[] args) {
//         printBinaryStrings(3,0,"");
//     }
// }
package Chapter19;

public class BinaryString {
    public static void printBinaryStrings(int n, int lastplace, StringBuilder ans) {
        if (n == 0) {
            System.out.println(ans.toString());
            return;
        }

        // Place '0'
        ans.append("0");
        printBinaryStrings(n - 1, 0, ans);
        ans.deleteCharAt(ans.length() - 1); // backtrack

        // Place '1' only if lastplace == 0
        if (lastplace == 0) {
            ans.append("1");
            printBinaryStrings(n - 1, 1, ans);
            ans.deleteCharAt(ans.length() - 1); // backtrack
        }
    }

    public static void main(String[] args) {
        printBinaryStrings(3, 0, new StringBuilder());
    }
}