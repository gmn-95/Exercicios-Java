public class Employee {
    private String name;
    private String lastName;
    private double annualSalary;

    public Employee(String name, String lastName, double annualSalary){
        this.name           = name;
        this.lastName       = lastName;
        this.annualSalary   = annualSalary;
    }

    public void salaryIncrease(double increase){
        annualSalary += annualSalary * increase;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
}
