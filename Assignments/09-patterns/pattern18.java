/*
18.   **********
      ****  ****
      ***    ***
      **      **
      *        *
      *        *
      **      **
      ***    ***
      ****  ****
      **********
 */
public class pattern18 {
    public static void main(String args[]){
        int n=10;
        int val=0;
        for(int i=1;i<=n;i++){
            int temp=val;
            for(int j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else{
                  if(j*2<=n-val || temp==0){
                      System.out.print("*");
                  }
                  else{
                      System.out.print(" ");
                      temp--;
                  }
                }

            }
            if(i!=n/2)
                val+= (i>n/2 ? -2 : +2);
            System.out.println();

        }
    }
}
