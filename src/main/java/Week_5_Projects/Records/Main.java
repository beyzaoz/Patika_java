package Week_5_Projects.Records;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Ayse","Kocak",109);
        Student student2 = new Student("Hasan","Senay",134);
        Student student3 = new Student("Ayse","Kocak",109);
        System.out.println(student1+"\n"+student2+ "\n"+student3);

        System.out.println(student1.equals(student3));
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
        System.out.println(student3.hashCode());




    }


}
