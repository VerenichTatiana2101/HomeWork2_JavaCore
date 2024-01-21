public class MyMethods {
    /**
     * Написать метод,
     * возвращающий количество чётных элементов массива.
     * countEvens([2, 1, 2, 3, 4]) → 3
     * countEvens([2, 2, 0]) → 3
     * countEvens([1, 3, 5]) → 0
     */
    public int countEvens(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Написать функцию,
     * возвращающую разницу между самым большим и
     * самым маленьким элементами переданного не пустого массива.
     */
    public int differenceNumbersArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }
        return max - min;
    }

    /**
     * Написать функцию,
     * возвращающую истину,
     * если в переданном массиве есть два соседних элемента, с нулевым значением
     */
    public boolean nullElemens(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i + 1] == 0) return true;
        }
        return false;
    }


}
