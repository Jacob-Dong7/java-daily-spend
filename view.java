import java.util.ArrayList;

public class view {
    
    public void viewLog(ArrayList<ArrayList<String>> database) {
        if (database.isEmpty()) {
            System.out.println("----------");
            System.out.println("Expense List Is Empty");
            System.out.println("----------");
            return;
        }
        System.out.println("----------");
        System.out.println("Expense List");
        System.out.println("----------");
        for (int i = 0; i < database.size(); ++i) {
            System.out.print("Item ");
            System.out.println(i + 1);
            for (int j = 0; j < database.get(i).size(); ++j) {
                if (j == 0) {
                    System.out.print("Price: $");
                    System.out.println(database.get(i).get(j));
                } else {
                    System.out.print("Category: ");
                    System.out.println(database.get(i).get(j));
                }
            }
            System.out.println("----------");
        }
        return;
    }

    public void total(ArrayList<ArrayList<String>> database) {
        double total = 0;

        for (int i = 0; i < database.size(); ++i) {
            total += Double.valueOf(database.get(i).get(0));
        }

        System.out.println("----------");
        System.out.print("Total Expense: $");
        System.out.println(total);
        System.out.println("----------");
        return;
    }
}
