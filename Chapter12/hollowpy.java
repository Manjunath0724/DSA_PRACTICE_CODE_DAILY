package Chapter12;

public class hollowpy{
    public static void hollow_rectangle(int totalrows,int totalcols){
        //outer loop
        for(int i =1;i<=totalrows;i++){
            for (int j=1;j<=totalcols;j++){
                if(i==1||i==totalrows||j==1||j==totalcols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }


    }
    public static void inverted(int n){
        //outer loop
        for (int i=1;i<=n;i++){
            //for spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");  
            }
            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        // hollow_rectangle(4,5);
        inverted(5);
    }
}