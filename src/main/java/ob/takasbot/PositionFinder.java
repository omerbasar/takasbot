package ob.takasbot;

import java.awt.*;

public class PositionFinder {

    public static void main(String args[]) throws InterruptedException{
        Point previous = new Point(0,0);
        Point latest = new Point(0, 0);

        while(true){
            Point current = MouseInfo.getPointerInfo().getLocation();

            if(current.equals(previous) && !current.equals(latest)){
                System.out.println(current);
                latest = current;
            }
            previous = current;
            System.out.println("Sleeping");
            Thread.sleep(500);
        }
    }
}
