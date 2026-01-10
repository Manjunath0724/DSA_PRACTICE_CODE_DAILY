package Chapter13;

import java.util.*;

public class ReverseArray {

    public static void Reverse(int numbers[]){
        int start=0;
        int last=numbers.length-1;

        while(start<last){
            int temp=numbers[last];
            numbers[last]=numbers[start];
            numbers[start]=temp;


            start++;
            last--;
        }
    
    }
    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        Reverse(numbers);
        for(int i=0;i<=numbers.length-1;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
