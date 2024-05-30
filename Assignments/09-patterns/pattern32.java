/*
32.    E
       D E
       C D E
       B C D E
       A B C D E
 */
public class pattern32 {
    public static void main(String args[]){
        int n= 26;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                char ascii = (char)('A'+n-i+j-1);
                System.out.print(ascii +" ");
            }
            System.out.println();
        }
    }
}
