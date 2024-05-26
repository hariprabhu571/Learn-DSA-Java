//Take name as input and print a greeting message for that particular name.

import java.util.*;
public class program2 {
    public static void main(String args[]){
        Scanner input =new Scanner(System.in);
        System.out.print("enter your name: ");
        String name =input.nextLine();
        System.out.println("Welcome"+" "+name);
    }
}
