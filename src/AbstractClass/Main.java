package AbstractClass;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Darwin Bristbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {

          list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("Bristbane"));

    }
}