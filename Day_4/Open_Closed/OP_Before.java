package Open_Closed;

class Rectangle  {

    public int length;
    public int width;
}

class Circle {

    public int radius;
}


class AreaCalculator{

    public int calculateRectangleArea(Rectangle rectangle){

        return rectangle.length * rectangle.width;
    }

    public int calculateCircleArea(Circle circle){

        return (22 / 7) * circle.radius * circle.radius;

    }
}


public class OP_Before {
    public static void main(String[] args) {

        Rectangle rec = new Rectangle();
        rec.length = 5;
        rec.width = 10;

        Circle cl = new Circle();
        cl.radius =  7;


        AreaCalculator ar = new AreaCalculator();
        int res1 = ar.calculateRectangleArea(rec);
        int res2 = ar.calculateCircleArea(cl);

        System.out.println("Rectangle area is " + res1);
        System.out.println("Circle area is " + res2);


    }
}
