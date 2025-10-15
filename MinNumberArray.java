public class MinNumberArray {
    public static int getMinNumberArray(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] array = {5, 14, 7, 8, 3, 6, 10};
        int index = getMinNumberArray(array);
        System.out.println("The minimum number is " + array[index]);
    }
}
