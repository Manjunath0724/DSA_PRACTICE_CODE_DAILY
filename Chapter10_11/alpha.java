package Chapter10_11;
import java.util.*;
public class alpha{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int number=4;
        char ch='A';
        for (int i=1;i<=number;i++){
            for(int j =1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}