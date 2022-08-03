public class BonusSalaryEmployee implements Employee {
    private double salary;
    private boolean bonus;

    public BonusSalaryEmployee(double salary, boolean bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public double calculateSalary() {
        if (bonus) {
            return this.salary+salary*0.2;
        } else {
            return this.salary;
        }
    }
}
