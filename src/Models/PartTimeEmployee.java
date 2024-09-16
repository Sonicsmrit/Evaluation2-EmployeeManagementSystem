package Models;

public class PartTimeEmployee extends Employees {
    public int hours;
    public int moneyPerhour;

    public PartTimeEmployee(int empID, String empName, String empSurname, String empEmail, int empPhone, int hours, int moneyPerhour) {
        super(empID, empName, empSurname, empEmail, empPhone);
        this.hours = hours;
        this.moneyPerhour = moneyPerhour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getMoneyPerhour() {
        return moneyPerhour;
    }

    public void setMoneyPerhour(int moneyPerhour) {
        this.moneyPerhour = moneyPerhour;
    }
}
