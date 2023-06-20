import java.awt.*;

/**
 * Orphaned objects are objects that have no variable
 * referencing it. Orphaned objects are subject to 
 * garbage collection.
 */
public class OrphanedObjects {
    public static void main(String[] args) {
        Color a, b;

        a = new Color(160, 82, 45);
        b = new Color(255, 255, 0);

        System.out.println(a);
        System.out.println(b);
        // now the old identity of b is orphaned 
        // (will be marked for garbage collection)
        b = a;
        System.out.println(a);
        System.out.println(b);

    }
}
