/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.BeltTransport;

/**
 * Add your docs here.
 */
public class Transport extends CommandBase {
    private final BeltTransport bT;

    public Transport(BeltTransport subsystem){
        bT = subsystem;
        addRequirements(bT);
    }

    @Override
    public void initialize(){
        bT.startTransport(Constants.transportSpeed);
    }

    @Override
    public void execute(){}

    @Override
    public void end(boolean interrupted){
        bT.stopTransport();
    }
}
