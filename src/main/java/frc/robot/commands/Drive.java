/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrain;

/**
 * Add your docs here.
 */
public class Drive extends CommandBase{
    private final DriveTrain m_dT; //creates a DriveTrain instantiation
    private final Joystick m_Joystick; //creates a joystick instantiation

    public Drive(DriveTrain dT, Joystick joystick){ //constructor
        m_dT = dT;
        m_Joystick = joystick;
        addRequirements(m_dT); //adds the drivetrain instantiation to the CommandScheduler
    }
    @Override
    public void initialize(){
        m_dT.setMaxSpeed(1); //Sets the max speed for the motors on initialization.
    }
    @Override
    public void execute(){
        m_dT.arcardeDrive(m_Joystick.getRawAxis(4), m_Joystick.getRawAxis(5)); 
        //sets the speed and rotation values to whatever the RawAxis is on the joysticks.
        //The direction of the joystick determines how the robot moves.
    }
}
