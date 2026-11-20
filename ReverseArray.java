import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] val = {1, 22, 333, 4444, 5, 66, 777};
        int[] revVal= new int[val.length];

        for (int i = 0; i < val.length; i++) {
            revVal[i] = val[val.length - 1 - i];
        }
        System.out.println("Original: " + Arrays.toString(val));
        System.out.println("Reversed: " + Arrays.toString(revVal));
    }
}
