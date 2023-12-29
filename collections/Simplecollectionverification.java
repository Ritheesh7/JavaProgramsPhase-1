package collections;
import java.util.ArrayList;
import java.util.List;

public class Simplecollectionverification {
    public static void main(String[] args) {
        // Create an ArrayList
        List<String> myList = new ArrayList<>();

        // Add elements to the list
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");

        // Display elements in the list
        System.out.println("Elements in the list: " + myList);

        // Check the size of the list
        System.out.println("Size of the list: " + myList.size());

        // Check if the list contains a specific element
        String searchElement = "Banana";
        System.out.println("Does the list contain '" + searchElement + "': " + myList.contains(searchElement));

        // Remove an element from the list
        String elementToRemove = "Apple";
        myList.remove(elementToRemove);
        System.out.println("List after removing '" + elementToRemove + "': " + myList);

        // Check if the list is empty
        System.out.println("Is the list empty: " + myList.isEmpty());
    }
}
