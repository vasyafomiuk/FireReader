package app.filereader.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;
    private String gender;
    private String DOB;
    private String favoriteColor;
    private String middleInitial;

    public Person(String lastName, String firstName, String gender, String DOB, String favoriteColor, String middleInitial) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
        this.DOB = DOB;
        this.favoriteColor = favoriteColor;
        this.middleInitial = middleInitial;
    }

    public Person(String lastName, String firstName, String gender, String DOB, String favoriteColor) {
        this(lastName, firstName, gender, DOB, favoriteColor, "N/A");
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return LocalDate.parse(this.DOB, DateTimeFormatter.ofPattern("M/d/yyyy"));
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName) &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(DOB, person.DOB) &&
                Objects.equals(favoriteColor, person.favoriteColor) &&
                Objects.equals(middleInitial, person.middleInitial);

    }

    @Override
    public int hashCode() {
        return Objects.hash(lastName, firstName, gender, DOB, favoriteColor, middleInitial);
    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", date of birth='" + DOB + '\'' +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }

    public void printPersonsInfo() {
        System.out.println(this.lastName + ", " + this.firstName + ", " + this.gender + ", " + this.DOB + ", " + this.favoriteColor);
    }
}
