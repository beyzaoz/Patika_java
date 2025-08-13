package Week_5_Projects.InnerClass;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee.ContactInfo contactInfo = employee.new ContactInfo();
        contactInfo.printInfos();
    }
}
