package Chapter13;

import java.util.Scanner;

public class linear {
public static int LinearSearch(int numbers[],int key){
    for (int i =0;i<numbers.length;i++){
        if(numbers[i]==key){
            return i;
        }
    }
    return -1;

}
    public static void main(String[] args) {
        
        int numbers[]={2,4,5,6,7,14,46,243,324,85};
        int key =243; 
        int index=LinearSearch(numbers,key);

        if(index==-1){
            System.out.println("Key is not Present !");
        }
        else{
            // System.out.println("Key is present at index:"+(index+1));//for the natural numbers
                        System.out.println("Key is present at index:"+index);

        }

    }
}
