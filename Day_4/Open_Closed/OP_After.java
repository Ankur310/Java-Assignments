package Open_Closed;

interface Shape{
    int calculateArea();
}

class Rect_angle implements Shape {

    int length;
    int width;

    public int calculateArea() {

        return length * width;
    }
}
class Cir_cle implements Shape {

    public int radius;

    public int calculateArea() {

        return (22 / 7) * radius * radius;
    }
}




public class OP_After {
    public static void main(String[] args) {

        Rect_angle rect = new Rect_angle();
        rect.length = 4;
        rect.width = 10;

        int rect_area = rect.calculateArea();
        System.out.println(rect_area);



        Cir_cle cir = new Cir_cle();
        cir.radius = 12;
        int cir_area = cir.calculateArea();
        System.out.println(cir_area);
    }
}
