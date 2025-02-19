package by.it.kubarkova.jd01_04;

public class Helper {
    static double findMax(double[] array) {
        if (0 == array.length) {
            return Integer.MAX_VALUE;
        } else {
            double max = array[0];
            for (double element : array) {
                if (max < element) max = element;

            }

            return max;
        }
    }

    static double findMin(double[] array) {
        if (0 == array.length) {
            return Integer.MAX_VALUE;
        } else {
            double min = array[0];
            for (double element : array) {
                if (min > element) min = element;

            }

            return min;
        }
    }

    static void sort(double[] array) {
        boolean swap;
        int last = array.length - 1;
        do {
            swap = false;
            for (int j = 0; j < last; j++) {
                if (array[j] > array[j + 1]) {
                    double buffer = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                    swap = true;
                }
            }
            last--;
        }
        while (swap);

    }
}
