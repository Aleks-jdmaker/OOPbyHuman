import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        int[] salaries = new int[5];
        int[] ages = new int[5];

        final Human[] huArr = new Human[5];
        final BestProfession[] bestProfessions = new BestProfession[5];

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
        System.out.println("_____");
        System.out.println(maxValue + " - самая большая ЗП");

        for (int i = 0; i < huArr.length; i++) {
            if (maxValue == huArr[i].profession.salary) {
                System.out.println(huArr[i].name + " - имя чувака с самой большой ЗП");
            }
        }

        for (int i = 0; i < huArr.length; i++) {
            ages[i] = huArr[i].profession.age;
        }

        int minValue = Util.arrayMinValues(ages);

        for (int i = 0; i < huArr.length; i++) {
            if (minValue == huArr[i].profession.age) {
                System.out.println(huArr[i].name + ", " + huArr[i].profession.salary + " - " +
                        "имя и ЗП самого молодого сотрудника.");
            }
        }

    }

    // TODO: 22.09.2023 в последнем цикле у тебя результат выводится в консоль разными строчками(выражениями),
    //  то есть ты сначала выводишь huArr[i].name, а потом через + (плюс по научному конкатенация называется)
    //  выводишь huArr[i].profession.salary. Теперь надо сделать более продвинуто. После того, как ты получил
    //  максимальную зарплату и её имя надо не тупо напечатать в коноль, а
    //  1. Cоздать новый объект совершенно нового типа (класс) BestProfession с полями профессия и зарплата.
    //  2. После того, как из исходного массива получил поля зарплата и профессия, ЗАСЕТИТЬ эти поля
    //  в одноимённые поля нового класса. Для этого ндао создать новый класс и два поля.
    //  3. Создать СЕТТЕРЫ и переопределить метод toString.
    //  4. В классе Main создать объект нового класса BestProfession.
    //  5. В цикле начать итерировать исходный массив и сетить поля из исходного массива в поля нового массива.
    //  6. После за пределами цикла вывести в коноль новый объект нового типа(класса) и он должен распечататься
    //  по шаблону метода toString().



}