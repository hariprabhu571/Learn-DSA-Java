//To find out whether the given String is Palindrome or not.
public class program8 {
    public static void main(String args[]){
        String S = "madaam";
        int start =0,end = S.length()-1;
        int flag =0;
        while(start<=end){
            if(S.charAt(start)!=S.charAt(end)){
                flag =1;
                break;
            }
            start++;
            end--;
        }
        if(flag==0){
        System.out.println("Palindrome");}
        else{
            System.out.println("Not a palindrome");
        }
    }
}
