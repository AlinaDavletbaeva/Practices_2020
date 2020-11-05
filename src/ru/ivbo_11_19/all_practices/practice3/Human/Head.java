package ru.ivbo_11_19.all_practices.practice3.Human;

public class Head {

    private String hairColor;
    private String eyeColor;

    public Head(String hairColor, String eyeColor) {
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String can() {
        return "пытается понять Java";
    }
}
