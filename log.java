import java.util.Scanner;
import java.util.ArrayList;

public class log {
    
    public void logExpense(ArrayList<ArrayList<String>> database) {
        Scanner scnr = new Scanner(System.in);
        double price;
        String category, priceString;
        while (true) {
            System.out.println("----------");
            System.out.println("Log Expense");
            System.out.println("-1 (Return)");
            System.out.println("----------");
            System.out.println("Please enter expense amount:");
            System.out.println("----------");



            if (!scnr.hasNextDouble()) {
                System.out.println("----------");
                System.out.println("Error: Please enter a number");
                System.out.println("----------");
                scnr.nextLine();
                continue;
            }
            price = scnr.nextDouble();
            scnr.nextLine();

            if (price <= 0) {
                System.out.println("----------");
                System.out.println("Exiting");
                System.out.println("----------");
                return;
            }

            System.out.println("----------");
            System.out.println("Please assign short description/category:");
            System.out.println("----------");
            category = scnr.nextLine().trim(); 
            if (category.isBlank()) {
                System.out.println("----------");
                System.out.println("Error: Please enter a description");
                System.out.println("----------");
                continue;
            }

            

            if (category.equals("-1")) {
                System.out.println("----------");
                System.out.println("Exiting");
                System.out.println("----------");
                return;
            }

            //create new ArrayList that will act as rows
            ArrayList<String> newLog = new ArrayList<>();

            priceString = String.valueOf(price);

            newLog.add(priceString);
            newLog.add(category);

            database.add(newLog);

        }
    }


}
