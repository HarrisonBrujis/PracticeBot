/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Subsystem;
import frc.robot.Constants;

/**
 * Add your docs here.
 */
public class Intake implements Subsystem{

    public Intake(){}

    public void setIntakeSpeed(double speed){ //Sets intake to desired speed
        Constants.intakeMotor.set(speed);
    }
    public void stopIntake(){ //Stops intake by setting its speed to zero
        Constants.intakeMotor.set(0);
    }
}
