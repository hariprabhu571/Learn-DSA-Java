// Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
import java.util.*;
public class program4 {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.println("enter number 1: ");
        double num1 = input.nextDouble();
        System.out.println("enter number 2: ");
        double num2 = input.nextDouble();
        System.out.println("enter the operator(+,-,*,/): ");
        char op = input.next().charAt(0);
        if(op=='+'){
            System.out.println(num1+num2);
        }
        else if(op=='-'){
            System.out.println(num1-num2);
        }
        else if(op=='*'){
            System.out.println(num1*num2);
        }
        else if(op=='/'){
            if(num2==0){
                System.out.println("number 2 should be 0, it will lead to infinate value");
            }else{
                System.out.println(num1/num2);
            }
        }
        else{
            System.out.println("enter a valid operator!");
        }
    }
}
