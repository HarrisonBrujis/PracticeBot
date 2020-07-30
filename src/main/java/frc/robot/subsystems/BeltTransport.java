/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
/**
 * Add your docs here.
 */



public class BeltTransport extends SubsystemBase{
    SpeedControllerGroup leftTransport;
    SpeedControllerGroup rightTransport;

    public BeltTransport(){
        leftTransport = new SpeedControllerGroup(Constants.motortONE, Constants.motortTHREE); //sets left side motors to one object
        rightTransport = new SpeedControllerGroup(Constants.motortTWO, Constants.motortFOUR); //sets right side motors to one object
    }

    public void startTransport(double speed){ //sets motors to a certain speed
        leftTransport.set(speed);
        rightTransport.set(speed);
    }

    public void reverseTransport(double speed){ //made in case the transport needs to lose something
        leftTransport.set(-speed);
        rightTransport.set(-speed);
    }

    public void stopTransport(){ //stops the transport by setting the motors' speed to zero
        leftTransport.set(0);
        rightTransport.set(0);
    }

}

