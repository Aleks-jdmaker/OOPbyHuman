import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] salaries = new int [5];
        String[] names = new String[5];
        List<Human> humanList = new ArrayList<>();
        List<Integer> salariesList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
           humanList.add(new Human());
        }
        salariesList = humanList.stream().map(a -> a.profession.salary).collect(Collectors.toList());
        int maxValue = salariesList.stream().max(Integer::compareTo);

        for (int i = 0; i < salariesList.size(); i++) {
            if ()
        }

    }
}