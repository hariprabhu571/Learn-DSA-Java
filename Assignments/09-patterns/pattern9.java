/*
    *********
     *******
      *****
       ***
        *

 */
public class pattern9 {
    public static void main(String args[]){
        int n=5;
        int k = 2*n-1;
        for(int i=1;i<=n;i++) {
            for (int h = 1; h <= i; h++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= k; j++) {
                System.out.print("*");
            }
            k-=2;
            System.out.println();
        }

    }
}
