import java.util.Arrays;

/**
 * Various methods to copy and compare arrays.
 * Shallow comparison vs. deep comparison
 * Shallow copy vs. deep copy
 */
public class ArrayRefs {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{1, 2, 3};

        // identity (pointer) comparison
        // or "shallow comparison"
        System.out.println(a == b);

        // content comparison
        // or "deep comparison"
        System.out.println(Arrays.equals(a, b));

        System.out.println(a);

        System.out.println(Arrays.toString(a));

        // shallow copy (pointer copy)
        int[] c = b;

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));
        System.out.println(b);
        System.out.println(c);

        c[1] = 5;

        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.toString(c));

        // deep copy (content copy)
        int[] d = Arrays.copyOf(a, a.length);

        d[1] = 5;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(d));
        System.out.println(a);
        System.out.println(d);
        
    }
}
