public class Main {
    public static void main(String[] args) {
        task1();
        task2();
//        task3();
//        task4();
    }

    public static void task1(){
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        boolean[] array3 = new boolean[2];
        array3[0] = true;
        array3[1] = false;
    }

    public static void task2(){
        System.out.println("task2");
        int[] array1 = new int[3];
        array1[0] = 1;
        array1[1] = 2;
        array1[2] = 3;

        double[] array2 = {1.57, 7.654, 9.986};

        boolean[] array3 = new boolean[2];
        array3[0] = true;
        array3[1] = false;

        for (int i = 0; i <array1.length; i++){
            if (i == array1.length - 1){
                System.out.print(array1[i]);
                break;
            }
            System.out.print(array1[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i <array2.length; i++){
            if (i == array2.length - 1){
                System.out.print(array2[i]);
                break;
            }
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i <array3.length; i++){
            if (i == array3.length - 1){
                System.out.print(array3[i]);
                break;
            }
            System.out.print(array3[i] + ", ");
        }
        System.out.println();
        System.out.println();
    }

}