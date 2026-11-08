RPG Inventory System — Visitor Pattern# RPG Inventory System — Visitor Pattern

## 1. Project Description

This project demonstrates the **Visitor Design Pattern** using an RPG Inventory System.

The system contains different game items such as swords, shields, and armor. The Visitor Pattern allows us to perform different operations on these items without changing their original classes.

## 2. Design Pattern

The project uses the **Visitor Design Pattern**.

The main idea is to separate operations from the objects on which they are performed.

For example, we can calculate the total price of all items or display their descriptions using different visitors.

## 3. Project Structure

- **GameItem** — base interface for all game items.
- **Sword** — represents a weapon.
- **Shield** — represents a shield.
- **Armor** — represents armor.
- **ItemVisitor** — visitor interface that defines operations for each item.
- **PriceCalculator** — calculates the total price of inventory items.
- **ItemDescriptionVisitor** — displays information about each item.
- **Inventory** — stores and manages game items.
- **Main** — runs the application.

## 4. How the Visitor Pattern Works

1. Each game item implements the `GameItem` interface.
2. Each item has an `accept()` method.
3. The `accept()` method calls the appropriate visitor method.
4. A visitor performs an operation on the item.
5. New operations can be added by creating new visitor classes.

## 5. Clean Code Principles

The project follows several Clean Code principles:

- **Single Responsibility Principle** — each class has one main responsibility.
- **Open/Closed Principle** — new operations can be added through new visitors without modifying existing item classes.
- **Encapsulation** — item data is accessed through methods.
- **Meaningful Names** — classes and methods have descriptive names.
- **Separation of Concerns** — item data and operations are separated.



## 6. Expected Result

The program creates an inventory containing a sword, a shield, and armor.

It then:
- Displays information about each item.
- Calculates and displays the total inventory price.

## 7. Conclusion

The Visitor Design Pattern makes it possible to add new operations to the RPG Inventory System without changing the existing game item classes. It improves code organization and makes the project easier to extend.