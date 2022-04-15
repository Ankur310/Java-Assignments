package LSP;

class BookDelivery {

    String titles;
    Integer userID;

    void getDeliveryLocations() {
        System.out.println("Simply getting location");
    }
}

class PosterMapDelivery extends BookDelivery {

    @Override
    void getDeliveryLocations() {
        System.out.println("PostMapDelivery functionality to be add in bookDelivery");
    }
}


class AudioBookDelivery extends BookDelivery {

    @Override
    void getDeliveryLocations() {

        /* can't be implemented since

         * Audio book doesn't have

         * a physical location. */

    }

}




public class lsp_before {
    public static void main(String[] args) {

    }
}
