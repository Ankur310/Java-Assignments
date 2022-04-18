package Question2;

public class Main {
    public static void main(String[] args) {
        mall mall = new mall();
        mall.buyFood();
        mall.buyticket();



        CinemaHall cine = new CinemaHall();
        cine.buyFood();
        cine.buyticket();
        cine.buyticket();


        //BECAUSE OF VIEW3D OPTION IS NOT AVAILABLE IN MALL
//        IT CONNOT BE SUBSTAINABLE INTO SUBCLASS;
    }
}
