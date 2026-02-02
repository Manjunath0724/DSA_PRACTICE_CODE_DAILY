// package Chapter19;

// public class friendspair {
//     public static int friendspairing(int n) {
//         if (n == 1 || n == 2) {
//             return n;
//         }

//         int fnm1 = friendspairing(n - 1); // single case
//         int fnm2 = friendspairing(n - 2); // pair case
//         int pairways = (n - 1) * fnm2;
//         int totalways = pairways + fnm1;
//         return totalways;
//     }

//     public static void main(String[] args) {
//         System.out.print(friendspairing(3));
//     }
// }
package Chapter19;

public class friendspair {
    public static int countWays(int n) {
        if (n <= 2)
            return n;
        return countWays(n - 1) + (n - 1) * countWays(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(countWays(3)); // Output: 4
    }
}