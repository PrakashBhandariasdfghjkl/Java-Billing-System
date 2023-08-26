import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductList productList = new ProductList();
        productList.displayProductList();

       while(true){
            
            System.out.println("\nPlease enter the customer name:");
            String customerName = sc.nextLine();
            
            if (customerName.matches(".*\\d+.*")) {
                System.out.println("Invalid customer name! Please enter a valid name.");
                continue;
            }
            Bill bill = new Bill(productList, customerName);


            do {
                Order order = new Order( 1,2); 
                order.takeOrder(sc);

                bill.orderBill(order);


                System.out.println("Do you want to place another order? (Y/N):");
                char anotherOrder = sc.next().charAt(0);
                sc.nextLine(); 
                if (anotherOrder != 'Y' && anotherOrder != 'y') {
                    break;
                }
                
            } while (true);



            bill.printGenerateBill();
            bill.printFinalBill();


            System.out.println("Do you want to create another Bill ? (Y/N):");
            char anotherBill = sc.next().charAt(0);
            sc.nextLine();
            if (anotherBill != 'Y' && anotherBill != 'y') {
                break;
            }
        }

        
        System.out.println("\n Thank you, Come Again!.");
    }
}