package lr3.last_task;

public class CreateTailRecTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.CreateTailRec();
        System.out.println(list.toStringRec(list.head));
    }

}
