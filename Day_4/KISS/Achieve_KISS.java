package KISS;

public class Achieve_KISS {
    public String weekday2(int day) throws Exception {
        if ((day < 1) || (day > 7)){
            throw new Exception();
        }

        String[] days = {
                "Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        return days[day - 1];
    }

    public static void main(String[] args) {

        Achieve_KISS ach = new Achieve_KISS();
        try{
            String str = ach.weekday2(4);
            System.out.println(str);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
