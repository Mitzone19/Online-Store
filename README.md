# Online Store Simulation

This is a simple Java simulation of an online store. The program includes classes that represent different components of an online store such as a warehouse, shopping cart, and store. It's a console-based application that allows for adding products to a warehouse, managing inventory, adding items to a shopping cart, and completing purchases.

## Components

The simulation consists of several classes:

- `Warehouse`: Handles the stock and prices of products.
- `Item`: Represents a product with a quantity and unit price.
- `ShoppingCart`: Manages the items that a customer intends to purchase.
- `Store`: Provides a user interface for the customer to interact with, adding products to the cart, and checking out.

## Usage

To run the store simulation, create a `Warehouse` object and populate it with products. Then, instantiate the `Store` class with a `Scanner` object for input. Call the `shop` method on the `Store` instance to start the shopping process for a customer.

Here's a sample setup:

```java
Warehouse warehouse = new Warehouse();
warehouse.addProduct("coffee", 5, 10);
warehouse.addProduct("milk", 3, 20);
warehouse.addProduct("cream", 2, 55);
warehouse.addProduct("bread", 7, 8);

Scanner scanner = new Scanner(System.in);
Store store = new Store(warehouse, scanner);
store.shop("John");
