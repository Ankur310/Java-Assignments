package Question2_after;

public class main {
    public static void main(String[] args) {
        nall n1 = new nall();
        n1.buyfood();
        n1.buytickets();


        Cinemalhall cin = new Cinemalhall();
        cin.buyfood();
        cin.buytickets();
        cin.view3d();


        //Now we can convert into one others subtype without disturbing the program.
    }
}
