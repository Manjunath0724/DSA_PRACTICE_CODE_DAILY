package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lt_1436 {

    public String destCity(List<List<String>> paths) {
        Set<String> cities = new HashSet<>();
        for (List<String> path : paths) {
            cities.add(path.get(0));
        }

        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!cities.contains(dest)) {
                return dest;
            }
        }
        return "";

    }

public static void main(String[] args) {
    lt_1436 s = new lt_1436();
    List<List<String>> paths = List.of(
        List.of("London", "New York"),
        List.of("New York", "Lima"),
        List.of("Lima", "Sao Paulo")
    );
    String result = s.destCity(paths);
    System.out.println(result);
}
