package ru.ivbo_11_19.all_practices.practice5_6.Shapes;

class Square extends Rectangle{
    protected double side;


    Square(double side){
        this.side = side;
    }

    Square(double side, String color, boolean filled){
        this.side = side;
        this.color = color;
        this.filled = filled;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
        length=this.getWidth();
        side=width;
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(width);
        length=this.getWidth();
        side=width;
    }

    @Override
    public void setLength(double side) {
        super.setLength(length);
        width=this.getLength();
        side=length;
    }

    @Override
    public String toString() {
        return "Square: (" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + side +
                ", length=" + side +
                ", side=" + side +
                ')';
    }
}
