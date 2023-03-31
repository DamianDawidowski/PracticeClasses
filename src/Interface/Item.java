package Interface;

public abstract class Item {
    int data;
    Item left;
    Item right;





    public abstract Item nextt();
    public abstract Item prrevious();
    public abstract int  compareToo(Item item);

    public Item(int data ) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public Item getLeft() {
        return left;
    }

    public Item getRight() {
        return right;
    }
}
