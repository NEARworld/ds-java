import array_list.IntegerArrayList;
import linked_list.Node;
import linked_list.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList list = new SinglyLinkedList();
//        list.insert(10, 0);
//        list.insert(20, 1);
//        list.insert(30, 2);
//        list.insert(40, 3);
//
//        list.insert(100, 1);
//
//        Node curr = list.head;
//        for (int i = 0; i < 4; ++i) {
//            System.out.println(curr.data);
//            curr = curr.next;
//        }

        IntegerArrayList list = new IntegerArrayList();
        list.add(0, 3);
        list.add(0, 1);
        list.add(1, 4);

        list.traverse();
    }
}