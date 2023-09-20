import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] salaries = new int[5];

        final Human[] huArr = new Human[5];

        for (int i = 0; i < 5; i++) {
            huArr[i] = new Human(Util.generateHumanName(),
                    new Human.Profession(Util.generateProfessionName(),
                            Util.generateSalary(),
                            Util.generateAge(),
                            Util.generateExperience()));
            System.out.println(huArr[i]);
        }

        for (int i = 0; i < huArr.length; i++) {
            salaries[i] = huArr[i].profession.salary;
            System.out.println(salaries[i]);
        }

        int maxValue = Util.arrayMaxValues(salaries);
        System.out.println(maxValue + " самая большая зп");

        for (int i = 0; i < huArr.length; i++) {
            if (maxValue == huArr[i].profession.salary) {
                System.out.println(huArr[i].name + " имя чувака с самой большой ЗП");
            }
        }

    }


}