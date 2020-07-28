/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static CANSparkMax motorFL = new CANSparkMax(0, MotorType.kBrushless); //Creates a CANSparkMax motor object which is set to "brushless".
    public static CANSparkMax motorFR = new CANSparkMax(1, MotorType.kBrushless); //Each motor has a temporary ID number.
    public static CANSparkMax motorBL = new CANSparkMax(2, MotorType.kBrushless);
    public static CANSparkMax motorBR = new CANSparkMax(3, MotorType.kBrushless);

    public static CANSparkMax intakeMotor = new CANSparkMax(4, MotorType.kBrushless); //intake motor, temporary id number

    public static double intakeSpeed = 1;



}
