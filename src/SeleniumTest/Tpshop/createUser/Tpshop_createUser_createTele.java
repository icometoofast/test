package SeleniumTest.Tpshop.createUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Tpshop_createUser_createTele {
    public String create_tele(){
        String tele = null;
        List teleList = new ArrayList();
        teleList.add("182");
        teleList.add("138");
        teleList.add("136");
        String time = String.valueOf(System.currentTimeMillis());
//        System.out.println(time);
        String timeCut = time.substring(5);
//        System.out.println(timeCut);
        Random random = new Random();
        int a = random.nextInt(2);
//        System.out.println(a);
        tele = teleList.get(a)+ timeCut;

        return tele;
    }

}
