
import java.util.Scanner;
      void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("What would you like to order? ");
        String order = sc.nextLine();

        System.out.println("You ordered: " + order);
        System.out.println("Your food is being prepared...");
        System.out.println("Here is your " + order + " 🍔");

        sc.close();
    }

