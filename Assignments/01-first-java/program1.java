//1.Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class program1 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The given number is Even number");
        }
        else{
            System.out.println("The given number is Odd Number");
        }
    }
}
