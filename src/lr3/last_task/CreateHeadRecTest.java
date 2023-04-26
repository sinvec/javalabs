package lr3.last_task;

public class CreateHeadRecTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.CreateHeadRec();
        System.out.println(list.toStringRec(list.head));
    }

}
