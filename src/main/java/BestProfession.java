public class BestProfession extends Human {
    String profession;
    int salary;

    public BestProfession(String name, Profession profession, int salary) {
        super(name, profession);
        this.salary = salary;
    }

    public String getProfession() {
        return profession;
    }

    public int getSalary() {
        return salary;
    }

}
