package Question4;

public class main {
    public static void main(String[] args) {
        Factory fact = new Factory();
        RuppeeNote RP1 = fact.Factory(10);
        RP1.getCurrency();



        RuppeeNote RP2 = fact.Factory(100);
        RP2.getCurrency();


        RuppeeNote RP3 = fact.Factory(1000);
        RP3.getCurrency();
    }
}
