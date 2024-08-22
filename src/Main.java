import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача1,2");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        System.out.print(number[0] + ",");
        System.out.print(number[1] + ",");
        System.out.print(number[2]);
        System.out.println(" ");

        double[] fractionalNumber = {1.57, 7.654, 9.986};
        System.out.print(fractionalNumber[0] + ", ");
        System.out.print(fractionalNumber[1] + ", ");
        System.out.print(fractionalNumber[2]);
        System.out.println(" ");

        int[] weight = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i] + " ");
        }

        System.out.println(" ");
        System.out.println("Задача3");

        System.out.print(number[2] + ",");
        System.out.print(number[1] + ",");
        System.out.print(number[0]);
        System.out.println(" ");

        System.out.print(fractionalNumber[2] + ", ");
        System.out.print(fractionalNumber[1] + ", ");
        System.out.print(fractionalNumber[0]);
        System.out.println(" ");

        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача4");
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }


}
