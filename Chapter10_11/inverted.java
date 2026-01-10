package Chapter10_11;
import java.util.*;
public class inverted{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=4;i++){
            for(int j=1;j<=4-i+1;j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
}