/**
 * Manipulation od string references.
 * Here, for didactical purposes, we use the "identity hash code" 
 * as a surrogate for memory addresses (but these hash codes 
 * are not memory addresses)
 */
public class StringRefs {
    

    public static void main(String[] args) {
        // explicit instantion (not recommended)
        String s1 = new String("SA");
        String s2 = new String("SA");

        // shallow (pointer) equality
        System.out.println(s1 == s2); 

        // deep (content) equality
        System.out.println(s1.equals(s2)); 
        System.out.println(s2.equals(s1)); 
        
        // interning (recommended)
        String s3 = "SCS";
        String s4 = "SBC";
        String s5 = "SCS";
        String s6 = "SBC";

        System.out.println(s3 == s4);

        // printing the identity of strings
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));
        System.out.println(System.identityHashCode(s5));
        System.out.println(System.identityHashCode(s6));
        
    }
    
}
