package ru.ivbo_11_19.all_practices.practice4.Author;

public class Author {

    String name;
    String email;
    char gender;

    public Author (String name, String email, char gender) {
        this.name=name;
        this.email=email;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }


    public String toString() {
        String s = '\n'+"Author name - " + name + '\n' + "Email - " + email + '\n' + "Gender " + gender;
        return s;
    }

    public Author () {
    }
}
