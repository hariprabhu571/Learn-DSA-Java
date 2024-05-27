/*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *
 */
public class pattern28 {
    public static void main(String args[]){
        int n =5;
        for(int i=1;i<2*n;i++){
            int l = (i>n ? 2*n-i : i);
            int space = n-l;
            for(int j=1;j<=space;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=l;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
