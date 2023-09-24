package com.team766.robot;

import com.team766.robot.mechanisms.*;

public class Robot {
	// Declare mechanisms here

	public static Kicker kicker;

	public static void robotInit() {
		// Initialize mechanisms here

		kicker = new Kicker(0.1);
	}
}
