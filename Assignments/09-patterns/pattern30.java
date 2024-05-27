/*
            1
          2 1 2
        3 2 1 2 3
      4 3 2 1 2 3 4
    5 4 3 2 1 2 3 4 5
 */
public class pattern30 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<n-i+1;j++){
                System.out.print("  ");
            }
            int a =i,u=0;
            for(int k=1;k<=(2*i-1);k++){
                System.out.print(a-u+" ");
                u += k<((2*i-1)/2+1) ? +1 : -1;
            }
            System.out.println();
        }
    }
}
