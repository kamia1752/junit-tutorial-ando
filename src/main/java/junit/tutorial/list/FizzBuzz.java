package junit.tutorial.list;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> createFizzBuzzList(int n) {
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (0 == (i % 15)) {
                list.add("FizzBuzz");
            } else if (0 == (i % 5)) {
                list.add("Buzz");
            } else if (0 == (i % 3)) {
                list.add("Fizz");
            } else {
                list.add(String.valueOf(i));
            }
        }

        return list;
    }
}
