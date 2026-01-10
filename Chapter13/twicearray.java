package Chapter13;
import java.util.*;

public class twicearray {

    public static boolean twicearraycount(int numbers[]){
        
        for(int i=0;i<numbers.length;i++){
            for(int k=i+1;k<numbers.length;k++){
                if(numbers[i]==numbers[k]){
                    return true;
                }

            }
            
        }
      return false;
    }
    
    public static void main(String args[]) {
        int numbers[] = {1,2,3,4,45,44,43,42,41,1};
        System.out.println(twicearraycount(numbers));
        
    }
}