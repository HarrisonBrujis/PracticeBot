/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class DriveTrain extends SubsystemBase{
  SpeedControllerGroup leftMotors;
  SpeedControllerGroup rightMotors;
  private final DifferentialDrive dT; //Sets up DifferentialDrive object

  private boolean invert;

  public DriveTrain(){
    leftMotors = new SpeedControllerGroup(Constants.motorFL, Constants.motorBL);//Puts the left side motors into one SpeedControllerGroup
    rightMotors = new SpeedControllerGroup(Constants.motorFR, Constants.motorBR);//Puts the rightside motors into one SpeedControllerGroup
    dT = new DifferentialDrive(leftMotors, rightMotors);

    invert = false; //set to true if we want inverted controls for the weirdos.
  }
  public void arcardeDrive(double forward, double rotation){
    if(invert){ //if inverted boolean is set to true, the controls are inverted.
      dT.arcadeDrive(-forward, -rotation);
    }
    else{
      dT.arcadeDrive(forward, rotation);
    }
  }
  public void setMaxSpeed(double speed) { //sets the maximum speed of the drivetrain to a desired number
    dT.setMaxOutput(speed);
  }
}

