package Interface;

public class Node extends Item {

    @Override
    public Item nextt() {
        return this.getRight();
    }

    @Override
    public Item prrevious() {
        return this.getLeft();
    }


    public Node(int data) {
        super(data);
    }

    public int compareToo(Item item) {
        return super.getData() - item.getData();

    }



}