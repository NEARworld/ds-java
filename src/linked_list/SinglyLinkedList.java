package linked_list;

public class SinglyLinkedList implements LinkedListInterface {
    public Node head;
    public SinglyLinkedList() {
        head = null;
    }

    public void insert(int data, int position) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            int i = 0;
            Node prev = null;
            Node current = head;
            while (position > i && current != null) {
                prev = current;
                current = current.next;
                i += 1;
            }
            if (current != null) {
                newNode.next = current.next;
            }
            prev.next = newNode;

        }
    }
}
