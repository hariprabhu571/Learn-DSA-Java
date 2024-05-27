// To calculate Fibonacci Series up to n numbers.
public class program7 {
    public static void main(String args[]){
        int n =10;
        int a1 =0,a2=1;
        System.out.print(a1+" "+a2+" ");
        for(int i=2;i<n;i++){
            int a3 = a1+a2;
            a1=a2;
            a2=a3;
            System.out.print(a3+" ");
        }
    }
}
