/*
26.   1 1 1 1 1 1
      2 2 2 2 2
      3 3 3 3
      4 4 4
      5 5
      6
 */
public class pattern26 {
    public static void main(String args[]){
        int n= 6;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
