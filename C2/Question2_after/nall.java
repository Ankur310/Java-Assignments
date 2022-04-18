package Question2_after;

public class nall implements buyTickets , BuyFood{
    @Override
    public void buyfood() {
        System.out.println("buying food");
    }

    @Override
    public void buytickets() {
        System.out.println("buying tickets");
    }
}
