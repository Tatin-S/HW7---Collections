package test.collections;

import java.util.*;
public class ArrayListExample {
    public List<String> ArrayListElements;

    public void searchArrayListElement (String element) {
        for (String arrayListElement : ArrayListElements) {
            if (arrayListElement.equals(element)) {
                System.out.println("Элемент коллекции ArrayList найден: "
                        + arrayListElement);
                break;
            }
        }
    }

    public void removeArrayListElement (String element){
        for (int i = 0; i < ArrayListElements.size(); i++) {
            if (ArrayListElements.get(i).equals(element)){
                System.out.println("Удаление элемента коллекции ArrayList: "
                        + ArrayListElements.get(i));
                ArrayListElements.remove(i);
                break;
            }
        }
    }

    public void printArrayListElement (){
        for (int i = 0; i < ArrayListElements.size(); i++) {
                System.out.println("Элемент коллекции ArrayList " + i + ": "
                        + ArrayListElements.get(i));
        }
    }

 public void addArrayListElement(String element) {
       ArrayListElements.add(element);
 }

    public ArrayListExample () {
        this.ArrayListElements = new ArrayList<>();
    }
}
