import java.awt.Color;

/**
 * An array of objects is an array of references 
 * (i.e. array of pointers)
 */
public class ArrayOfObjects {
    public static void main(String[] args) {
        Color[] colors = new Color[2];

        colors[0] = new Color(255, 255, 0);
        colors[1] = new Color(160, 82, 45);

        // identity of the array
        System.out.println(colors);
        // identities of the array elements
        System.out.println(System.identityHashCode(colors[0]));
        System.out.println(System.identityHashCode(colors[1]));
        // String representation of the array elements
        System.out.println(colors[0]);
        System.out.println(colors[1]);
    }
}
