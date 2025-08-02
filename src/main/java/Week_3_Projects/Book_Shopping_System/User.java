package Week_3_Projects.Book_Shopping_System;

import java.time.LocalDate;

//Kullanici olusturuldu

public class User {
    private String name;
    private String email;
    private String pasaword;
    private Gender gender;
    private LocalDate birthdate;
    private LocalDate createdate;
    private Boolean isActive;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDate getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDate createdate) {
        this.createdate = createdate;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getPasaword() {
        return pasaword;
    }

    public void setPasaword(String pasaword) {
        this.pasaword = pasaword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, String email, String pasaword) { //imperative(zorunlu) parametrelerdir.
        this.name = name;
        this.email = email;
        this.pasaword = pasaword;

        this.createdate=LocalDate.now();// created date assigned when user created.
        this.isActive=true;
    }
}
