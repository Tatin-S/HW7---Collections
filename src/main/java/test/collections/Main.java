package test.collections;

public class Main {
    public static void main(String[] args) {

        ArrayListExample fruits = new ArrayListExample();
        fruits.addArrayListElement("orange");
        fruits.addArrayListElement("apple");
        fruits.addArrayListElement("cherry");
        fruits.printArrayListElement();
        fruits.removeArrayListElement("apple");
        fruits.searchArrayListElement("cherry");
        fruits.printArrayListElement();

        SetExample vegetables = new SetExample();
        vegetables.addSetElement("tomato");
        vegetables.addSetElement("potato");
        vegetables.addSetElement("cucumber");
        vegetables.printSetElement();
        vegetables.searchSetElement("potato");
        vegetables.removeSetElement("tomato");
        vegetables.printSetElement();

        HashMapExample figures = new HashMapExample();
        figures.addHashMapElement("square", "red");
        figures.addHashMapElement("triangle", "yellow");
        figures.addHashMapElement("circle", "blue");
        figures.printHashMapElement();
        figures.searchHashMapElement("triangle");
        figures.removeHashMapElement("circle");
        figures.printHashMapElement();

        DequeExample cutlery = new DequeExample();
        cutlery.addDequeElement("knife");
        cutlery.addDequeElement("spoon");
        cutlery.addDequeElement("fork");
        cutlery.printDequeElement();
        cutlery.searchDequeElement("spoon");
        cutlery.removeDequeElement("knife");
        cutlery.printDequeElement();
    }
}
