/*
17.      1
        212
       32123
      4321234
       32123
        212
         1
 */
public class pattern17 {
    public static void main(String args[]){
        int n =4;
        for(int i=1;i<2*n;i++){
            int space = i<=n ? i :2*n-i;
            for(int j=1;j<=n-space;j++){
                System.out.print(" ");
            }
            int a= i>n ? 2*n-i : i;
            int b=0;
            for(int k=1;k<=2*a-1;k++){
                System.out.print(a-b);
                b += k<a ? +1 : -1;

            }
            System.out.println();
        }
    }
}
