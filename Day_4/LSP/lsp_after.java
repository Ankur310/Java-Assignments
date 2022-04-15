package LSP;

class Book_Delivery {

    String title;
    Integer userID;

}

class OfflineDelivery extends Book_Delivery {

    void getDeliveryLocations() {
          //code will be written here
    }
}

class OnlineDelivery extends Book_Delivery{

    void getSoftwareOptions() {
          //your code here
    }
}


class Poster_MapDelivery extends OfflineDelivery {

    @Override
    void getDeliveryLocations() {
          //
    }

}

class Audio_BookDelivery extends OnlineDelivery {

    @Override
    void getSoftwareOptions() {
          ////
    }

}


public class lsp_after {
    public static void main(String[] args) {

    }
}
