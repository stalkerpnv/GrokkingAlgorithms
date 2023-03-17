package others.ListVsArrays.ArrayListvsHashMap;

import java.util.ArrayList;

public class Compare {


    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hi");
        arrayList.add("Hello");
        arrayList.add("World");
        if (!arrayList.contains("Hi")) {
            arrayList.add("Hi");
        }
        System.out.println("count = " + arrayList.size());
    }
}
