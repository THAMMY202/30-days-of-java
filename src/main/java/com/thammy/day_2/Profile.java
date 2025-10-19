package com.thammy.day_2;

//Challenge
//Create a "profile" using variables for yourself:
public class Profile{

    private String firstName;
    private int age;
    private String favoriteColor;
    private Boolean isStudent;
    private String homeTown;

    public Profile() {
    }

    public Profile(String firstName, int age, String favoriteColor, Boolean isStudent, String homeTown) {
        this.firstName = firstName;
        this.age = age;
        this.favoriteColor = favoriteColor;
        this.isStudent = isStudent;
        this.homeTown = homeTown;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public Boolean getStudent() {
        return isStudent;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setStudent(Boolean student) {
        isStudent = student;
    }

    @Override
    public String toString() {
        return "Profile{" +
                "firstName='" + firstName + '\'' +
                ", age=" + age +
                ", favoriteColor='" + favoriteColor + '\'' +
                ", isStudent=" + isStudent +
                ", homeTown='" + homeTown + '\'' +
                '}';
    }
}
