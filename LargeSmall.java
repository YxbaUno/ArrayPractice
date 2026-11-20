import java.util.Arrays;
public class LargeSmall {
    public static void main(String[] args) {
        int[] val = {102, 573, 11, 482, 0, -62, 73, 6767};
        int large = val[0];
        int small = val[0];
        int largeIndex = 0;
        int smallIndex = 0;

        for (int i = 0; i < val.length; i++) {
            if (val[i] > large) {
                large = val[i];
                largeIndex = i;
            }

            if (val[i] < small) {
                small = val[i];
                smallIndex = i;
            }
        }

        System.out.println("Array: " + Arrays.toString(val));
        System.out.println();
        System.out.println("Largest: " + large + " at index " + largeIndex);
        System.out.println("Smallest: " + small + " at index " + smallIndex);
    }
}
