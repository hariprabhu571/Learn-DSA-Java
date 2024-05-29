/*
19.    *        *
       **      **
       ***    ***
       ****  ****
       **********
       ****  ****
       ***    ***
       **      **
       *        *
 */
public class pattern19 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<2*n;i++){
            int l = i>n ? 2*n-i : i;
            int space = n -l+1;
            for(int j=1;j<=l;j++){
                System.out.print("*");
            }
            for(int k=1;k<space;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=l;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
