package Week_3_Projects.Book_Shopping_System;

public class Author {
    private String name;
    private Gender gender;
    private String surname;
    private String bio;

    public Author(String name, String surname,Gender gender) {
        this.name = name;
        this.surname = surname;
        this.gender = getGender();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", surname='" + surname + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }
}
