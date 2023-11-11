package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.logging.Category;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;
import com.team766.logging.Category;
import edu.wpi.first.wpilibj.DutyCycleEncoder;

public class RookieKicker extends Mechanism {
	private MotorController kickerMotor;
	// temp channel 												v
	private DutyCycleEncoder kickerEncoder = new DutyCycleEncoder(0);

	public RookieKicker() {
		loggerCategory = Category.MECHANISMS;
		kickerMotor = RobotProvider.instance.getMotor("kicker.kickerMotor");
		kickerEncoder.reset();
	}

	public void kick(double power) {
		checkContextOwnership();
		if(kickerEncoder.getAbsolutePosition() < /*idk*/) {
			kickerMotor.set(power);
		} else {
			log("tried to kick too high!");
		}
	}

	public void resetEncoder(){
		kickerEncoder.reset();
	}
}
