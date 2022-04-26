import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        final int Data_point = 100;
        double prices[] = new double[Data_point];
        int recCount = 0;
        boolean done = false;

        double itemPrice = 0;
        double minPrice = 1000;
        double maxPrice = 0;
        double total = 0;

        double average;
        do {
            // Get an item price .01 to 10.00
            itemPrice = SafeInput.getRangedDouble(in, "Enter the item price", .01, 10.0);
            //add it to the array
            prices[recCount] = itemPrice;

            //increment the record count
            recCount++;

            //increment the total
            total += itemPrice;

            //recalculate the average
            average = total / recCount;

            //show the new entry total and ave
            System.out.printf("item: %8.2f Total: %8.2f Ave: %8.2f", itemPrice, total, average);

            //prompt the user to continue
            done = SafeInput.getYNConfirm(in, "Are you done? [Y/N]: ");

        } while (!done);

        //dump the array
        System.out.println("Item List:");
        System.out.println("==========================================");

        for (int i = 0; i < recCount; i++) {
            System.out.println("\t" + prices[i]);
        }
        System.out.println("===========================================");
        System.out.println("Total is: " + total);
        System.out.println("Average is: " + average);
        // show the total and ave
    }
}
