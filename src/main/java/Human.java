public class Human {
    //TODO Создать вложенный класс "профессия" и вынести в него всё, что касается профессии из класса Human.
    // Все поля при заполнении создавать через генераторы (наподобие генератора случайных чисел).
    // Придумать генераторы строк, например имени и названия профессии.
    // Вычислить у кого из сотрудников самая большая зарплата и выведи в консоль его имя и зарплату.


    String name;
    Profession profession;

    public Human() {
        this.name = Util.generateHumanName();
        this.profession = new Profession();
    }

    public class Profession {
        String profession;
        int salary;
        int age;
        int experience;

        public Profession() {
            this.profession = Util.generateProfessionName();
            this.salary = Util.generateSalary();
            this.age = Util.generateAge();
            this.experience = Util.generateExperience();
        }

        @Override
        public String toString() {
            return " {" +
                    "профессия = '" + profession + '\'' +
                    ", зарплата = " + salary + " USA Rubles " +
                    ", возвраст = " + age + " лет " +
                    ", опыт = " + experience + " лет" +
                    '}';
        }
    }

    @Override
    public String toString() {
        return " {" +
                "Имя сотрудника = '" + Util.generateHumanName() + '\'' +
                profession +
                '}';
    }
}