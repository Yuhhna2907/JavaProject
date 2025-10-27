package MyList2;

public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");
        list.add(2, "Watermelon");
        System.out.println("Current List:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" " + list.get(i));
        }
        System.out.println("\n Element at index 2:" + list.get(2));
        System.out.println("Does the list contain 'Banana'?" + list.contains("Banana"));
        list.remove(1);
        System.out.println("\n After removing 'Banana'?" + list.contains("Banana"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" " + list.get(i));
        }
        MyList<String> cloneList = list.clone();
        System.out.println("\n Cloned List:");
        for (int i = 0; i < cloneList.size(); i++) {
            System.out.println(" " + cloneList.get(i));
        }
        list.clear();
        System.out.println("\n After clearing, size= " + list.size());

    }
}
