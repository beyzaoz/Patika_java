package Week_5_Projects.Records;

public record Student(String name, String surname, int id) {
    //Alanlar (firstName, lastName, studentId) private final olarak tanımlanır.
    //record ile yazdığın sınıflar otomatik olarak equals(), hashCode(), toString() metodlarını üretir.

    public Student{
        if(name==null || surname==null || id==0){
            throw new IllegalArgumentException("Fill all blanks");
        }
    }
}
