package ru.ivbo_11_19.all_practices.practice3.Human;

public class Hand {

    private boolean isRight;
    private int strong;

    public Hand(boolean isRight, int strong) {
        this.isRight = isRight;
        this.strong = strong;
    }

    public boolean isRight() {
        return isRight;
    }

    public void setRight(boolean right) {
        isRight = right;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public String can() {
        return isRight ? "двигает правой рукой" : "двигает левой рукой";
    }
}
