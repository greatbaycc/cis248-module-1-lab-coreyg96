import java.util.Scanner;

public class Madlib {
   public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name, place, item;
        int quantity;
        name = in.next();
        place = in.next();
        quantity = in.nextInt();
        item = in.next();
        System.out.println(name + " went to " + place + " to buy " + quantity + " different types of " + item + ".");
   }
}
