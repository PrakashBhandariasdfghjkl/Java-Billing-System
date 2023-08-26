import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Bill {
    private ProductList productList;
    private String customerName;
    private double totalAmount;
    private double totalCharityAmount;
    private double totalStoreAmount;

    private List<Order> orderedProducts = new ArrayList<>();

    public Bill(ProductList productList, String customerName) {
        this.productList = productList;
        this.customerName = customerName;
    }

    public void orderBill(Order order) {
        int choice = order.getChoice();
        double price = productList.prices[choice - 1];
        int quantity = order.getQuantity();

        // calculation for Ordered Products
        double orderAmount = price * quantity;
        double charityAmount = 0.12 * orderAmount;
        double storeAmount = orderAmount - charityAmount;

        // calculation for Final bill:
        totalAmount += orderAmount;
        totalCharityAmount += charityAmount;
        totalStoreAmount += storeAmount;

        orderedProducts.add(order);
    }

    public void printGenerateBill() {
        System.out.println("\nYour Ordered Products:");
        System.out.println("..................................................................................................");
        System.out.println("Product\t\tPrice\t\tQuantity\t\tOrderedAmount\t\tCharityAmount(12%)");
        System.out.println("...................................................................................................");

        for (Order order : orderedProducts) {
            int choice = order.getChoice();
            int quantity = order.getQuantity();
            String productName = productList.products[choice - 1];
            double price = productList.prices[choice - 1];
            double orderAmount = price * quantity;

        System.out.printf("%s\t\t$%.2f\t\t%d\t\t\t$%.2f\t\t\t$%.2f%n", productName, price, quantity, orderAmount, (0.12 * orderAmount));
        }
        }


    public void printFinalBill() {

        System.out.println("\n " + "                           " + "YOUR FINAL BILL :" + customerName);
        System.out.println("......................................................................................");
      
        System.out.println("Customer Name:                                                     " + customerName);
        System.out.println("Total Order Amount:                                                $" + (totalAmount));
        System.out.println("Total Charity Amount:                                              $" + totalCharityAmount);
        System.out.println("Total Store Amount:                                                $" + totalStoreAmount);
        System.out.println("Total Amount to Pay :                                              $" + (totalAmount));
        System.out.println("......................................................................................");
    }
}