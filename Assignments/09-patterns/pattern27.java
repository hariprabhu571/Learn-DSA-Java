/*
27.   1 2 3 4  17 18 19 20
        5 6 7  14 15 16
          8 9  12 13
            10 11
 */
public class pattern27 {
    public static void main(String args[]) {
        int n =4;
        int num=1;
        int second = n*n+1;
        int val = n-1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.print(" ");
            for(int k=1;k<=n-i+1;k++){
                System.out.print(second+" ");
                second++;
            }
            second = (second-1) - (val*2);
            val--;
            System.out.println();
        }
    }
}

