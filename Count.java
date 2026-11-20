import java.util.Arrays;

public class Count {
    public static void main(String[] args) {
        int[] val = {133, -35, 0, 835, -61, 0, 12, -76, 5564, 2};
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int i = 0; i < val.length; i++) {
            if (val[i] > 0) {
                positive++;
            } else if (val[i] < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.println("Array: " + Arrays.toString(val));
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
        System.out.println("Zero: " + zero);
    }
}
