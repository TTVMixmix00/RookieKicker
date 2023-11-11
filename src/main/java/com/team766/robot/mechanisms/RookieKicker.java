package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.logging.Category;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;
import com.team766.logging.Category;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class RookieKicker extends Mechanism {
	private MotorController kickerMotor;
	
	private DutyCycleEncoder kickerEncoder;
	private static final double swingDownPosition = 0.5; // to change

	public RookieKicker() {
		loggerCategory = Category.MECHANISMS;
		kickerMotor = RobotProvider.instance.getMotor("kicker.kickerMotor");
		kickerEncoder = new DutyCycleEncoder(0);  // to change
		resetEncoder();
	}

	public void kick(double power) {
		checkContextOwnership();
		if(kickerEncoder.getAbsolutePosition() < swingDownPosition) {
			kickerMotor.set(power);
		} else {
			log("tried to kick too high!");
		}
	}

	public void resetEncoder(){
		checkContextOwnership();
		kickerEncoder.reset();
	}

	
}
