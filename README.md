# Shopping List – Java

## Project Description

A simple Java application that creates and displays a supermarket shopping list.

The project demonstrates the use of **Java Collections, Enums, Lambda Expressions, Stream API, and method overriding**.

The application allows users to add predefined food products to a shopping list and print each product individually.

## Features

- Create a shopping list using `ArrayList`.
- Add products using the `.add()` method.
- Restrict available products using `enum Food`.
- Override the `toString()` method to display product names in lowercase.
- Print products individually using a Lambda Expression.
- Print products individually using Java Stream API.

## Technologies

- Java
- Java Collections Framework
- Enum
- Lambda Expressions
- Stream API
- Object-Oriented Programming (OOP)

## Project Structure

```text
ShoppingList/
├── src/
│   └── main/
│       └── java/
│           ├── Food.java
│           └── Main.java
└── README.md
```

## Code Example

### Food.java

```java
public enum Food {
    MILK,
    CHEESE,
    CHICKEN,
    CARROT,
    RICE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
```

### Main.java

```java
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

        // Lambda Expression
        System.out.println("Shopping list - Lambda:");

        shoppingList.forEach(food -> System.out.println(food));

        // Stream API
        System.out.println("\nShopping list - Stream:");

        shoppingList.stream()
                .forEach(food -> System.out.println(food));
    }
}
```

## Example Output

```text
Shopping list - Lambda:
milk
cheese
chicken
carrot
rice

Shopping list - Stream:
milk
cheese
chicken
carrot
rice
```

## How It Works

**1. ArrayList**

An `ArrayList` stores food products in a dynamically sized list.

**2. Enum**

The `Food` enum defines the available food products and prevents adding undefined enum constants such as `Food.CAR`.

**3. toString()**

The overridden `toString()` method converts enum names into lowercase strings for readable output.

**4. Lambda Expression**

The lambda expression iterates through the list and prints each item individually.

```java
shoppingList.forEach(food -> System.out.println(food));
```

**5. Stream API**

The Stream API processes the elements of the list and prints them individually.

```java
shoppingList.stream()
        .forEach(food -> System.out.println(food));
```

## How to Run

1. Clone or download the repository.
2. Open the project in IntelliJ IDEA.
3. Make sure a Java JDK is configured.
4. Run the `Main.java` class.
5. View the shopping list in the console.

## Learning Objectives

This project was created to practice:

- Working with Java lists and generics.
- Adding elements to collections.
- Understanding enums and type safety.
- Overriding methods.
- Writing lambda expressions.
- Using Java Stream API.
- Iterating through collections.

## Possible Improvements

- Allow users to select products from the console.
- Add and remove products dynamically.
- Prevent duplicate entries.
- Sort products alphabetically.
- Filter products using Stream API.
- Add unit tests.

## Author

Java Learning Project – Collections, Lambda Expressions & Stream API
