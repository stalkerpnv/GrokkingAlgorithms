package chapter02;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Petrov Nikolay
 * @version March, 3rd
 * Односвязный список
 */

// head (голова) - начало списка
// tail (хвост) - конец списка
class Node {
    int value;
    Node next;

    Node(int value, Node next) {
        this.value = value;
        this.next = null;
    }
}

public class SinglyConnectedLinkedList {
    public static void main(String[] args) {
        Node head = null;
        Node tail = null;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        Node firstNode = new Node(random.nextInt(100), null);
        head = firstNode;
        tail = firstNode;
        while (i < 9) {
            Node node = new Node(random.nextInt(100), null);
            tail.next = node;
            tail = node;
            i++;
        }
        // Чтение или обращение к элементу списка O(n)
        head = firstNode;
        Node current = head;
        // Вывод списка
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }

        // Вставка элемента в начало списка
        Node newhead = new Node(100, null);
        newhead.next = head;
        head = newhead;

        // Вставка в конец списка
        Node newTail = new Node(1001, null);
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newTail;
        tail = newTail;

        // Вставка в определенное место списка
        System.out.println("\nВведите после какого числа по порядку будет производиться вставка и само число");
        int a = sc.nextInt();
        int number = sc.nextInt();
        int j = 1;
        Node ref = head;
        while (head != null && (j < a)) {
            ref = ref.next;
            j++;
        }
        Node newNode = new Node(number, null);
        newNode.next = ref.next;
        ref.next = newNode;
        current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        System.out.println("\ntail.value = " + tail.value);

        // Удаление головы
        head = head.next;
        current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        // Удаление хвоста
        current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        // для предпоследнего элемента next присваиваем null
        current.next = null;

        System.out.println();
        current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
        // Удаление с заданным номером списка
        ref = head; // создаем вспомогательную переменную
        int k = 1;
        // поиск положения узла, предшествующего удаляемому
        while (ref.next != null && (k < 2)) {
            ref = ref.next;
            k++;
        }
        // переброска ссылки для исключения ненужного элемента из списка
        ref.next = ref.next.next;

        System.out.println();
        current = head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
