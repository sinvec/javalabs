package lr3.linkedlist_creation_task;

import lr3.example6.Node;

public class WithHead {
    public static void main(String[] args) {

        Node head = null;
        Node currentNode = null;
        for(int i = 0; i < 10; i++) {
            if (i == 0) {
                head = new Node(i, null);
                currentNode = head;
            } else {
                currentNode.next = new Node(i, null);
                currentNode = currentNode.next;
            }
        }

        Node ref = head;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }

    }
}
