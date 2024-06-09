import java.util.ArrayList;
import java.util.HashSet;

public class MainItemTask3 {
    public static void main(String[] args) {
        ArrayList<Item> moreItems = new ArrayList<>();
        for (int i = 6; i <= 15; i++) {
            moreItems.add(new Item(i, "Item" + i));
        }

        HashSet<Item> itemSet = new HashSet<>(moreItems.subList(0, 5));
        for (Item item : itemSet) {
            item.show();
        }
    }
}
