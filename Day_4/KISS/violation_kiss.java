package KISS;

public class violation_kiss {
    public String weekday1(int day) throws Exception {
        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                throw new Exception();
        }
    }
    public static void main(String[] args) {
          violation_kiss kiss = new violation_kiss();
          try{
              String str = kiss.weekday1(2);

              System.out.println(str);
          }
          catch (Exception e){
              e.printStackTrace();
          }

    }
}
