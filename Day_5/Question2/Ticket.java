package Question2;

public class Ticket {
    private int ticketId;
    private  int price;
    private  static int availableTickets;

    public Ticket(int ticketId, int price,int availableTickets) {
        this.ticketId = ticketId;
        this.price = price;
        this.availableTickets = availableTickets;
    }

    public int calculateTicketCost(int nooftickets){
        if(availableTickets > nooftickets){
            availableTickets -= nooftickets;
            return  nooftickets*this.price;
        }
        else{
            return -1;
        }
    }


    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getAvailableTickets() {
        return availableTickets;
    }

    public static void setAvailableTickets(int availableTickets) {
        Ticket.availableTickets = availableTickets;
    }
}
