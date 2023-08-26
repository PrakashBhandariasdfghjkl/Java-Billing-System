public class ProductList {
    int[] quantity = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    String[] products = {"thanka", "topi", "khukri", "saal", "bowl",
                         "halo", "kodalo", "nanglo", "lathi", "gundri"};
    double[] prices = {100, 150, 200, 789, 347, 345, 798, 341, 348, 900};

    public void displayProductList() {
        System.out.println("\t\t\t" + " Handicraft Store:");
        System.out.println("...............................................................................");
        System.out.println("\t" + "Product ID" + "\t" + "Product Name" + "\t" + "Price");
        for (int i = 0; i < 10; i++) {
            System.out.println("\t\t" + (i + 1) + "\t" + products[i] + "\t\t" + "$" + prices[i]);
        }
    }
}
