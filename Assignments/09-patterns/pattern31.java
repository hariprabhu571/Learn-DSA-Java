/*
         4 4 4 4 4 4 4
         4 3 3 3 3 3 4
         4 3 2 2 2 3 4
         4 3 2 1 2 3 4
         4 3 2 2 2 3 4
         4 3 3 3 3 3 4
         4 4 4 4 4 4 4
 */
public class pattern31 {
    public static void main(String args[]){
        int n = 4;
        int original = n;
        n =2*n;
        for(int i=1;i<n;i++){
            for(int j=1;j<n;j++){
                int index =original- Math.min(Math.min(i,j),Math.min(n-i,n-j)) +1;
                System.out.print(index+" ");
            }
            System.out.println();
        }
    }
}
