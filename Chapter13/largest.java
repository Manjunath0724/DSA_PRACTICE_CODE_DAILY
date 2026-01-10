package Chapter13;

import java.util.*;

public class largest {
    public static int getLargest(int numbers[]){
        int largest=Integer.MIN_VALUE;//this is used for - infinity
        int smallest=Integer.MAX_VALUE;//this is used for + infinity

        for (int i=0;i<numbers.length;i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("smallest in the array is :"+smallest);
        return largest;
    }
    
    public static void main(String[] args) {
        int numbers[]={1,2,6,3,5};
        int largest=getLargest(numbers);
        System.out.println("Largest in the array is :"+largest);
    }
}
