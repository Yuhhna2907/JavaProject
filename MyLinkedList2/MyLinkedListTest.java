package MyLinkedList2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Orange");

        System.out.println("Current list:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("  " + list.get(i));
        }

        System.out.println("\nElement at index 2: " + list.get(2));
        System.out.println("Does the list contain 'Banana'? " + list.contains("Banana"));

        list.remove(1);
        System.out.println("\nAfter removing element at index 1:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("  " + list.get(i));
        }

        MyLinkedList<String> cloneList = list.clone();
        System.out.println("\nCloned list:");
        for (int i = 0; i < cloneList.size(); i++) {
            System.out.println("  " + cloneList.get(i));
        }

        list.clear();
        System.out.println("\nAfter clearing, size = " + list.size());
    }
}

