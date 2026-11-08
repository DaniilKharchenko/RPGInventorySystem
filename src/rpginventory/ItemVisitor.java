package rpginventory;

/**
 * Visitor interface: one visit method for each concrete item type.
 */
public interface ItemVisitor {
    void visitSword(Sword sword);
    void visitShield(Shield shield);
    void visitArmor(Armor armor);
}
