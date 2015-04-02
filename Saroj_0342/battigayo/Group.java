package battigayo;

import java.util.Scanner;

/**
 * Created by Xawroz on 4/2/2015.
 */
public class Group {
    int grp;
    public int selectGroup()
    {
        Scanner inp=new Scanner(System.in);

        System.out.println("Please enter the Group");
        grp=inp.nextInt();
        return grp;

    }
}
