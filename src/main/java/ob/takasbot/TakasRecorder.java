package ob.takasbot;

import java.awt.*;
import static java.awt.event.InputEvent.*;
import static java.awt.event.KeyEvent.*;

public class TakasRecorder {

    Robot robot;

    public TakasRecorder() throws AWTException {
        this.robot = new Robot();
    }

    public static void main(String[] args) throws AWTException {
        new TakasRecorder().run();
    }

    private void run() {

        robot.mouseMove(520, 1090);
        mouseClick(BUTTON1_DOWN_MASK);
        robot.delay(2000);

        keyClick('O');
        keyClick('M');
        keyClick('E');
        keyClick('R');
        keyClick(VK_ENTER);
        tab(2);
    }

    private void tab(int count) {
        robot.keyPress(VK_META);
        for(int i = 0 ; i < count ; i ++){
            robot.keyPress(VK_TAB);
            robot.keyRelease(VK_TAB);
        }
        robot.keyRelease(VK_META);
    }

    private void save() {
        robot.keyPress(VK_META);
        robot.keyPress('S');
        robot.keyRelease('S');
        robot.keyRelease(VK_META);
    }

    public void mouseClick(int buttons){
        robot.mousePress(buttons);
        robot.mouseRelease(buttons);
    }

    public void keyClick(int keyCode){
        robot.keyPress(keyCode);
        robot.keyRelease(keyCode);
    }
}
