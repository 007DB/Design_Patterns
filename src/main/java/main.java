import com.Builder.LunchOrderBean;
import com.Builder.LunchOrderTelecop;

public class main {
    public static void main(String args []){
        /*telscope example*/
        LunchOrderTelecop lunchagain = new LunchOrderTelecop(" weat","mayo");

        System.out.println(lunchagain.getBread());
        System.out.println(lunchagain.getCondiments());}}



        /*bean example


        LunchOrderBean lunchtime = new LunchOrderBean();


        lunchtime.setBread("wheat");
        lunchtime.setCondiments("ketchup");
        lunchtime.setDrink("sprite");
        lunchtime.setMeat("meatloaf");

        System.out.println(lunchtime.getBread());
        System.out.println(lunchtime.getCondiments());
        System.out.println(lunchtime.getDrink());
        System.out.println(lunchtime.getMeat());/*




  }
  }/**/
