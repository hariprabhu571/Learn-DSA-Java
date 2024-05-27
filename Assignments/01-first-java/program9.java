//To find Armstrong Number between two given number.
public class program9 {
    public static void main(String args[]){
        int start =100;
        int end =200;
        for(int i=start;i<=end;i++){
            int value =i;
            int sum =0;
            int digits = (int)Math.log10(value)+1;
            while(value!=0){
                int lastDigit = value%10;
                sum += (int)Math.pow(lastDigit,digits);
                value /=10;
            }
            if(sum==i){
                System.out.print(sum+" ");
            }
        }

    }
}
