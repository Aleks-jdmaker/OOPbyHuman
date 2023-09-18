import java.util.Random;

public class Util {
    public static int getRandomInteger(int endBound) {
        return new Random().nextInt(endBound);
    }

    public static int calculateSalary() {
        int result = Util.getRandomInteger(100);
        return result * 100;
    }

    public static String generateHumanName() {
        // Генерация случайного имени Человечища
        String[] humanNames = {"Геннадий", "Светозар", "Тихомир", "Семён", "Есений", "Добрыня", "Агустин", "Аврам",
                "Боголеп", "Владлен", "Дионисий", "Ефрем"};
        int randomIndex = (int) (Math.random() * humanNames.length);
        return humanNames[randomIndex];
    }

    public static String generateProfessionName() {
        // Генерация случайного названия профессии
        String[] professionNames = {"Инженер", "Учитель", "Врач", "Сантехник", "Уборщик", "Программист", "Бухгалтер",
                "Тестировщик", "Водитель", "Директор"};
        int randomIndex = (int) (Math.random() * professionNames.length);
        return professionNames[randomIndex];
    }

    public static int generateSalary() {
        // Генерация случайной зарплаты
        return (int) (Math.random() * 100000);
    }

    public static int generateAge() {
        // Генерация случайного возраста
        return (int) (Math.random() * 40 + 20);
    }

    public static int generateExperience() {
        // Генерация случайного опыта работы
        return (int) (Math.random() * 10);
    }

    public static int arrayMaxValues(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
