import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<FoodItem> foodItems = new ArrayList<>();

        while (true) {
            System.out.println("Pick an option:");
            System.out.println("1)✔️ Show Items:");
            System.out.println("2)➕ Add an Item:");
            System.out.println("3)➖ Remove an Item:");
            System.out.println("4)✖️ Exit");

            int choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    printItems(foodItems);
                    break;
                case 2:
                    addItem(keyboard, foodItems);
                    break;
                case 3:
                    removeItem(keyboard, foodItems);
                    break;
                case 4:
                    System.out.println("👋Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
            if (choice == 4) {
                break;
            }
        }
        keyboard.close();
    }


    public static void printItems(ArrayList<FoodItem> foodItems) {
        if (foodItems.isEmpty()) {
            System.out.println("⛔No items in order!");
        } else {
            for (FoodItem item : foodItems) {
                System.out.println(item);
            }
        }
    }

    public static void addItem(Scanner keyboard, ArrayList<FoodItem> foodItems) {
        System.out.println("📋Enter the name of the item:");
        String name = keyboard.next();

        System.out.println("💲Enter the price of the item:");
        double price = keyboard.nextDouble();

        System.out.println("🥖Does it have gluten?");
        boolean hasGluten = keyboard.nextBoolean();

        // Flush the stream
        keyboard.nextLine();

        FoodItem newItem = new FoodItem(name, price, hasGluten);
        foodItems.add(newItem);

        System.out.println("🛒Item added successfully.");
    }

    public static void removeItem(Scanner keyboard, ArrayList<FoodItem> foodItems) {
        System.out.println("⌨️Enter item to be removed:");
        String itemName = keyboard.next();

        boolean removed = false;
        for (int i = 0; i < foodItems.size(); i++) {
            if (foodItems.get(i).name.equalsIgnoreCase(itemName)) {
                foodItems.remove(i);
                removed = true;
                System.out.println("🚫Item removed successfully.");
                break;
            }
        }
        if (!removed) {
            System.out.println("🙅🏿Item not found.");
        }
    }

    public void main() {
    }
}