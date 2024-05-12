package test.collections;

import java.util.*;

public class SetExample {

    public HashSet<String> SetElements;

    public void searchSetElement (String element) {
        boolean found = SetElements.contains(element);
        if (found) {
            System.out.println("Элемент коллекции HashSet найден: "
                    + element);
        }
    }

    public void removeSetElement (String element){
        boolean removed = SetElements.remove(element);
        if (removed)
            System.out.println("Элемент коллекции HashSet удален: "
                    + element);
    }

    public void printSetElement (){
        Iterator<String> iterator = SetElements.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            String elementNext = iterator.next();
            System.out.println("Элемент коллекции HashSet " + i + ": "
                    + elementNext);
            i++;
        }
    }

    public void addSetElement(String element) {
        SetElements.add(element);
    }

    public SetExample () {
        SetElements = new HashSet<>();
    }
}
