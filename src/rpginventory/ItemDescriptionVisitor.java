package rpginventory;

/**
 * Concrete Visitor that creates a readable description of each item.
 */
public final class ItemDescriptionVisitor implements ItemVisitor {
    @Override
    public void visitSword(Sword sword) {
        System.out.printf(
                "Sword: %s | Damage: %d | Price: %.2f gold | Weight: %.2f kg%n",
                sword.getName(), sword.getDamage(),
                sword.getPrice(), sword.getWeight()
        );
    }

    @Override
    public void visitShield(Shield shield) {
        System.out.printf(
                "Shield: %s | Defense: %d | Price: %.2f gold | Weight: %.2f kg%n",
                shield.getName(), shield.getDefense(),
                shield.getPrice(), shield.getWeight()
        );
    }

    @Override
    public void visitArmor(Armor armor) {
        System.out.printf(
                "Armor: %s | Defense: %d | Price: %.2f gold | Weight: %.2f kg%n",
                armor.getName(), armor.getDefense(),
                armor.getPrice(), armor.getWeight()
        );
    }
}
