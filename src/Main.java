public class Main {
    public static void main(String[] args) {
        // Задача 1.1
        System.out.println("Задача 1.1");
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        // Задача 1.2
        System.out.println("Задача 1.2");
        double[] arr2 = {1.57, 7.654, 9.986};
        // Задача 1.3
        System.out.println("Задача 1.3");
        float[] arr3 = new float[5];
        // Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
            for (int i = 0; i < arr2.length; i++) {
                System.out.print(arr2[i] + ", ");
            }
        System.out.println();
                for (int i = 0; i < arr3.length; i++) {
                    System.out.print(arr3[i] + ", ");
        }
        // Задача 3
        System.out.println();
        System.out.println("Задача 3");
        for (int n = arr.length-1; n > -1; n--) {
            System.out.print(arr[n] + ", ");
        }
        System.out.println();
        for (int n = arr2.length-1; n > -1; n--) {
            System.out.print(arr2[n] + ", ");
        }
        System.out.println();
        for (int n = arr3.length-1; n > -1; n--) {
            System.out.print(arr3[n] + ", ");
        }
        // Задача 4
        System.out.println();
        System.out.println("Задача 4");
        int[] array3 = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int m = 0; m < arr.length; m++) {
            if (arr[m] % 2 == 0) {
                System.out.println(arr[m]);
            }
            if (arr[m] % 2 == 1){
                System.out.println(arr[m] + 1);
            }
        }
    }
}