package AL;

import java.util.*;

public class ALtry {

    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>(List.of("0","0","0","0", "0", "0", "1", "2", "3"));
        while (numbers.size() > 1 && numbers.get(0).equals("0") && !numbers.get(1).equals(".")) {
            numbers.remove(0);
        }
        System.out.println(String.join("", numbers));  // Output: "123"
    }

}
