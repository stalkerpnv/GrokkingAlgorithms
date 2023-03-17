package chapter02;

import java.util.Random;
import java.util.Scanner;

public class ExampleArray {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc= new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        for (int elem : arr) {
            System.out.print(elem + " ");
        }
        // Чтение или обращение к элементу списка O(1)
        System.out.println("\narr[3] = " + arr[3]);
        // Вставка еще одного элемента O(n)
        System.out.println("Введите индекс (куда необходимо поместить элемент) и само число");
        int index = sc.nextInt();
        int number = sc.nextInt();
        int [] newArr = new int[11];
        System.arraycopy(arr,0,newArr,0,index);
        newArr[index] = number;
        System.arraycopy(arr,index,newArr,index+1, 10-index);


        for (int elem : newArr) {
            System.out.print(elem + " ");
        }
    }
}
