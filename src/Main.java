public class Main {
    public static void main(String[] args) {

    BinarySearch tree = new BinarySearch();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.remove(2);
        tree.remove(1);
        tree.search(7);

    tree.display();
    }
}