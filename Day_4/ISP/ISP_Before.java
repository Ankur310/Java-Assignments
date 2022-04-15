package ISP;

interface RestaurantInterface {

     void acceptOnlineOrder();

     void acceptTelephoneOrder();

     void acceptWalkInCustomerOrder();

     void payOnline();

     void payInPerson();

}

class OnlineCustomerImpl implements RestaurantInterface {

    public void acceptOnlineOrder() {

        //logic for placing online order
    }

    public void acceptTelephoneOrder() {

        //Not Applicable for Online Order

        throw new UnsupportedOperationException();
    }

    public void payOnline() {

        //logic for paying online
    }

    public void acceptWalkInCustomerOrder() {

        //Not Applicable for Online Order


    }

    public void payInPerson() {

        //Not Applicable for Online Order
    }
}





public class ISP_Before {
    public static void main(String[] args) {

    }
}
