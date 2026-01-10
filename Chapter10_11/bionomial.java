package Chapter10_11;
import java.util.*;
public class bionomial{
    public static int facto(int a){
        int fact=1;
        if(a==1 || a==0){
            return 1;
        }else{

        for (int i=2;i<=a;i++){

        fact*=i;
        }
        return fact;
        }
    }
    public static int bionomialcoff(int n,int r){
        int fact_n=facto(n);
        int fact_r=facto(r);
        int fact_nr=facto(n-r);
        int bino=fact_n / (fact_r*fact_nr);
        return bino;
    }
     public static void main (String []args){
        Scanner sc = new Scanner(System.in); 
        System.out.println(bionomialcoff(5,2));
    }
}