/*
16.           1
            1   1
          1   2   1
        1   3   3   1
      1   4   6   4   1
 */
public class pattern16 {
    public static void main(String args[]){
        int n= 5;
        int[][] arr = new int[n+1][n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k==1 || k==i){
                    arr[i][k] = 1;
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(arr[i-1][k] + arr[i-1][k-1]+" ");
                    arr[i][k] = arr[i-1][k] + arr[i-1][k-1];
                }
            }
            System.out.println();
        }
    }
}
