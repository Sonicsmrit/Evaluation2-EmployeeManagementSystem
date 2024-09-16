package Models;

public class Employees {
    public int empID;
    public String empName;
    public String empSurname;
    public String empEmail;
    public int empPhone;

    public Employees(int empID, String empName, String empSurname, String empEmail, int empPhone) {
        this.empID = empID;
        this.empName = empName;
        this.empSurname = empSurname;
        this.empEmail = empEmail;
        this.empPhone = empPhone;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpSurname() {
        return empSurname;
    }

    public void setEmpSurname(String empSurname) {
        this.empSurname = empSurname;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(int empPhone) {
        this.empPhone = empPhone;
    }

    public Employees() {
        super();
    }




}
