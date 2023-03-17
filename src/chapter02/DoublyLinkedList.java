package chapter02;

/**
 * @author Petrov Nikolay
 * @version March, 13th
 * Односвязный список
 */
// head (голова) - начало списка
// tail (хвост) - конец списка
class DNode {
    int value;
    DNode prev;
    DNode next;

    DNode(int value, DNode prev, DNode next) {
        this.value = value;
        this.prev = prev;
        this.next = next;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {
        DNode head = null;
        DNode tail = null;
        DNode firstNode = new DNode(1, null, null);
        head = firstNode;
        tail = firstNode;
    }
}
