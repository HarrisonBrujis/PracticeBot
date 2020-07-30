/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Intake;

/**
 * Add your docs here.
 */
public class IntakeBall extends CommandBase {
    private final Intake intakeDevice;

    public IntakeBall(Intake subsystem) {
        intakeDevice = subsystem;
        addRequirements(intakeDevice);
    }

    @Override
    public void initialize() {
        intakeDevice.setIntakeSpeed(Constants.intakeSpeed);
    }
    @Override
    public void execute(){}
    
    @Override
    public void end(boolean interuptted){
        intakeDevice.stopIntake();
    }
}
