package Models;

public class Contractor extends Employees{
    private int ContractAmount;

    public Contractor(int empID, String empName, String empSurname, String empEmail, int empPhone, int contractAmount) {
        super(empID, empName, empSurname, empEmail, empPhone);
        ContractAmount = contractAmount;
    }

    public int getContractAmount() {
        return ContractAmount;
    }

    public void setContractAmount(int contractAmount) {
        ContractAmount = contractAmount;
    }
}
