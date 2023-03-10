package playground;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Learning_Arrays {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        set.forEach(System.out::println);
    }
}
