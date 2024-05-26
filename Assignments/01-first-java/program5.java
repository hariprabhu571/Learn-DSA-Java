//Take 2 numbers as input and print the largest number.

import java.util.Scanner;
public class program5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number 1: ");
        double num1 =input.nextDouble();
        System.out.println("enter the number 2: ");
        double num2 =input.nextDouble();
        System.out.println("the largest number is: "+ (num1>num2?num1:num2));
    }
}
