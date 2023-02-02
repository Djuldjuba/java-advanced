public class Array {
    public static void main(String[] args) {
        int[] array = new int[20];
        int max = -10;
        int min = 10;
        int maxIndex = 0;
        int minIndex = 0;
        System.out.println("Изначальный массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
            System.out.println(array[i]);
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }

        array[maxIndex] = min;
        array[minIndex] = max;

        System.out.println("Новый массив где поменялись местами максимальное и минимальное значение:");
        for (int j : array) {
            System.out.println(j);
        }
    }
}
