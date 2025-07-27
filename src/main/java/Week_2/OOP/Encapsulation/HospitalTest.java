package Week_2.OOP.Encapsulation;

public class HospitalTest {
    public static void main(String[] args) {
        Patient patient = new Patient("12356789623");
        patient.setName("Ahmet");
        patient.setSurname("Ak");
        patient.setAge(46);


        Patient patient2 = new Patient("45637856241");
        patient.setName("Fatma");
        patient.setSurname("Yilmaz");
    }
}
