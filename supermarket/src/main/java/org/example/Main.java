import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Food> shoppingList = new ArrayList<>();

        shoppingList.add(Food.MILK);
        shoppingList.add(Food.CHEESE);
        shoppingList.add(Food.CHICKEN);
        shoppingList.add(Food.CARROT);
        shoppingList.add(Food.RICE);

        // Lambda
        System.out.println("Shopping list - Lambda:");

        shoppingList.forEach(food -> System.out.println(food));

        // Stream API
        System.out.println("\nShopping list - Stream:");

        shoppingList.stream()
                .forEach(food -> System.out.println(food));
    }
}