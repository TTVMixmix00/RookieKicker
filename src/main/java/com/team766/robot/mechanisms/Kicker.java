package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;

import com.team766.hal.*;


public class Kicker extends Mechanism {

	private static final String motorConfigName = "kickerMotor";
	private MotorController kickerMotor;
	private final double constantKickerPower;
	

	/*
	 * Default constructor. It initializes the motor. It sets the constant motor power that we want to use every time we hold the button to go. I don't know why we would even have any other constructor.
	 * 
	 * This is really easy. I don't know why you would need to comment this.
	 * 
	 * @param constantKickerPower the constant power to set the motor to every time the button is pressed
	 * @return nothing because it does basically nothing
	 * @throws nothing because it does basically nothing
	 */

	public Kicker(double constantKickerPower) {
		kickerMotor = RobotProvider.instance.getMotor(motorConfigName);

		this.constantKickerPower = constantKickerPower;
	}

	/*
	 * Kicks. I don't know why you would need to comment this.
	 * 
	 * So basically it sets the motor to the constant power that we set in the constructor.
	 * 
	 * This is really easy. I don't know why you would need to comment this.
	 * 
	 * @param power the power to set the motor to
	 * @return nothing because it does basically nothing
	 * @throws nothing because it does basically nothing
	 */

	public void kick() {
		checkContextOwnership();

		kickerMotor.set(constantKickerPower);
	}

}
