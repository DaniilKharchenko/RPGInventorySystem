package rpginventory;

/**
 * Concrete Element representing a sword.
 */
public final class Sword implements GameItem {
    private final String name;
    private final int damage;
    private final double price;
    private final double weight;

    public Sword(String name, int damage, double price, double weight) {
        this.name = name;
        this.damage = damage;
        this.price = price;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public void accept(ItemVisitor visitor) {
        visitor.visitSword(this);
    }
}
