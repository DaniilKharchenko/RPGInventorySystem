package rpginventory;

/**
 * Client code demonstrating two operations over the same object structure.
 */
public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addItem(new Sword("Dragon Slayer", 85, 250.0, 6.5));
        inventory.addItem(new Shield("Knight Shield", 40, 120.0, 8.0));
        inventory.addItem(new Armor("Mithril Armor", 65, 300.0, 12.0));

        System.out.println("=== RPG Inventory ===");

        System.out.println("\n--- Item descriptions ---");
        ItemDescriptionVisitor descriptionVisitor = new ItemDescriptionVisitor();
        inventory.accept(descriptionVisitor);

        System.out.println("\n--- Total inventory value ---");
        PriceCalculator priceCalculator = new PriceCalculator();
        inventory.accept(priceCalculator);
        System.out.printf("Total price: %.2f gold%n", priceCalculator.getTotalPrice());
    }
}
