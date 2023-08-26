import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order {
    private int choice;
    private int quantity;

    public Order( int choice, int quantity) {
       
        this.choice = choice;
        this.quantity = quantity;

    }

    public void takeOrder(Scanner sc) {
        while(true){
        System.out.println("\n\nPlease Enter your product ID:");
        try {
            choice = Integer.parseInt(sc.nextLine());
    
            if (choice >= 1 && choice <= 10) {
                System.out.println("How many quantity you want to order:");
                quantity = sc.nextInt();
                break;

            } else {
                System.out.println("Invalid product ID!! Please enter a valid product Id:");
                continue;
            }
        } catch (NumberFormatException ex) {
            System.out.println("Invalid input! Please enter a valid numeric product ID.");
        }

        }

    }

    public int getChoice() {
        return choice;
    }

    public int getQuantity() {
        return quantity;
    }
    
}





