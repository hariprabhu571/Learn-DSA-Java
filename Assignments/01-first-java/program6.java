//Input currency in rupees and output in USD.
import java.util.*;
public class program6 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the indian currency value: ");
        double indian = input.nextDouble();
        System.out.printf("USD value: $%.2f", (indian/83.06));           //current price(26/05/24) => 1 USD = 83.06
    }
}
