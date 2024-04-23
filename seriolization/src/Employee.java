

import java.io.Serializable;

public class Employee implements Serializable {

    private int EmplId;
    private String empName;
    private double empSalary;
    private String empEmail;
    private transient int pan;

    private static final long serialVersionUID = 131435146146156151L;

    public Employee(int emplId, String empName, double empSalary, String empEmail, int pan) {
        EmplId = emplId;
        this.empName = empName;
        this.empSalary = empSalary;
        this.empEmail = empEmail;
        this.pan = pan;
    }

    public int getEmplId() {
        return EmplId;
    }

    public void setEmplId(int emplId) {
        EmplId = emplId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getPan() {
        return pan;
    }

    public void setPan(int pan) {
        this.pan = pan;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "EmplId=" + EmplId +
                ", empName='" + empName + '\'' +
                ", empSalary=" + empSalary +
                ", empEmail='" + empEmail + '\'' +
                ", pan=" + pan +
                '}';
    }
}