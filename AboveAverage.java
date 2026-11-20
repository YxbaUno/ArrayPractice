import java.util.Arrays;
public class AboveAverage {
    public static void main(String[] args) {
        int[] val = {26, 670, 70, 540, 47, 35};
        double sum = 0;
        int count = 0;
      
        for (int i = 0; i < val.length; i++) {
            sum += val[i];
        }
        double average = sum / val.length;
        for (int i = 0; i < val.length; i++) {
            if (val[i] > average) {
                count++;
            }
        }

        System.out.println("Array: " + Arrays.toString(val));
        System.out.println("Average: " + average);
        System.out.println("Numbers above average: " + count);
    }
}
