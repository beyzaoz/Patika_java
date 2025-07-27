package Week_2_Projects.SallaryCalculator;

public class Employee {

    public String name;
    public int sallary;
    public int workHours;//WEEKLY
    public String hireYear; //YEAR OF START






    //CREATED A CONSTRACTOR
    public Employee(int salary, int workHours, String hireYear, String name) {
        this.sallary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.name = name;
    }


//GET/SET METHODS
    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return sallary;
    }

    public void setSalary(int salary) {
        this.sallary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public String getHireYear() {
        return hireYear;
    }

    public void setHireYear(String hireYear) {
        this.hireYear = hireYear;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary='" + sallary + '\'' +
                ", workHours='" + workHours + '\'' +
                ", hireYear='" + hireYear + '\'' +
                '}';
    }


}
