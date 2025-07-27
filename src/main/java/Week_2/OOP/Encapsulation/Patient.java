package Week_2.OOP.Encapsulation;

public class Patient {
 //Fields
   private String idNumber;
    private String name;
    private String surname;
    private int age;

    public Patient(String idNumber){
        setIdNumber(idNumber);

    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        if(idNumber.length()!=11){
            System.out.println("Wrong Id number");
        } else{
        this.idNumber = idNumber;
            System.out.println("CorrectId. You can Access to the informations.");
    }}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//Get Set Methods





}
