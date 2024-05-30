/*
33.    a
       B c
       D e F
       g H i J
       k L m N o
 */
public class pattern33 {
    public static void main(String args[]){
        int n=5;
        int k=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(k%2==0){
                    char ascii = (char)('A'+k+32);
                    System.out.print(ascii +" ");
                    k++;
                }
                else{
                    char ascii = (char)('A'+k);
                    System.out.print(ascii +" ");
                    k++;
                }
            }
            System.out.println();
        }
    }
}
