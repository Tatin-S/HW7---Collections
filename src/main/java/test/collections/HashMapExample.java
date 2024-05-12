package test.collections;

import java.util.*;

public class HashMapExample {
    public  HashMap<String, String> HashMapElements;

    public void searchHashMapElement (String element) {
        if (HashMapElements.containsKey(element)) {
            String value = HashMapElements.get(element);
            System.out.println("Элемент коллекции HashMap найден: " + element
                    + ", Свойство элемента: " + value);
        }
    }

    public void removeHashMapElement(String element){
        boolean removed = HashMapElements.remove(element) != null;
        if (removed)
            System.out.println("Элемент коллекции HashMap удален: "
                    + element);
    }

    public void printHashMapElement(){
            int i = 0;
            for (Map.Entry<String, String> entry : HashMapElements.entrySet()) {
                System.out.println("Элемент коллекции HashMap " + i + ": " + entry.getKey()
                        + ", Свойство элемента: " + entry.getValue());
                i++;
            }
    }

    public void addHashMapElement(String element, String properties) {
        HashMapElements.put(element, properties);
    }

    public HashMapExample () {
        HashMapElements = new  HashMap<>();
    }
}
