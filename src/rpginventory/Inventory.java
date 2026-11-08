package rpginventory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Object Structure that stores items and lets clients traverse them.
 */
public final class Inventory {
    private final List<GameItem> items = new ArrayList<>();

    public void addItem(GameItem item) {
        if (item == null) {
            throw new IllegalArgumentException("Item cannot be null.");
        }
        items.add(item);
    }

    public List<GameItem> getItems() {
        return Collections.unmodifiableList(items);
    }

    public void accept(ItemVisitor visitor) {
        for (GameItem item : items) {
            item.accept(visitor);
        }
    }
}
