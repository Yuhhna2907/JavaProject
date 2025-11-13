package codegym;

import java.util.List;

public class RandomListFacade {
    private com.codegym.RandomList randomList;
    private com.codegym.ListFilter listFilter;
    private com.codegym.ListPrinter listPrinter;

    public RandomListFacade() {
        randomList = new com.codegym.RandomList();
        listFilter = new com.codegym.ListFilter();
        listPrinter = new com.codegym.ListPrinter();
    }

    public void printRandomEvenList() {

        List<Integer> numbers = randomList.generateList(10, 0, 100);


        List<Integer> evenNumbers = listFilter.filterEven(numbers);


        listPrinter.printList(evenNumbers);
    }
}
