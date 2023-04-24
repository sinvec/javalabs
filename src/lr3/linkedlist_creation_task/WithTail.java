package lr3.linkedlist_creation_task;

import lr3.example6.Node;

public class WithTail {
    public static void main(String[] args) {

        Node head = null;
        for(int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
