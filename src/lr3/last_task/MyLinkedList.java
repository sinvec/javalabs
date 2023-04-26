package lr3.last_task;

import lr3.example6.Node;
import java.util.Scanner;

public class MyLinkedList {

    private static Scanner stdin = new Scanner(System.in);

    public Node head = null;

    public int size() {
        int size = 0;
        Node curNode = this.head;
        while(curNode != null) {
            size++;
            curNode = curNode.next;
        }
        return size;
    }

    public void createHead() {
        Node currentNode = null;
        while (true) {
            if (this.size() == 0) {
                System.out.print("Input first element of the current list: ");
                this.head = new Node(stdin.nextInt(), null);
                currentNode = this.head;
            } else {
                System.out.print("Input next element of the current list: ");
                currentNode.next = new Node(stdin.nextInt(), null);
                currentNode = currentNode.next;
            }
            System.out.print("Continue filling (y/n)? ");
            char c = stdin.next().charAt(0);
            if (c == 'n') {
                return;
            }
        }
    }

    public void createTail(){
        while (true) {
            if (this.size() == 0) {
                System.out.print("Input first element of the current list: ");
            } else {
                System.out.print("Input next element of the current list: ");
            }
            head = new Node(stdin.nextInt(), head);
            System.out.print("Continue filling (y/n)? ");
            char c = stdin.next().charAt(0);
            if (c == 'n') {
                return;
            }
        }
    }

    public String toString() {
        String result = "";
        Node curNode = this.head;
        while(curNode != null) {
            result += String.valueOf(curNode.value) + " ";
            curNode = curNode.next;
        }
        return result.substring(0, result.length() - 1);
    }

    public Node AddFirst(int newEl) {
        this.head = new Node(newEl, this.head);
        return this.head;
    }

    public Node AddLast(int newEl) {
        Node curNode = this.head;
        if (curNode == null) {
            this.head = new Node(newEl, null);
            return this.head;
        }
        while (curNode.next != null) {
            curNode = curNode.next;
        }
        curNode.next = new Node(newEl, null);
        return curNode.next;
    }

    public Node Insert(int newEl, int index) {
        if (index < 0) {
            return null;
        }
        int nodeCounter = 0;
        Node curNode = this.head;
        Node lastNode = null;
        while (nodeCounter != index || curNode != null) {
            lastNode = curNode;
            curNode = curNode.next;
            nodeCounter++;
        }
        if (curNode == null) {
            if (lastNode == null) {
                this.head = new Node(newEl, null);
                return this.head;
            } else {
                lastNode.next = new Node(newEl, null);
                return lastNode.next;
            }
        } else {
            lastNode.next = new Node(newEl, curNode);
            return lastNode.next;
        }
    }

    public Node RemoveFirst() {
        Node removed = this.head;
        if (removed == null) {
            return removed;
        }
        this.head = this.head.next;
        return removed;
    }

    public Node RemoveLast() {
        if (this.head == null) {
            return null;
        }
        Node lastNode = this.head;
        Node curNode = this.head.next;
        if (curNode == null) {
            this.head = null;
            return this.head;
        }
        while (curNode.next != null) {
            curNode = curNode.next;
            lastNode = lastNode.next;
        }
        lastNode.next = null;
        return curNode;
    }

    public Node Remove(int index) {
        if (index < 0) {
            return null;
        }
        int nodeCounter = 0;
        Node curNode = this.head;
        Node lastNode = null;
        while (nodeCounter != index || curNode != null) {
            lastNode = curNode;
            curNode = curNode.next;
            nodeCounter++;
        }
        if (curNode == null) {
            return null;
        } else {
            if (curNode.next == null) {
                lastNode.next = null;
            } else {
                lastNode.next = curNode.next;
            }
            return curNode;
        }
    }

    public void CreateHeadRec() {
        if (this.size() == 0) {
            System.out.print("Input first element of the current list: ");
        } else {
            System.out.print("Input next element of the current list: ");
        }
        this.AddLast(stdin.nextInt());
        System.out.print("Continue filling (y/n)? ");
        char c = stdin.next().charAt(0);
        if (c == 'y') {
            CreateHeadRec();
        }
    }

    public void CreateTailRec() {
        if (this.size() == 0) {
            System.out.print("Input first element of the current list: ");
        } else {
            System.out.print("Input next element of the current list: ");
        }
        this.AddFirst(stdin.nextInt());
        System.out.print("Continue filling (y/n)? ");
        char c = stdin.next().charAt(0);
        if (c == 'y') {
            CreateTailRec();
        }
    }

    public String toStringRec(Node curNode) {
        String result = "";
        if (curNode == null) {
            return result;
        } else {
            result = String.valueOf(curNode.value) + " " + this.toStringRec(curNode.next);
        }
        return result;
    }
}
