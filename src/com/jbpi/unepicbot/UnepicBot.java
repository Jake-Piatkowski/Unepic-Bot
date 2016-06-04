package com.jbpi.unepicbot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class UnepicBot {

	public void startGraveyardOverloadedRuns() {

		for (int times = 1; times <= 300; times++) {

			try {

				Thread.sleep(2000);
				Robot robot = new Robot();
				robot.setAutoDelay(10);
				robot.setAutoWaitForIdle(true);
				// Press Enter 3 times
				pressEnter3Times(robot);
				Thread.sleep(2000);
				// Press 1
				robot.keyPress(KeyEvent.VK_1);
				robot.keyRelease(KeyEvent.VK_1);
				robot.delay(500);
				Thread.sleep(3000);
				// Press 2
				robot.keyPress(KeyEvent.VK_2);
				robot.keyRelease(KeyEvent.VK_2);
				robot.delay(100);
				// Press Right Arrow and hold down for 3 s.
				robot.keyPress(KeyEvent.VK_RIGHT);
				Thread.sleep(3000);
				robot.keyRelease(KeyEvent.VK_RIGHT);
				// Press 3
				robot.keyPress(KeyEvent.VK_3);
				robot.keyRelease(KeyEvent.VK_3);
				robot.delay(500);
				// Press Enter 3 times
				pressEnter3TimesWithDelay(robot);
				// Press Esc
				Thread.sleep(1000);
				robot.keyPress(KeyEvent.VK_ESCAPE);
				robot.keyRelease(KeyEvent.VK_ESCAPE);
				robot.delay(500);
				// Press Down Arrow 7 times
				for (int i = 1; i <= 7; i++) {

					robot.keyPress(KeyEvent.VK_DOWN);
					robot.keyRelease(KeyEvent.VK_DOWN);
					robot.delay(100);
				}
				// Press Enter
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.delay(500);
				// Press Right Arrow
				robot.keyPress(KeyEvent.VK_RIGHT);
				robot.keyRelease(KeyEvent.VK_RIGHT);
				robot.delay(500);
				// Press Enter
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);
				robot.delay(500);
			}
			catch (AWTException e) {

				e.printStackTrace();
			}
			catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	private void pressEnter3Times(Robot robot) {

		for (int i = 1; i <= 3; i++) {

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(500);
		}
	}

	private void pressEnter3TimesWithDelay(Robot robot) throws InterruptedException {

		for (int i = 1; i <= 3; i++) {

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.delay(500);
			Thread.sleep(1000);
		}
	}
}
