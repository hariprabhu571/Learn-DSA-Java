/*
        *
       ***
      *****
     *******
    *********
 */
public class pattern8 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int h=1;h<=n-i+1;h++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}