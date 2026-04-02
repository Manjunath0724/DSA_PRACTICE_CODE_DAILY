public class lt_2678 {

    public int countSeniors(String[] details) {
        int total = 0;
        for (String s : details) {
            int a = s.charAt(11) - '0';
            int b = s.charAt(12) - '0';
            int age = a * 10 + b;
            if (age > 60) {
                total++;
            }
        }
        return total;
    }

    public static void main(String[] args) {
        lt_2678 sol = new lt_2678();
        String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
        int result = sol.countSeniors(details);
        System.out.println(result);
    }
}
