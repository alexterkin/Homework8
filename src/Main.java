import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1+2");
        int [] array1 = new int [3];
        array1 [0] = 1;
        array1 [1] = 2;
        array1 [2] = 3;
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1 [i]);
            if (i != array1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        double [] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2 [i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        int [] array3 = {56, -115, 38, -574, 216};
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3 [i]);
            if (i != array3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1 [i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2 [i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = array3.length - 1; i >= 0; i--) {
            System.out.print(array3 [i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < array1.length; i++) {
            if (array1 [i] % 2 != 0) {
                array1 [i]++;
            }
        }
        System.out.println(Arrays.toString(array1));
    }
}