// RobotBuilder Version: 3.1
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package frc.robot.subsystems;


import frc.robot.commands.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends SubsystemBase {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
private WPI_VictorSPX victorSPX3;
private WPI_VictorSPX victorSPX4;
private SpeedControllerGroup leftWheels;
private WPI_VictorSPX victorSPX1;
private WPI_VictorSPX victorSPX2;
private SpeedControllerGroup rightWheels;
private DifferentialDrive differentialDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    /**
    *
    */
    public DriveTrain() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
victorSPX3 = new WPI_VictorSPX(14);
 
 

victorSPX4 = new WPI_VictorSPX(15);
 
 

SpeedControllerGroup leftWheels = new SpeedControllerGroup(victorSPX3, victorSPX4  );
 addChild("LeftWheels",leftWheels);
 


SpeedControllerGroup rightWheels = new SpeedControllerGroup(victorSPX1, victorSPX2  );
 addChild("RightWheels",rightWheels);
 

differentialDrive1 = new DifferentialDrive(leftWheels, rightWheels);
 addChild("Differential Drive 1",differentialDrive1);
 differentialDrive1.setSafetyEnabled(true);
differentialDrive1.setExpiration(0.1);
differentialDrive1.setMaxOutput(1.0);



    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run

    }

    @Override
    public void simulationPeriodic() {
        // This method will be called once per scheduler run when in simulation

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    


}

