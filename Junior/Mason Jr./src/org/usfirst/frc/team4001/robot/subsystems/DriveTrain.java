package org.usfirst.frc.team4001.robot.subsystems;

import org.usfirst.frc.team4001.robot.ElectricalConstants;
import org.usfirst.frc.team4001.robot.NumericalConstants;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.interfaces.Potentiometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

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
		
		//drive!
		RobotDrive drive = new RobotDrive(leftMotor, rightMotor);
		
		
		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

