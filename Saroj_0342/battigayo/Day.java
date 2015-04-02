package battigayo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Xawroz on 4/2/2015.
 */
public class Day {

    int days;
    public void selectDay()
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Please enter the Day");
        days=inp.nextInt();

    }
    public void scheduleDisplay(int grp)
    {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "Sunday");
        map.put(2, "Monday");
        map.put(3, "Tuesday");
        map.put(4, "Wednesday");
        map.put(5, "Thursday");
        map.put(6, "Friday");
        map.put(7, "Saturday");

        int schedule=(days+grp)-1;
        if (schedule>7)
        {
            schedule=schedule-7;
        }
        System.out.println("Schedule"+schedule);
        switch(schedule)
        {
            case 1:{
                System.out.println(map.get(days));
                System.out.println("09:00-13:00\n" + "17:00-22:00");
                break;
            }
            case 2:{
                System.out.println(map.get(days));
                System.out.println("11:00-16:00\n" + "19:30-23:30");
                break;
            }
            case 3:{
                System.out.println(map.get(days));
                System.out.println("10:00-14:30\n" + "18:00-22:30");
                break;
            }
            case 4:{
                System.out.println(map.get(days));
                System.out.println("07:00-12:00\n" + "16:00-21:00");
                break;
            }
            case 5:{
                System.out.println(map.get(days));
                System.out.println("06:00-11:00\n" + "14:30-19:30");
                break;
            }
            case 6:{
                System.out.println(map.get(days));
                System.out.println("05:00-10:00\n" + "13:00-18:00");
                break;
            }
            case 7:{
                System.out.println(map.get(days));
                System.out.println("04:00-09:00\n" + "12:00-17:00");
                break;
            }
        }


    }
}
