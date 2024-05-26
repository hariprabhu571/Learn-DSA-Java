// Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
import java.util.*;
public class program3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the principal value: ");
        double P = input.nextDouble();
        System.out.println("enter the rate: ");
        double R = input.nextDouble();
        System.out.println("enter the time: ");
        double T = input.nextDouble();
        System.out.print("The Simple Interest is: ");
        System.out.print((P*T*R)/100);
    }
}
