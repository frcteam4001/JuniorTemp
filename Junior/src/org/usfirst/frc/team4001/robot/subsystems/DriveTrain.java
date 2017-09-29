package org.usfirst.frc.team4001.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // motors	
	//motors
	private final Victor leftMotor;
	private final Victor rightMotor;
	
	//encoders
	private Encoder leftDriveEncoder;
	private Encoder rightDriveEncoder;
	
	public DriveTrain(){
		//Initialize motor
		leftMotor = new Victor(0);
		rightMotor = new Victor(1);
		
		//drive!!!
		RobotDrive drive = new RobotDrive(leftMotor, rightMotor);
		
		
		
	}
	
    @Override
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

