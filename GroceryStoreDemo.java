import java.util.Scanner;

class InvalidItemException extends Exception {
    public InvalidItemException(String message) {
        super(message);
    }
}

class GroceryStore {
   
    public void checkItemAvailability(String item) throws InvalidItemException {
       
        String[] availableItems = {"apple", "banana", "orange"};
        
    
        boolean itemFound = false;
        for (String availableItem : availableItems) {
            if (availableItem.equalsIgnoreCase(item)) {
                itemFound = true;
                break;
            }
        }
        
        
        if (!itemFound) {
            throw new InvalidItemException("Sorry, " + item + " is not available in the store.");
        }
    }
}

public class GroceryStoreDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GroceryStore groceryStore = new GroceryStore();
        
        System.out.println("Welcome to the grocery store!");
        System.out.print("Enter the item you want to buy: ");
        String item = scanner.nextLine();
        
        try {
          
            groceryStore.checkItemAvailability(item);
            System.out.println("Item \"" + item + "\" is available. You can purchase it.");
        } catch (InvalidItemException e) {
            
            System.out.println("Error: " + e.getMessage());
        } finally {
       
            scanner.close();
        }
    }
}