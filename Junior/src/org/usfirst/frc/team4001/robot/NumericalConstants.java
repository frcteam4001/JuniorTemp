package org.usfirst.frc.team4001.robot;

public class NumericalConstants {

	//**************************************************************************
    //*************************** PID VALUES (DRIVE) ***************************
    //**************************************************************************
	
	//Competition
	public static final double pDrive 									 = 0.15;
	public static final double iDrive 									 = 0.005;
	public static final double dDrive 									 = 0.04;
	
	public static final double Drive_Scale 								 = 0.6;
		
	//**************************************************************************
    //**************************** PID VALUES (GYRO) ***************************
    //**************************************************************************
	
	//Competition
	public static final double pGyro 									 = 0.025;
	public static final double iGyro 									 = 0.00;
	public static final double dGyro 									 = 0.00;
	
	//**************************************************************************
    //************************* ULTRASONIC CALCULATIONS ************************
    //**************************************************************************
	
	public static final double distance_between_sensors					 = 28; //inches
	
	//The maximum reading difference, in inches, for the sensors to be considered fixed on the
	//surface. If the difference is greater, the sensors are fixed on different surfaces
	public static final double max_ultrasonic_reading_difference		 = 20; //inches
	
	//The magnitude of the angle at which the robot must turn when sensors are not pointing at
	//the same surface.
	public static final double blind_turn_angle							 = 15; //degrees
	
	//The maximum difference between the two ultrasonic readings that would be considered
	//"aligned"
	public static final double aligned_tolerance						 = 1; //inches
	
}
