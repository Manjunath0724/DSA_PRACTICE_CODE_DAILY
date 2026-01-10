package Chapter13;

import java.util.Scanner;

public class StringLinear {
public static String LinearSearchString(String names[],String key){
    for (int i=0;i<names.length;i++){
        if(names[i]==key){
            // return ("FOUND AT INDEX " + (i+1));//for natural numbers
            return ("FOUND AT INDEX " + i);
        }

    }
    return "NOT FOUND";
    

}
    public static void main(String[] args) {
        
        String names[]={"idli","samosa","vadapav","poha","upama"};
        String key="idli";

        String index = LinearSearchString(names,key);
        if(index=="NOT FOUND"){
            System.out.println("Key not found !");

        }
        else{
            System.out.println("Key found at index :"+index);
        }


    }
}
