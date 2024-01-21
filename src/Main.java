import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        MyMethods methods = new MyMethods();
        int[] array = {2, 7, 4, 4, 6, 0, 0};
        System.out.println("Количество чётных элементов массива:");
        System.out.printf("countEvens(%s) -> %d", Arrays.toString(array), methods.countEvens(array));

        System.out.println("\nРазницу между самым большим и самым маленьким элементами переданного не пустого массива");
        System.out.println(methods.differenceNumbersArray(array));

        System.out.println("Возвращает истину, если в переданном массиве есть два соседних элемента, с нулевым значением");
        System.out.println(methods.nullElemens(array));
    }

}
