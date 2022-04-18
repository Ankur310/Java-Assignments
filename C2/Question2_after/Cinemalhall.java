package Question2_after;

public class Cinemalhall implements buyTickets,BuyFood,view3D{
    @Override
    public void buyfood() {
        System.out.println("buying food");
    }

    @Override
    public void buytickets() {
        System.out.println("buying tickets");
    }

    @Override
    public void view3d() {
        System.out.println("viewing in 3d");
    }

}

