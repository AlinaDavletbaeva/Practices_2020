package ru.ivbo_11_19.all_practices.practice3.Human;
public class Human {

    private Head head;
    private Leg leftLeg;
    private Leg rightLeg;
    private Hand leftHand;
    private Hand rightHand;

    public Human(String headColor, String eyeColor, int speed, int strong) {
        this.head = new Head(headColor, eyeColor);
        this.leftLeg = new Leg(false, speed);
        this.rightLeg = new Leg(true, speed);
        this.leftHand = new Hand(false, strong);
        this.rightHand = new Hand(true, strong);
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Leg getLeftLeg() {
        return leftLeg;
    }

    public void setLeftLeg(Leg leftLeg) {
        this.leftLeg = leftLeg;
    }

    public Leg getRightLeg() {
        return rightLeg;
    }

    public void setRightLeg(Leg rightLeg) {
        this.rightLeg = rightLeg;
    }

    public Hand getLeftHand() {
        return leftHand;
    }

    public void setLeftHand(Hand leftHand) {
        this.leftHand = leftHand;
    }

    public Hand getRightHand() {
        return rightHand;
    }

    public void setRightHand(Hand rightHand) {
        this.rightHand = rightHand;
    }

    public String can() {
        return head.can() + "\n" +
                rightHand.can() + "\n" +
                leftHand.can() + "\n" +
                rightLeg.can() + "\n" +
                leftLeg.can();
    }
}
