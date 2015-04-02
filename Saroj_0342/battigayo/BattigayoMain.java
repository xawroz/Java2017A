package battigayo;

/**
 * Created by Xawroz on 4/2/2015.
 */
public class BattigayoMain {
    public static void main(String[] args) {
        System.out.println("Batti gayo application");
        Group group=new Group();
        int temp=group.selectGroup();
        Day day=new Day();
        day.selectDay();
        day.scheduleDisplay(temp);
    }
}
