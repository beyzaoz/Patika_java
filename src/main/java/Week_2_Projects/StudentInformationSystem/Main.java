package Week_2_Projects.StudentInformationSystem;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Teacher [] teachers = new Teacher[5];

        Teacher mathteacher = new Teacher("Ali", "Yilmaz", "5553465473");
        Teacher physicteacher = new Teacher("Fatma", "Kum", "5550981542");
        Teacher chemistryteacher = new Teacher("Hamdi", "Ata", "5554678987");
        Teacher sportteacher = new Teacher("Zulfu", "Ali", "5554659281");
        Teacher biologyteacher = new Teacher("Sumbul", "Zalim", "5557634567");

        teachers[0]= mathteacher;
        teachers[1]= physicteacher;
        teachers[2]= chemistryteacher;
        teachers[3]= sportteacher;
        teachers[4]= biologyteacher;







        Course mathcourse = new Course("Mathmatic","Math101", 8);
        Course physiccourse = new Course("Physic","Phy101", 7);
        Course chemistrycourse = new Course("Chemistry","Che101", 7);
        Course sportcourse = new Course("Sport","Sp101", 3);
        Course biologycourse = new Course("Biology","Che101", 7);

      //Bounded with two side
        //course uzerinde ogretmene ulasmak icin asagidaki uc satur gerekli
        mathcourse.setTeacher(mathteacher);//Assigned to course to teacher
        physiccourse.setTeacher(physicteacher);
        chemistrycourse.setTeacher(chemistryteacher);
        sportcourse.setTeacher(sportteacher);
        biologycourse.setTeacher(biologyteacher);


      //
        mathteacher.setCourse(mathcourse); //Assigned to math teacher to math class
        physicteacher.setCourse(mathcourse);
        chemistryteacher.setCourse(chemistrycourse);
        sportteacher.setCourse(sportcourse);
        biologyteacher.setCourse(biologycourse);


        Student [] student = new Student[4];
        Student student1 = new Student("Cem","dirman", 001, LocalDate.of(2015,03,23));
        Student student2 = new Student("Emir","al", 002, LocalDate.of(2015,05,25));
        Student student3 = new Student("Nehir","Al", 003, LocalDate.of(2015,06,12));
        Student student4 = new Student("Zeynep","Yil", 004, LocalDate.of(2015,8,27));

        student[0]= student1;
        student[1]= student2;
        student[2]= student3;
        student[3]= student4;


        Course[] courses = new Course[5];

        courses[0] = mathcourse;
        courses[1]=physiccourse;
        courses[2]=chemistrycourse;
        courses[3]=biologycourse;
        courses[4]= sportcourse;

        student1.setCourse(courses);
        student2.setCourse(courses);
        student3.setCourse(courses);
        student4.setCourse(courses);

        for(Teacher teacher : teachers){
            System.out.println(teacher);
        }

        for(Course course : courses){
            System.out.println(course);
        }

        for(Student students : student){
            System.out.println(students);
        }

        student1.addCourse(mathcourse, 0);
        student1.addCourse(physiccourse, 1);
        student1.addCourse(sportcourse, 2);

        student1.addNotes(mathcourse,85);
        student1.addNotes(physiccourse,55);
        student1.addNotes(sportcourse,100);
        student1.addNotes(chemistrycourse,65);
        student1.addNotes(biologycourse,95);


        student2.addNotes(mathcourse,85);
        student2.addNotes(physiccourse,45);
        student2.addNotes(sportcourse,90);
        student2.addNotes(chemistrycourse,65);
        student2.addNotes(biologycourse,85);

        for ( Course c1: student1.getCourse()){
            System.out.println(student1.getName().toUpperCase() + "  icin " + c1.getName().toUpperCase() + " dersi icin " + c1.getNote() + "notunu almistir.");
        }












    }
}
