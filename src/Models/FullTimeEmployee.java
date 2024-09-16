package Models;

public class FullTimeEmployee extends Employees{
   private double bonus;
   private double salary;


    public FullTimeEmployee(int empID, String empName, String empSurname, String empEmail, int empPhone, double bonus, double salary) {
        super(empID, empName, empSurname, empEmail, empPhone);
        this.bonus = bonus;
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
