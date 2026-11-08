package rpginventory;

/**
 * Element interface in the Visitor pattern.
 */
public interface GameItem {
    void accept(ItemVisitor visitor);
}
