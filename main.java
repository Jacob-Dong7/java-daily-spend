import java.util.Scanner;
import java.util.ArrayList;
public class main {

    //to compile javac main.java log.java view.java
    //to run java main
    public static void main(String[] args) {
        System.out.println("---------------------");
        System.out.println("Welcome to DailySpend");
        System.out.println("---------------------");

        int userSelect;
        Scanner scnr = new Scanner(System.in);
        ArrayList<ArrayList<String>> database = new ArrayList<>();
        log userLog = new log();
        view userView = new view();

        while (true) {
            System.out.println("Select the following options:");
            System.out.println("1 (Log expense)");
            System.out.println("2 (View expense list)");
            System.out.println("3 (Track total spending)");
            System.out.println("4 (Reset)");
            System.out.println("-1 (Exit)");

            userSelect = scnr.nextInt();

            if (userSelect == -1) {
                System.out.println("Exiting program...");
                return;
            }

            if (userSelect == 1) {
                userLog.logExpense(database);
            } else if (userSelect == 2) {
                userView.viewLog(database);
            } else if (userSelect == 3) {
                userView.total(database);
            } else if (userSelect == 4) {
                System.out.println("----------");
                System.out.println("Database Cleared");
                System.out.println("----------");
                database.clear();
            }

        
        }
    }

}