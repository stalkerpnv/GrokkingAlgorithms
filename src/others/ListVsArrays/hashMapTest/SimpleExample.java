package others.ListVsArrays.hashMapTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleExample {


   /* Хеш-таблицей называется структура данных, реализующая интерфейс ассоциативного массива
    (абстрактная модель «ключ – значение» или entry), которая обеспечивает очень быструю вставку и поиск:
    независимо от количества элементов вставка и поиск (а иногда и удаление) выполняются за время,
    близкое к константе – O(1). По сути, это обычный массив, где местоположение элемента зависит от значения
    самого элемента. Связь между значением элемента и его позицией в хеш-таблице задает хеш-функция.
    */
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("J","Java");
        hashMap.put("C","C");
        hashMap.put("P","Python");
        Object[] arr = hashMap.keySet().toArray(new String[0]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " " + hashMap.get(arr[i]));
            if(hashMap.get(arr[i]).equals("Java")){
                hashMap.put("JavaS","JavaScript");
            }
        }
        System.out.println("hashmap keySet size before add elem = " + hashMap.keySet().size());
        //System.out.println(hashMap.values());
        hashMap.put("C++", "C++");
        System.out.println(hashMap.keySet().toString());
        System.out.println("hashmap keySet size after add elem = " + hashMap.keySet().size());
        System.out.println("arr keySet size = " + arr.length);

    }
}
