package test.collections;

import java.util.*;

public class DequeExample {
    Deque<String> DequeElements;

    public void searchDequeElement (String element) {
        for (String item : DequeElements) {
            if (item.equals(element)) {
                System.out.println("Элемент коллекции Deque найден: "
                        + item);
                break;
            }
        }
    }

    public void removeDequeElement (String element){
        for (String item : DequeElements) {
            if (item.equals(element)){
                System.out.println("Удаление элемента коллекции Deque: "
                        + item);
                DequeElements.remove(item);
                break;
            }
        }
    }

    public void printDequeElement (){
        int i = 0;
        for (String item : DequeElements) {
            System.out.println("Элемент коллекции Deque " + i + ": "
                    + item);
            i++;
        }
    }

    public void addDequeElement(String element) {
        DequeElements.add(element);
    }

    public DequeExample () {
        DequeElements = new ArrayDeque<>();
    }
}
