import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        int[] first = new int[]{1, 2, 3};
        System.out.println(first[0]);
        System.out.println(first[1]);
        System.out.println(first[2]);
        double[] second = new double[]{1.57, 7.654, 9.986};
        System.out.println(second[0]);
        System.out.println(second[1]);
        System.out.println(second[2]);
        int[] third = new int[]{14, 81, 21, 51};
        System.out.println(third[0]);
        System.out.println(third[1]);
        System.out.println(third[2]);
        System.out.println(third[3]);
        System.out.println(" ");
        System.out.println("Задача №2");
        System.out.println(first[0] + ", " + first[1] + ", " + first[2]);
        System.out.println(second[0] + ", " + second[1] + ", " + second[2]);
        System.out.println(third[0] + ", " + third[1] + ", " + third[2] + " ," + third[3]);
        System.out.println(" ");
        System.out.println("Задача №3");
        System.out.println(first[2] + ", " + first[1] + ", " + first[0]);
        System.out.println(second[2] + ", " + second[1] + ", " + second[0]);
        System.out.println(third[3] + " ," + third[2] + ", " + third[1] + ", " + third[0]);
        System.out.println(" ");
        System.out.println("Задача №4");
        for (int i = 0; i < first.length; i++){
            first[0] = first[0] + 1;
            first[2] = first[2] + 1;
            if (i % 2 == 0){
                System.out.println(first[0]);
                System.out.println(first[2]);
            }
        }
        System.out.println(Arrays.toString(first));
    }
}




