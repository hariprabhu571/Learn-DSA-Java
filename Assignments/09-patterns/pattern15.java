/*
15.      *
        * *
       *   *
      *     *
     *       *
      *     *
       *   *
        * *
         *
 */
public class pattern15 {
    public static void main(String args[]){
        int n=5;
        int original =n;
//        n=n*2;
        for(int i=1;i<2*n;i++){
            int l = (i>n ?2*n-i : i);
            int space = n-l;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=l;k++){
                if(i==1 || k==1 || k==l)  System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
