/*
34.    E D C B A
       D C B A
       C B A
       B A
       A
 */
public class pattern34 {
    public static void main(String args[]){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                char ascii = (char) ('A'+n-j-i+1);
                System.out.print(ascii+" ");
            }
            System.out.println();
        }
    }

}
