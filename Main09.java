import java.util.HashSet;
import java.util.Set;

public class Main09 {

    /*
    Write a method hasEven that accepts a set of integers as a parameter and returns true if the set contains at least
    one even integer and false otherwise. If passed the empty set, your method should return false .
     */

    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        a.add(1);
        a.add(2);
        b.add(1);
        b.add(1);
        System.out.println(hasEven(a));
        System.out.println(hasEven(b));
    }

    public static boolean hasEven(Set<Integer> set) {
        for (int n:set) {
            if (n % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}
