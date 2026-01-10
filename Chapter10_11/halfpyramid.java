package Chapter10_11;
import java.util.*;
public class halfpyramid{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        for (int i=1;i<=4;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
            System.out.println();
        }
    }
}