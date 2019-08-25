package com.cacoalpano.autoclick;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.Random;

public class AutoClick {

    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot robot = new Robot();
        boolean a = true;
        while (a) {
            Random random = new Random();
            robot.mouseMove(random.nextInt(400), random.nextInt(400));
            Thread.sleep(5000);
            robot.mouseWheel(random.nextInt(4) - 2);
        }
    }
}
