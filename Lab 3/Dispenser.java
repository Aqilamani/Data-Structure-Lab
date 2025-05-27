public class Dispenser<T> {
    private T item;
    private int itemCount;
    private int itemCost;

    public Dispenser(T item, int itemCount, int itemCost) {
        this.item = item;
        this.itemCount = itemCount;
        this.itemCost = itemCost;
    }

    public T getItem() {
        return item;
    }

    public int getItemCount() {
        return itemCount;
    }

    public int getItemCost() {
        return itemCost;
    }

    public void makeSale() {
        if (itemCount > 0) {
            itemCount--;
        }
    }
}
