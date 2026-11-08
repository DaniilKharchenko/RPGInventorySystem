package rpginventory;

/**
 * Concrete Element representing a piece of armor.
 */
public final class Armor implements GameItem {
    private final String name;
    private final int defense;
    private final double price;
    private final double weight;

    public Armor(String name, int defense, double price, double weight) {
        this.name = name;
        this.defense = defense;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitArmor(this);
    }
}
