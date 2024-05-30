/*
23.        *      *
         *   *  *   *
       *      *      *
 */
public class pattern23 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                continue;
            }
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1||k==i)  System.out.print("*");
                else System.out.print(" ");
            }
            for(int j=1;j<n-i+2;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1||k==i)  System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
