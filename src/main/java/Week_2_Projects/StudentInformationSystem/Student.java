package Week_2_Projects.StudentInformationSystem;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private Integer  id; //modern classlarda tercih edili. Islem yapilabilecegi icin wrapper class tercih edildi(Integer)
    private LocalDate birthdate;

    private Course[] course = new Course[5];

    public Course[] getCourse() {
        return course;
    }

    public void setCourse(Course[] course) {
        this.course = course;
    }

    public Student(String name, String surname, Integer id, LocalDate birthdate) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.birthdate = birthdate;
    }

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public void addCourse(Course courses,int index){
        if(index >= 0 && index<course.length){
            course[index] = courses;
            System.out.println("Ders basarili olarak eklendi. ");
        }else {
            System.out.println("Maksimum ders sayisisn astiniz");
        }
    }

    public void addNotes(Course course, int note){ //Obje bilgisi geciyoruz( Course)
        for(Course  c1 : getCourse()){
            if(c1.getName().equals(course.getName())){
                c1.setNote(note);
                System.out.println(c1.getName() + " dersi icin " + note+ " notunu giriniz.");
                break;
            }else{
                System.out.println("Bu ogrenci bu dersi almadigi icin not girisi yapamazsiniz.");
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", id=" + id +
                ", birthdate=" + birthdate +
                ", course=" + Arrays.toString(course) +
                '}';
    }
}
