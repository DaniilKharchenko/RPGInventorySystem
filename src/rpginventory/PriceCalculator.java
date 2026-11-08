package rpginventory;

/**
 * Concrete Visitor that calculates the total inventory value.
 */
public final class PriceCalculator implements ItemVisitor {
    private double totalPrice;

    @Override
    public void visitSword(Sword sword) {
        totalPrice += sword.getPrice();
    }

    @Override
    public void visitShield(Shield shield) {
        totalPrice += shield.getPrice();
    }

    @Override
    public void visitArmor(Armor armor) {
        totalPrice += armor.getPrice();
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
