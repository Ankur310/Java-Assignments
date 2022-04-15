package ISP;

interface Order_Interface{

     void placeOrder();
}

interface Payment_Interface{

     void payForOrder();
}

class OnlineCustomer_Impl implements Order_Interface, Payment_Interface {

    @Override
    public void placeOrder() {

        // logic to place online order
    }

    @Override
    public void payForOrder() {

        // logic to do online payment
    }
}


class WalkInCustomer_Impl implements Order_Interface, Payment_Interface {

    @Override
    public void placeOrder() {

        // logic to place in-person order
    }

    @Override
    public void payForOrder() {

        // logic to do in-person payment
    }
}


class TelephoneCustomer_Impl implements Order_Interface, Payment_Interface {

    @Override
    public void placeOrder() {

        // logic to place telephonic order
    }

    @Override
    public void payForOrder() {

        // logic to do online payment
    }
}




public class ISP_After {
    public static void main(String[] args) {

    }
}
